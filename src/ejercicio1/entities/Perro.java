package ejercicio1.entities;

public class Perro extends Animal {

    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void hacerRuido() {
        System.out.println("Guau guau");
    }

    @Override
    public void alimentarse() {
        System.out.println("Yo como " + alimento);;
    }
}
