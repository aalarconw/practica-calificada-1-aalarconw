package App;

import java.util.logging.Logger;

public class Estudiante {

    private static Logger logger = Logger.getLogger(Estudiante.class.getName());

    private final String nombre;
    private final String correo;
    private final Integer telefono;

    public Estudiante(String nombre, String correo, Integer telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void notificar(){
        logger.info("Se le notificó al usuario por correo...");
    }
}
