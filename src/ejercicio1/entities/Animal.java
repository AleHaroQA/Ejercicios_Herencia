package ejercicio1.entities;

public abstract class Animal {

    //Atributos

    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String raza;


    public Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    //toString

    @Override
    public String toString() {
        return "Ejercicio1.main.Ejercicio1.entities.Animal{" +
                "nombre='" + nombre + '\'' +
                ", alimento='" + alimento + '\'' +
                ", edad=" + edad +
                ", raza='" + raza + '\'' +
                '}';
    }

    public void hacerRuido(){
        System.out.println("Hola");
    }

    public void alimentarse(){
        System.out.println("animal aún no tiene alimento");
    }

}
