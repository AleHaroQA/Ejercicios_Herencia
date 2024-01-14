package ejercicioExtra1.entities;

import java.time.LocalDate;

abstract public class Barco {

    //Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.

    //Atributos

    private String matricula;
    private double eslora;
    private LocalDate añoFabricacion;

    //Constructores

    public Barco() {

    }

    public Barco(String matricula, double eslora, LocalDate añoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.añoFabricacion = añoFabricacion;
    }

    //Getters y setters

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public LocalDate getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(LocalDate añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    //Método para calcular módulo
    abstract public double calcularModulo();

    //toString

    @Override
    public String toString() {
        return " matricula='" + matricula + '\'' +
                ", eslora=" + eslora +
                ", añoFabricacion=" + añoFabricacion +
                ' ';
    }
}
