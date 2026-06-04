package daniel.dao;

import daniel.beans.InformeIncidente;
import daniel.motores.MotorSQL;

import java.util.ArrayList;

public class InforeIncidenteDAOImpl extends AbstractDAO <InformeIncidente> {

    public InforeIncidenteDAOImpl(MotorSQL motorSQL) {
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
    public void add(InformeIncidente informeIncidente) {
        System.out.println("Informe de incidente anyadido");
    }

    @Override
    public void update(InformeIncidente informeIncidente) {
        System.out.println("Informe de incidente actualziado");
    }

    @Override
    public InformeIncidente find(int id) {
        return null;
    }

    @Override
    public ArrayList<InformeIncidente> findAll() {
        return null;
    }

}
