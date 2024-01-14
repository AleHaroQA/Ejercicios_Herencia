package ejercicio2.entities;

import ejercicio2.enums.*;

public class Televisor extends Electrodomestico {

    //Atributos

    protected int resolucion;
    protected boolean sintonizadorrTDT;

    //Constructor

    public Televisor() {

    }

    public Televisor(double precio, Color color, ConsumoEnergetico ce, double peso, int resolucion, boolean sintonizadorrTDT) {
        super(precio, color, ce, peso);
        this.resolucion = resolucion;
        this.sintonizadorrTDT = sintonizadorrTDT;
    }

    //Getters y setters

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorrTDT() {
        return sintonizadorrTDT;
    }

    public void setSintonizadorrTDT(boolean sintonizadorrTDT) {
        this.sintonizadorrTDT = sintonizadorrTDT;
    }

    //toString

    @Override
    public String toString() {
        return "Televisor{" + super.toString() +
                " resolucion=" + resolucion +
                ", sintonizadorrTDT=" + sintonizadorrTDT +
                '}';
    }
}
