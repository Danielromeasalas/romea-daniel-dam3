package daniel.dao;

import daniel.beans.Soc;
import daniel.motores.MotorSQL;

import java.util.ArrayList;

public class SocDAOImpl extends AbstractDAO<Soc> {


    public SocDAOImpl(MotorSQL motorSQL) {
        super(motorSQL);
    }

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


    //Metodos
    @Override
    public void add(Soc soc) {
        System.out.println(soc.getNombre() + " anyadido");
    }

    @Override
    public void update(Soc soc) {
        System.out.println(soc.getNombre() + " actualziado");
    }

    @Override
    public Soc find(int id) {
        return null;
    }

    @Override
    public ArrayList<Soc> findAll() {
        return null;
    }
}

