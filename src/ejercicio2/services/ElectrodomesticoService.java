package ejercicio2.services;

import ejercicio2.entities.Electrodomestico;
import ejercicio2.enums.*;

import java.util.Scanner;


public class ElectrodomesticoService {

    Scanner reader;

    public ElectrodomesticoService() {

        this.reader = new Scanner(System.in);
    }

    /*Metodo crearElectrodomestico(): le pide la información al usuario y llena el
    electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
    precio se le da un valor base de $1000.*/

    public Electrodomestico crearElectrodomestico() {

        Electrodomestico e = new Electrodomestico();
        System.out.println("");
        System.out.println("Creando electrodoméstico");

        e.setPrecio(1000d);
        System.out.println("Elija e ingrese un color: Blanco, Negro, Rojo, Azul o Gris ");
        String color = reader.next();
        e.setColor(comprobarColor(color));

        System.out.println("Ingrese consumo energético: A, B, C, D, E o F ");
        String cE = reader.next();
        e.setCe(comprobarConsumoEnergetico(cE));

        boolean salir = false;
        do {
            System.out.println("Ingrese peso:");
            double peso = reader.nextDouble();
            if (peso > 1) {
                salir = true;
            }
            e.setPeso(peso);
        } while (!salir);

        precioFinal(e);

        return e;

        /*Electrodomestico e = new Electrodomestico();
        System.out.println("Creando electrodoméstico");

        e.setPrecio(1000d);
        System.out.println("Elija e ingrese un color: Blanco, Negro, Rojo, Azul o Gris ");
        String color = reader.next();
        e.setColor(comprobarColor(color));

        System.out.println("Ingrese consumo energético: A, B, C, D, E o F ");
        String cE = reader.next();
        e.setCe(comprobarConsumoEnergetico(cE));

        boolean salir = false;
        do {
            System.out.println("Ingrese peso:");
            Double peso =  reader.nextDouble();
            if (!(peso < 1)) {
                salir = true;
            }
            e.setPeso(peso);
        }while (!salir);

        e.setPrecio(e.getPrecio()+precioFinal(e.getPeso(),e.getCe()));

        return e;*/

        /*System.out.println("Creando electrodoméstico");

        double precio = 1000d;
        System.out.println("Elija e ingrese un color: Blanco, Negro, Rojo, Azul o Gris ");
        String color = reader.next();
        Color c = comprobarColor(color);

        System.out.println("Ingrese consumo energético: A, B, C, D, E o F ");
        String cE = reader.next();
        ConsumoEnergetico consumoEnergetico = comprobarConsumoEnergetico(cE);

        boolean salir = false;
        Double peso;
        do {
            System.out.println("Ingrese peso:");
            peso =  reader.nextDouble();
            if (peso > 0) {
                salir = true;
            }
        }while (!salir);

        precio+=precioFinal(peso,consumoEnergetico);*/


    }

    /* Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
    usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
    blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
    minúsculas. Este método se invocará al crear el objeto y no será visible.     */

    private Color comprobarColor(String color) {

        Color colorComprobado = Color.BLANCO;
        for (Color c : Color.values()) {

            if (color.equalsIgnoreCase(c.getColor())) {
                colorComprobado = c;
            }
        }
        return colorComprobado;
    }

    /*Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
    sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
    objeto y no será visible.*/

    private ConsumoEnergetico comprobarConsumoEnergetico(String consumoE) {

        ConsumoEnergetico consumoComprobado = ConsumoEnergetico.F;
        for (ConsumoEnergetico cE : ConsumoEnergetico.values()) {

            if (consumoE.equalsIgnoreCase(cE.getCe())) {
                consumoComprobado = cE;
            }
        }
        return consumoComprobado;
    }


    //Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
    //precio.

    public void precioFinal(Electrodomestico e) {

        double precioCE = 0.0;
        double precioPeso;

        switch (e.getCe()) {
            case A:
                precioCE = 1000;
                break;
            case B:
                precioCE = 800;
                break;
            case C:
                precioCE = 600;
                break;
            case D:
                precioCE = 500;
                break;
            case E:
                precioCE = 300;
                break;
            case F:
                precioCE = 100;
                break;
        }

        if (e.getPeso() >= 1 && e.getPeso() <= 19) {
            precioPeso = 100;
        } else if (e.getPeso() >= 20 && e.getPeso() <= 49) {
            precioPeso = 500;
        } else if (e.getPeso() >= 50 && e.getPeso() <= 79) {
            precioPeso = 800;
        } else {
            precioPeso = 1000;
        }

        e.setPrecio(e.getPrecio() + (precioCE + precioPeso));
    }
}
