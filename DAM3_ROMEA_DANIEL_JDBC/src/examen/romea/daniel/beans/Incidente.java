package daniel.beans;

public class Incidente {

    private int id;
    private int codigoCaso;
    private String tipoMuestra;
    private String fechaRecogida;
    private String estadoCustodia;
    private Soc soc;

    public Incidente() {
    }

    public Incidente(int codigoCaso, String tipoMuestra, String fechaRecogida, String estadoCustodia, Soc soc) {
        this.codigoCaso = codigoCaso;
        this.tipoMuestra = tipoMuestra;
        this.fechaRecogida = fechaRecogida;
        this.estadoCustodia = estadoCustodia;
        this.soc = soc;
    }

    public Incidente(int id, int codigoCaso, String tipoMuestra, String fechaRecogida, String estadoCustodia, Soc soc) {
        this.id = id;
        this.codigoCaso = codigoCaso;
        this.tipoMuestra = tipoMuestra;
        this.fechaRecogida = fechaRecogida;
        this.estadoCustodia = estadoCustodia;
        this.soc = soc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigoCaso() {
        return codigoCaso;
    }

    public void setCodigoCaso(int codigoCaso) {
        this.codigoCaso = codigoCaso;
    }

    public String getTipoMuestra() {
        return tipoMuestra;
    }

    public void setTipoMuestra(String tipoMuestra) {
        this.tipoMuestra = tipoMuestra;
    }

    public String getFechaRecogida() {
        return fechaRecogida;
    }

    public void setFechaRecogida(String fechaRecogida) {
        this.fechaRecogida = fechaRecogida;
    }

    public String getEstadoCustodia() {
        return estadoCustodia;
    }

    public void setEstadoCustodia(String estadoCustodia) {
        this.estadoCustodia = estadoCustodia;
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
                ", codigoCaso=" + codigoCaso +
                ", tipoMuestra='" + tipoMuestra + '\'' +
                ", fechaRecogida='" + fechaRecogida + '\'' +
                ", estadoCustodia='" + estadoCustodia + '\'' +
                ", soc=" + soc +
                '}';
    }
}
