package daniel.dao;

import daniel.beans.Incidente;
import daniel.motores.MotorSQL;

import java.util.ArrayList;

public class IncidenteDAOImpl extends AbstractDAO<Incidente>{

    public IncidenteDAOImpl(MotorSQL motorSQL) {
        super(motorSQL);
    }

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


    @Override
    public void add(Incidente object) {

    }

    @Override
    public void update(Incidente object) {

    }

    @Override
    public Incidente find(int id) {
        return null;
    }

    @Override
    public ArrayList<Incidente> findAll() {
        return null;
    }

    public ArrayList<Incidente> findBySoc(int id_soc) {
        return null;
    }

    public Incidente findWithInforme(int id_informe) {
        return null;
    }
}
