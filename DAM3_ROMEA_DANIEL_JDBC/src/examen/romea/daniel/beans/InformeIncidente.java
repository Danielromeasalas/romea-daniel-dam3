package src.examen.romea.daniel.beans;

public class InformeIncidente {

    private int id;
    private boolean malwareDetectado;
    private int nivelSeguridad;
    private String conclusion;

    public InformeIncidente() {
    }

    public InformeIncidente(boolean malwareDetectado, int nivelSeguridad, String conclusion) {
        this.malwareDetectado = malwareDetectado;
        this.nivelSeguridad = nivelSeguridad;
        this.conclusion = conclusion;
    }

    public InformeIncidente(int id, boolean malwareDetectado, int nivelSeguridad, String conclusion) {
        this.id = id;
        this.malwareDetectado = malwareDetectado;
        this.nivelSeguridad = nivelSeguridad;
        this.conclusion = conclusion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isMalwareDetectado() {
        return malwareDetectado;
    }

    public void setMalwareDetectado(boolean malwareDetectado) {
        this.malwareDetectado = malwareDetectado;
    }

    public int getNivelSeguridad() {
        return nivelSeguridad;
    }

    public void setNivelSeguridad(int nivelSeguridad) {
        this.nivelSeguridad = nivelSeguridad;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    @Override
    public String toString() {
        return "InformeIncidente{" +
                "id=" + id +
                ", malwareDetectado=" + malwareDetectado +
                ", nivelSeguridad=" + nivelSeguridad +
                ", conclusion='" + conclusion + '\'' +
                '}';
    }
}
