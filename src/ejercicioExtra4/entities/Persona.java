package ejercicioExtra4.entities;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Scanner;


abstract public class Persona {

    Scanner reader = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    /*Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
    identificación y su estado civil.*/

    //Atributos

    private String nombre;
    private String apellido;
    private int ID;
    private String estadoCivil;

    //Constructores

    public Persona() {
    }

    public Persona(String nombre, String apellido, int ID, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
        this.estadoCivil = estadoCivil;
    }

    //Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    //Método propio | Cambio del estado civil de una persona.

    abstract public void cambioEstadoCivil();

    //toString

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", ID=" + ID +
                ", estadoCivil='" + estadoCivil + '\'';
    }
}
