package ejercicioExtra1.entities;

import java.time.LocalDate;

public class Motor extends Barco {

    //Potencia en CV para barcos a motor.

    //Atributos

    private int potenciaCV;

    //Constructor

    public Motor() {

    }

    public Motor(String matricula, double eslora, LocalDate añoFabricacion, int potenciaCV) {
        super(matricula, eslora, añoFabricacion);
        this.potenciaCV = potenciaCV;
    }

    //Getters y setters

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    //barcos a motor se le suma la potencia en CV

    @Override
    public double calcularModulo() {
        return getEslora() * 10 + this.potenciaCV;
    }

    //toString

    @Override
    public String toString() {
        return "potenciaCV=" + potenciaCV;
    }
}
