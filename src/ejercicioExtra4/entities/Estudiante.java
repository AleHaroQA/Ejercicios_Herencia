package ejercicioExtra4.entities;

public class Estudiante extends Persona{

    /* En cuanto a los estudiantes, se requiere almacenar el curso en el que están
    matriculados.*/

    //Atributos

    protected String curso;

    //Constructores

    public Estudiante(String nombre, String apellido, int ID, String estadoCivil, String curso) {
        super(nombre, apellido, ID, estadoCivil);
        this.curso = curso;
    }

    //Cambio estado civil

    @Override
    public void cambioEstadoCivil() {

        System.out.println("Ingrese nuevo estado civil del Estudiante: " + getNombre());
        String estadoCivil = reader.next();
        setEstadoCivil(estadoCivil);
    }

    //Matriculación de un estudiante en un nuevo curso.

    public void nuevaMatricula() {

        System.out.println("Ingrese nuevo curso del Estudiante: " + getNombre());
        String nuevoCurso = reader.next();
        this.curso = nuevoCurso;
    }

    //toString

    @Override
    public String toString() {
        return  super.toString() +
                " curso='" + curso + '\'';
    }
}
