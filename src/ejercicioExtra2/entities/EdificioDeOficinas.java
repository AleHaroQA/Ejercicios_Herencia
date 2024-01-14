package ejercicioExtra2.entities;

import java.util.Scanner;



public class EdificioDeOficinas extends Edificio{

    //Atributos

    //número de oficinas, cantidad de personas por oficina y número de pisos.

    private int numOficinas;
    private int numPersonas;
    private int numPisos;

    //Constructores

    public EdificioDeOficinas(double alto, double largo, double ancho, int numOficinas, int numPersonas, int numPisos) {
        super(alto, largo, ancho);
        this.numOficinas = numOficinas;
        this.numPersonas = numPersonas;
        this.numPisos = numPisos;
    }

    //Getters y setters

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    //Métodos heredados
    @Override
    public double calcularSuperficie() {
        return this.ancho * this.largo * this.numPisos;
    }

    @Override
    public double calcularVolumen() {
        return this.ancho * this.largo * this.alto * this.numPisos;
    }

    //Método propio
    // De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
    //usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
    //(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
    //cuantas personas entrarían en un piso y cuantas en todo el edificio.

    public void cantPersonas(EdificioDeOficinas edo){

        System.out.println("Cantidad de personas por piso: " + edo.numPersonas * edo.numOficinas);
        System.out.println("Cantidad de pesonas por edificio: " + edo.numPersonas * edo.numOficinas * edo.numPisos);
    }

    //toString

    @Override
    public String toString() {
        return "numOficinas=" + numOficinas +
                ", numPersonas=" + numPersonas +
                ", numPisos=" + numPisos;
    }
}
