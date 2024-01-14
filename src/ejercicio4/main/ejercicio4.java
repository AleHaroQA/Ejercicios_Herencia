package ejercicio4.main;

import ejercicio4.entities.*;


public class ejercicio4 {

    public static void main(String[] args) {

        Circulo c = new Circulo(3.5,7);
        System.out.println(c.calculoArea());
        System.out.println(c.calculoPerimetro());

        Rectangulo r = new Rectangulo(3.5,6);
        System.out.println(r.calculoArea());
        System.out.println(r.calculoPerimetro());
    }
}
