package ejercicio4.entities;

import ejercicio4.interfaces.ICalculosFormas;

public class Circulo implements ICalculosFormas {

    //Atributos

    private double radio;
    private double diametro;

    //Constructores

    public Circulo() {
    }

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    //Getters y setters

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    //toString

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", diametro=" + diametro +
                '}';
    }

    //Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
    @Override
    public double calculoArea() {
        return ICalculosFormas.PI * Math.pow(this.radio,2);
    }

    @Override
    public double calculoPerimetro() {
        return ICalculosFormas.PI * this.diametro;
    }
}
