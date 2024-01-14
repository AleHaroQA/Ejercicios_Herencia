package ejercicioExtra2.entities;

public class Polideportivo extends Edificio{

    //Atributos

    private String nombre;
    private boolean techado;

    //Constructores

    public Polideportivo(double alto, double largo, double ancho, String nombre, boolean techado) {
        super(alto, largo, ancho);
        this.nombre = nombre;
        this.techado = techado;
    }

    //Getters y setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

    //Métodos heredados
    @Override
    public double calcularSuperficie() {
        return this.ancho * this.largo;
    }

    @Override
    public double calcularVolumen() {
        return this.ancho * this.largo * this.alto;
    }

    //toString

    @Override
    public String toString() {
        return super.toString() +
                "nombre='" + nombre + '\'' +
                ", techado=" + techado;
    }
}
