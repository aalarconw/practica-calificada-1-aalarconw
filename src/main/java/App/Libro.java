package App;

public class Libro {

    private final String nombre;
    private final Integer anio;


    public Libro(String nombre, Integer anio) {
        this.nombre = nombre;
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getAnio() {
        return anio;
    }

}
