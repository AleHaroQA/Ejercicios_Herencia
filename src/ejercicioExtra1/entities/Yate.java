package ejercicioExtra1.entities;

import java.time.LocalDate;

public class Yate extends Motor {

    //Potencia en CV y número de camarotes para yates de lujo.

    //Atributos

    private int camarotes;

    //Constructor

    public Yate(String matricula, double eslora, LocalDate añoFabricacion, int potenciaCV, int camarotes) {
        super(matricula, eslora, añoFabricacion, potenciaCV);
        this.camarotes = camarotes;
    }

    //Getters y setters

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    //en los yates se suma la potencia en CV y el número de camarotes.

    @Override
    public double calcularModulo() {
        return this.camarotes + super.calcularModulo();
    }

    //toString

    @Override
    public String toString() {
        return "camarotes=" + camarotes;
    }
}
