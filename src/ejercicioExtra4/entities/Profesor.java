package ejercicioExtra4.entities;

public class Profesor extends Empleado {

    /*Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
    pertenecen (lenguajes, matemáticas, arquitectura, ...).*/

    //Atributos

    protected String departamento;

    //Constructores

    public Profesor(String nombre, String apellido, int ID, String estadoCivil, int añoIncorporacion, int numDespacho, String depto) {
        super(nombre, apellido, ID, estadoCivil, añoIncorporacion, numDespacho);
        this.departamento = depto;
    }

    //Cambio estado civil

    @Override
    public void cambioEstadoCivil() {

        System.out.println("Ingrese nuevo estado civil del Profesor: " + getNombre());
        String estadoCivil = reader.next();
        setEstadoCivil(estadoCivil);
    }

    //Reasignación de despacho

    @Override
    public void reasignacionDespacho() {

        System.out.println("Ingrese nuevo despacho del Profesor: " + getNombre());
        int nuevoDespacho = reader.nextInt();
        this.numDespacho = nuevoDespacho;

    }

    //Cambio de departamento de un profesor

    public void reasignacionDepartamento() {

        System.out.println("Ingrese nuevo departamento del Profesor: " + getNombre());
        String nuevoDepartamento = reader.next();
        this.departamento = nuevoDepartamento;
    }

    //toString

    @Override
    public String toString() {

        return super.toString() +
                " departamento='" + departamento + '\'';
    }
}
