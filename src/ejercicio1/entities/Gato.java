package ejercicio1.entities;

public class Gato extends Animal{


    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void hacerRuido() {
        super.hacerRuido();
        System.out.println("Miau miau");
    }

    @Override
    public void alimentarse() {
        System.out.println("Yo como " + alimento);
    }
}
