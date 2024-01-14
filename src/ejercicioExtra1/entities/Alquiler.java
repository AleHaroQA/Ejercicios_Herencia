package ejercicioExtra1.entities;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Alquiler {

    //Para cada Alquiler se guarda: el nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
    //amarre y el barco que lo ocupará.

    //Atributos

    private String nombre;
    private int ID;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private int posicion;
    private Barco barco;

    //Constructores

    public Alquiler() {
    }

    public Alquiler(String nombre, int ID, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posicion, Barco barco) {
        this.nombre = nombre;
        this.ID = ID;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicion = posicion;
        this.barco = barco;
    }

    //Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }


    /*Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
    alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
    multiplicando por 10 los metros de eslora).*/

    public double calcularAlquiler(Barco b) {

        Period difDias = Period.between(this.fechaAlquiler, this.fechaDevolucion);
        int numDias = difDias.getDays();

        return numDias * b.calcularModulo();
    }

    //toString

    @Override
    public String toString() {
        return "Alquiler{" +
                "nombre='" + nombre + '\'' +
                ", ID=" + ID +
                ", fechaAlquiler=" + fechaAlquiler +
                ", fechaDevolucion=" + fechaDevolucion +
                ", posicion=" + posicion +
                ", barco=" + barco +
                '}';
    }
}
