package ejercicio2.entities;

import ejercicio2.enums.*;

public class Electrodomestico {

    //Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
    //consumo energético (letras entre A y F) y peso.

    //Atributos

    private double precio = 1000;
    private Color color;
    private ConsumoEnergetico ce;
    private double peso;

    //Constructores

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, Color color, ConsumoEnergetico ce, double peso) {
        this.precio = precio;
        this.color = color;
        this.ce = ce;
        this.peso = peso;
    }

    //Getters y setters

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ConsumoEnergetico getCe() {
        return ce;
    }

    public void setCe(ConsumoEnergetico ce) {
        this.ce = ce;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    //toString

    @Override
    public String toString() {
        return "precio final=" + precio +
                ", color='" + color + '\'' +
                ", consumo energético=" + ce +
                ", peso=" + peso +
                " ";
    }

}
