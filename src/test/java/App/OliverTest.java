package App;

import org.junit.Assert;
import org.junit.Test;

public class OliverTest {

    @Test
    public void test(){
        var oliver = Oliver.getInstance();

        oliver.registrarAutor(1, "Jose", "06/05/1950");
        oliver.registrarAutor(2, "Jorge", "06/05/1951");
        oliver.registrarAutor(3, "Anchony", "06/05/1952");

        oliver.registrarAlumno(1, "Pedro", "pedro@gmail.com",998444499);
        oliver.registrarAlumno(2, "Alumnd", "alumnd@gmail.com",998444499);
        oliver.registrarAlumno(3, "Jose", "jose@gmail.com",998444499);
        oliver.registrarAlumno(4,"Jesus", "jesus@gmail.com",998444499);
        oliver.registrarAlumno(5,"Alonso", "alonso@gmail.com",998444499);

        oliver.registrarLibro(1, "Data Analytics", 2015);
        oliver.registrarLibro(2, "Data Science", 1998);

        Assert.assertTrue(oliver.vincularEstudianteLibro(2, 2));
        Assert.assertTrue(oliver.desvincularEstudianteLibro(2,2));


        Assert.assertTrue(oliver.vincularEstudianteLibro(1, 1));
        Assert.assertTrue(oliver.actualizarLibrosAutor(1, 1, 5));
    }

}
