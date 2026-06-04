package src.examen.romea.daniel;

import src.examen.romea.daniel.beans.Incidente;
import src.examen.romea.daniel.beans.InformeIncidente;
import src.examen.romea.daniel.beans.Soc;
import src.examen.romea.daniel.dao.IncidenteDAOImpl;
import src.examen.romea.daniel.motores.MotorFactory;

public class Main {
    public static void main(String[] args) {

        IncidenteDAOImpl incidenteDao = new IncidenteDAOImpl(MotorFactory.create(MotorFactory.POSTGRE));

        Soc soc = new Soc(1, "NOMBRE", "PAIS", 10);
        InformeIncidente informe = new InformeIncidente();
        Incidente newIncidente = new Incidente(6, 1213, "TipoIncidente", "01/02/2026", "Estado", soc);

        incidenteDao.add(newIncidente);
        incidenteDao.update(newIncidente);
        System.out.println( incidenteDao.find(2) );
        System.out.println( incidenteDao.findAll() );
        System.out.println( incidenteDao.findBySoc(soc) );
        System.out.println( incidenteDao.findWithInforme(2));


    }
}