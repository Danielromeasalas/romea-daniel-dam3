package src.examen.romea.daniel.dao;

import src.examen.romea.daniel.beans.Incidente;
import src.examen.romea.daniel.beans.InformeIncidente;
import src.examen.romea.daniel.beans.Soc;
import src.examen.romea.daniel.motores.MotorFactory;
import src.examen.romea.daniel.motores.MotorSQL;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Objects;

public class IncidenteDAOImpl extends AbstractDAO<Incidente> {

    private static final String SQL_ADD_INCIDENTE =
            "INSERT INTO incidentes (codigo_incidente, tipo_incidente, fecha_deteccion, estado, fk_soc_id) VALUES (?, ?, ?, ?, ?)";

    private static final String SQL_UPDATE_INCIDENTE =
            "UPDATE incidentes SET codigo_incidente=?,  tipo_incidente=?, fecha_deteccion=?, estado=?, fk_soc_id=? WHERE id = ?";

    private static final String SQL_FIND_INCIDENTE =
            "SELECT * FROM incidentes WHERE id = ?";

    private static final String SQL_FIND_ALL_INCIDENTE =
            "SELECT * FROM incidentes ORDER BY id";

    private static final String SQL_FIND_BY_SOC =
            "SELECT * FROM incidentes WHERE fk_soc_id = ? ORDER BY id";

    private static final String SQL_FIND_WITH_INFORME =
            "SELECT * FROM incidentes INNER JOIN informes_incidente ON incidentes.id = informes_incidente.fk_incidente_id WHERE informes_incidente.id = ?";


          /*  "SELECT M.id, M.codigo_incidente, M.tipo_incidente, M.fecha_deteccion, M.estado, M.fk_soc_id " +
                    " I.id, I.malware_detectado, I.nivel_seguridad, I.conclusion FROM incidentes M " +
                    "INNER JOIN informes_incidentes I ON M.id = I.fk_informe_id WHERE M.id = ? ORDER BY M.id";  */


    //Comprobacion y constructor
    public void check() {
        try {
            motorSQL.connect();
            if (motorSQL.conn != null &&
                    !motorSQL.conn.isClosed()) {
                System.out.println("CONEXION OK");
            }
        } catch (Exception e) {
            printError(e);
        } finally {
            motorSQL.close();
        }
    }

    public IncidenteDAOImpl(MotorSQL motorSQL) {
        super(motorSQL);
    }

    //Metodos

    private Incidente mapMuestra(ResultSet rs) throws Exception {

        Incidente newIncidente = new Incidente();

        newIncidente.setId(rs.getInt("id"));
        newIncidente.setCodigoIncidente(rs.getInt("codigo_incidente"));
        newIncidente.setTipoIncidente(rs.getString("tipo_incidente"));
        newIncidente.setFechaDeteccion(rs.getString("fecha_deteccion"));
        newIncidente.setEstado(rs.getString("estado"));

        return newIncidente;
    }

    @Override
    public void add(Incidente incidente) {

        try{
            motorSQL.connect();
            motorSQL.prepare(SQL_ADD_INCIDENTE);
            motorSQL.getPs().setInt(1, incidente.getCodigoIncidente());
            motorSQL.getPs().setString(2, incidente.getTipoIncidente());
            motorSQL.getPs().setString(3, incidente.getFechaDeteccion());
            motorSQL.getPs().setString(4, incidente.getEstado());
            motorSQL.getPs().setInt(5, incidente.getSoc().getId());

            int rows = motorSQL.executeUpdate();
            System.out.println(
                    "INSERTADOS: " +
                            rows);

        }catch (Exception e){
            printError(e);
        }finally {
            motorSQL.close();
        }

    }

    @Override
    public void update(Incidente incidente) {

        try{
            motorSQL.connect();
            motorSQL.prepare(SQL_UPDATE_INCIDENTE);
            motorSQL.getPs().setInt(1, incidente.getCodigoIncidente());
            motorSQL.getPs().setString(2, incidente.getTipoIncidente());
            motorSQL.getPs().setString(3, incidente.getFechaDeteccion());
            motorSQL.getPs().setString(4, incidente.getEstado());
            motorSQL.getPs().setInt(5, incidente.getSoc().getId());
            motorSQL.getPs().setInt(6, incidente.getId());

            int rows = motorSQL.executeUpdate();
            System.out.println("ACTUALIZADOS: " + rows);

        }catch (Exception e){
            printError(e);
        }finally {
            motorSQL.close();
        }

    }

    @Override
    public Incidente find(int id) {

        Incidente newIncidente = null;

        try{

            motorSQL.connect();
            motorSQL.prepare(SQL_FIND_INCIDENTE);
            motorSQL.getPs().setInt(1, id);

            ResultSet rs = motorSQL.executeQuery();
            if(rs.next()){
                newIncidente = mapMuestra(rs);
            }

        }catch (Exception e){
            printError(e);
        }finally {
            motorSQL.close();
        }

        return newIncidente;

    }

    public ArrayList<Incidente> findBySoc(Soc soc) {
        ArrayList<Incidente> incidentes = new ArrayList<>();
        int id_soc = soc.getId();

        try{
            motorSQL.connect();
            motorSQL.prepare(SQL_FIND_BY_SOC);
            motorSQL.getPs().setInt(1, id_soc);

            ResultSet rs = motorSQL.executeQuery();

            while(rs.next()){
                incidentes.add(mapMuestra(rs));
            }

        }catch (Exception e){
            printError(e);
        }finally {
            motorSQL.close();
        }

        return incidentes;
    }

    @Override
    public ArrayList<Incidente> findAll() {

        ArrayList<Incidente> incidentes = new ArrayList<>();

        try{
            motorSQL.connect();
            motorSQL.prepare(SQL_FIND_ALL_INCIDENTE);
            ResultSet rs = motorSQL.executeQuery();
            while(rs.next()){
                incidentes.add(mapMuestra(rs));
            }

        }catch (Exception e){
            printError(e);
        }finally {
            motorSQL.close();
        }

        return incidentes;
    }

    public Incidente findWithInforme(int idInforme) {

        Incidente incidente = new Incidente();

        try{
            motorSQL.connect();
            motorSQL.prepare(SQL_FIND_WITH_INFORME);
            motorSQL.getPs().setInt(1, idInforme);
            ResultSet rs = motorSQL.executeQuery();
            if(rs.next()){
                incidente = mapMuestra(rs);
            }


        }catch (Exception e){
            printError(e);
        }finally {
            motorSQL.close();
        }

        return incidente;
    }

    public static void main(String[] args){
        IncidenteDAOImpl incidenteDAO = new IncidenteDAOImpl(MotorFactory.create(MotorFactory.POSTGRE));
    }
}

