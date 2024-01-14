package ejercicio2.entities;

import ejercicio2.enums.*;

public class Lavadora extends Electrodomestico{

    //Atributos

    protected int carga;

    //Constructores

    public Lavadora() {

    }

    public Lavadora(double precio, Color color, ConsumoEnergetico ce, double peso, int carga) {
        super(precio, color, ce, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    //toString


    @Override
    public String toString() {
        return "Lavadora{" + super.toString() +
                "carga=" + carga +
                '}';
    }
}
