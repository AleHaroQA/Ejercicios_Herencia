package ejercicio1.main;

import ejercicio1.entities.*;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

    public static void main(String[] args) {

        List<Animal> listaAnimales = new ArrayList<>();

        Animal a = new Caballo("Caballo1", "Pasto", 3, "Pura");
        Perro p = new Perro("Chiquito", "Pellet1", 4, "Bulldog");
        Gato g = new Gato("Tom", "Pellet2", 1, "Persa");

        listaAnimales.add(a);
        listaAnimales.add(p);
        listaAnimales.add(g);

        for (Animal animal : listaAnimales) {
            animal.alimentarse();
        }
    }
}
