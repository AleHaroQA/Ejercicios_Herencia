package ejercicioExtra4.entities;

import java.io.IOException;

public class Personal extends Empleado {

    /* Sobre el personal de servicio, hay que conocer a qué sección están asignados
    (biblioteca, decanato, secretaría, ...).*/

    //Atributos

    protected String seccion;

    //Constructor

    public Personal(String nombre, String apellido, int ID, String estadoCivil, int añoIncorporacion, int numDespacho, String seccion) {
        super(nombre, apellido, ID, estadoCivil, añoIncorporacion, numDespacho);
        this.seccion = seccion;
    }

    //Cambio estado civil

    @Override
    public void cambioEstadoCivil() {

        System.out.println("Ingrese nuevo estado civil del Empleado " + getNombre());
        String estadoCivil = reader.next();
        setEstadoCivil(estadoCivil);
    }

    //Reasignación de despacho

    @Override
    public void reasignacionDespacho() {

        System.out.println("Ingrese nuevo despacho del Empleado: " + getNombre());
        int nuevoDespacho = reader.nextInt();
        this.numDespacho = nuevoDespacho;
    }

    //Traslado de sección de un empleado del personal de servicio.

    public void trasladoSeccion() {

        System.out.println("Ingrese nuevo departamento del Empleado: " + getNombre());
        try {
            String nuevaSeccion = br.readLine();
            this.seccion = nuevaSeccion;
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    //toString

    @Override
    public String toString() {
        return super.toString() +
                " seccion='" + seccion + '\'';


    }
}
