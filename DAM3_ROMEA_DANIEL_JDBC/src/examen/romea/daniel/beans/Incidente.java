package src.examen.romea.daniel.beans;

public class Incidente {

    private int id;
    private int codigoIncidente;
    private String tipoIncidente;
    private String fechaDeteccion;
    private String estado;
    private Soc soc;

    public Incidente() {
    }

    public Incidente(int codigoIncidente, String tipoIncidente, String fechaDeteccion, String estado, Soc soc) {
        this.codigoIncidente = codigoIncidente;
        this.tipoIncidente = tipoIncidente;
        this.fechaDeteccion = fechaDeteccion;
        this.estado = estado;
        this.soc = soc;
    }

    public Incidente(int id, int codigoIncidente, String tipoIncidente, String fechaDeteccion, String estado, Soc soc) {
        this.id = id;
        this.codigoIncidente = codigoIncidente;
        this.tipoIncidente = tipoIncidente;
        this.fechaDeteccion = fechaDeteccion;
        this.estado = estado;
        this.soc = soc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigoIncidente() {
        return codigoIncidente;
    }

    public void setCodigoIncidente(int codigoIncidente) {
        this.codigoIncidente = codigoIncidente;
    }

    public String getTipoIncidente() {
        return tipoIncidente;
    }

    public void setTipoIncidente(String tipoIncidente) {
        this.tipoIncidente = tipoIncidente;
    }

    public String getFechaDeteccion() {
        return fechaDeteccion;
    }

    public void setFechaDeteccion(String fechaDeteccion) {
        this.fechaDeteccion = fechaDeteccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Soc getSoc() {
        return soc;
    }

    public void setSoc(Soc soc) {
        this.soc = soc;
    }

    @Override
    public String toString() {
        return "Incidente{" +
                "id=" + id +
                ", codigoIncidente=" + codigoIncidente +
                ", tipoIncidente='" + tipoIncidente + '\'' +
                ", fechaDetencion='" + fechaDeteccion + '\'' +
                ", estado='" + estado + '\'' +
                ", soc=" + soc +
                '}';
    }
}

