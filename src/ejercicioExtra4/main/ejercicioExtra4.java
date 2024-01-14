package ejercicioExtra4.main;

import ejercicioExtra4.entities.*;
import java.util.ArrayList;

public class ejercicioExtra4 {

    public static void main(String[] args) {

    //Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
    //que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.

        ArrayList<Persona> listaPersonas = new ArrayList<>();

        Profesor profe = new Profesor("Andrés","Guzmán", 76812, "Casado",2020, 5,"Informática");
        Personal pds = new Personal("Rubén", "Soto", 71253, "Divorciado", 2010, 3,"Biblioteca");
        Estudiante e = new Estudiante("Ale", "Haro", 83911, "Soltera", "QC+Automation");

        listaPersonas.add(profe);
        listaPersonas.add(e);
        listaPersonas.add(pds);

        for (Persona persona : listaPersonas) {
            if (persona instanceof Profesor) {
                System.out.println("--------------PROFESOR--------------");
                Profesor profesor = (Profesor) persona;
                System.out.println(profesor);
                profesor.cambioEstadoCivil();
                profesor.reasignacionDespacho();
                profesor.reasignacionDepartamento();
                System.out.println(profesor);
            }else if (persona instanceof Estudiante) {
                System.out.println("--------------ESTUDIANTE-------------");
                Estudiante estudiante = (Estudiante) persona;
                System.out.println(estudiante);
                estudiante.cambioEstadoCivil();
                estudiante.nuevaMatricula();
                System.out.println(estudiante);
            }else{
                System.out.println("--------------PERSONAL DE SERVICIO--------------");
                Personal personal = (Personal) persona;
                System.out.println(personal);
                personal.cambioEstadoCivil();
                personal.reasignacionDespacho();
                personal.trasladoSeccion();
                System.out.println(personal);
            }
        }
    }
}
