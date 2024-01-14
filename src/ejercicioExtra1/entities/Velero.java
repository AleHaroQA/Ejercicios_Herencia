package ejercicioExtra1.entities;

import java.time.LocalDate;

public class Velero extends Barco {

    //Número de mástiles para veleros.

    //Atributos

    private int mastiles;

    //Constructor

    public Velero(String matricula, double eslora, LocalDate añoFabricacion, int mastiles) {
        super(matricula, eslora, añoFabricacion);
        this.mastiles = mastiles;
    }

    //Getters y setters

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }


    //En los veleros se suma el número de mástiles;

    @Override
    public double calcularModulo() {

        return getEslora() * 10 + this.mastiles;
    }

    //toString

    @Override
    public String toString() {
        return "mastiles=" + mastiles;
    }
}
