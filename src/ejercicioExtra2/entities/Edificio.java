package ejercicioExtra2.entities;

abstract public class Edificio {

    //Atributos

    protected double alto;
    protected double largo;
    protected double ancho;

    //Constructores

    public Edificio() {

    }

    public Edificio(double alto, double largo, double ancho) {
        this.alto = alto;
        this.largo = largo;
        this.ancho = ancho;
    }


    //Métodos propios

    public abstract double calcularSuperficie();

    public abstract double calcularVolumen();

    //toString

    @Override
    public String toString() {
        return "alto=" + alto +
                ", largo=" + largo +
                ", ancho=" + ancho;
    }
}
