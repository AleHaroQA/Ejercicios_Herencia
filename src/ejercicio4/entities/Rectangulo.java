package ejercicio4.entities;

import ejercicio4.interfaces.ICalculosFormas;

public class Rectangulo implements ICalculosFormas {

    //Atributos

    private double base;
    private double altura;

    //Constructores

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //Getters y setters

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //toString

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }

    //Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.

    @Override
    public double calculoArea() {
        return this.base * this.altura;
    }

    @Override
    public double calculoPerimetro() {
        return (this.base + this.altura) *2;
    }
}
