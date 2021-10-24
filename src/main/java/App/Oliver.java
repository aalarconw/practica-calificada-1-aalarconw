package App;

import java.util.HashMap;
import java.util.Map;

public class Oliver {

    private static Oliver instance;

    private Map<Integer, Autor> autor = new HashMap<>();
    private Map<Integer, Estudiante> estudiante = new HashMap<>();
    private Map<Integer, Libro> libros = new HashMap<>();

    private Map<Integer, HashMap<Integer, Integer>> librosAutor = new HashMap<>();
    private Map<Integer, HashMap<Integer, Boolean>> librosEstudiante = new HashMap<>();

    private Oliver(){

    }

    public void registrarAutor(Integer id, String nombre, String fnacimiento){
        autor.put(id, new Autor(nombre, fnacimiento));
    }

    public void registrarAlumno(Integer id, String nombre, String correo, Integer telefono){
        estudiante.put(id, new Estudiante(nombre, correo,telefono));
    }

    public void registrarLibro(Integer id, String nombre, Integer anio){
        libros.put(id, new Libro(nombre, anio));
    }

    public boolean actualizarLibrosAutor(Integer idLibro, Integer idAutor, Integer stock){

        librosAutor.computeIfAbsent(idLibro, k -> new HashMap<Integer, Integer>());
        librosAutor.get(idLibro).put(idAutor, stock);
        var estudianteLibro = librosEstudiante.get(idLibro);
        for (Map.Entry<Integer, Boolean> entry : estudianteLibro.entrySet()) {
            if(entry.getValue()) estudiante.get(entry.getKey()).notificar();
        }
        return true;
    }

    public boolean vincularEstudianteLibro(Integer idEstudiante, Integer idLibro){
        librosEstudiante.computeIfAbsent(idLibro, k -> new HashMap<Integer, Boolean>());
        librosEstudiante.get(idLibro).put(idEstudiante, true);
        return true;
    }

    public boolean desvincularEstudianteLibro(Integer idEstudiante, Integer idLibro){
        librosEstudiante.get(idLibro).put(idEstudiante, false);
        return true;
    }



    public static Oliver getInstance() {
        if(instance == null){
            instance = new Oliver();
        }
        return instance;
    }

}
