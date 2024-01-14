package ejercicioExtra4.entities;

abstract public class Empleado extends Persona{

    /*Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
    incorporación a la facultad y qué número de despacho tienen asignado.*/

    //Atributos

    protected int añoIncorporacion;
    protected int numDespacho;

    //Constructores

    public Empleado(String nombre, String apellido, int ID, String estadoCivil, int añoIncorporacion, int numDespacho) {
        super(nombre, apellido, ID, estadoCivil);
        this.añoIncorporacion = añoIncorporacion;
        this.numDespacho = numDespacho;
    }

    //Reasignación de despacho a un empleado.

    abstract public void reasignacionDespacho();

    //toString

    @Override
    public String toString() {
        return super.toString() +
        " añoIncorporacion=" + añoIncorporacion +
                ", numDespacho=" + numDespacho;
    }
}
