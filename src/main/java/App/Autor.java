package App;

public class Autor {

    private final String nombre;
    private final String fnacimiento;

    public Autor(String nombre, String fnacimiento) {
        this.nombre = nombre;
        this.fnacimiento = fnacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstrellas() {
        return fnacimiento;
    }

}
