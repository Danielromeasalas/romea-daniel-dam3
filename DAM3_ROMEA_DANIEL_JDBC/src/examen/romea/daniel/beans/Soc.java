package src.examen.romea.daniel.beans;

public class Soc {

    private int id;
    private String nombre;
    private String pais;
    private int nivel_seguridad;

    public Soc() {
    }

    public Soc(String nombre, String pais, int nivel_seguridad) {
        this.nombre = nombre;
        this.pais = pais;
        this.nivel_seguridad = nivel_seguridad;
    }

    public Soc(int id, String nombre, String pais, int nivel_seguridad) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
        this.nivel_seguridad = nivel_seguridad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNivel_seguridad() {
        return nivel_seguridad;
    }

    public void setNivel_seguridad(int nivel_seguridad) {
        this.nivel_seguridad = nivel_seguridad;
    }

    @Override
    public String toString() {
        return "Soc{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", nivel_seguridad=" + nivel_seguridad +
                '}';
    }
}
