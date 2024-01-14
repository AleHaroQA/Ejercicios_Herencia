package ejercicioExtra3.views;

import ejercicioExtra3.entities.*;

import java.util.ArrayList;
import java.util.Scanner;

//PONER BUFFERED READER?

public class UI {

    private ArrayList<Alojamiento> alojamientos;
    private Scanner reader;

    public UI() {
        this.alojamientos = new ArrayList<>();
        this.reader = new Scanner(System.in);
    }

    public void iniciar() {

        cargarAlojamientos();

        do {
            menu();
        } while (!menu());
    }

    private void cargarAlojamientos() {

        //Campings
        Camping c1 = new Camping("c1", "hags", "hasg", "Luis", true, 200, 10, 2, true);
        Camping c2 = new Camping("c2", "jaskd", "jaksd", "Carlos", false, 400, 20, 4, false);
        Camping c3 = new Camping("c3", "jaskd", "jaksd", "Carlos", false, 400, 20, 4, true);

        alojamientos.add(c1);
        alojamientos.add(c2);
        alojamientos.add(c3);

        //Residencias
        Residencia r1 = new Residencia("r1", "jsakd", "jaks", "Rodrigo", true, 500, 22, true, true);
        Residencia r2 = new Residencia("r2", "jsakd", "jaks", "Mario", true, 500, 22, false, false);

        alojamientos.add(r1);
        alojamientos.add(r2);

        //4 Estrellas

        CuatroEstrellas ce1 = new CuatroEstrellas("ce1", "hdaj", "ahsjh", "Benjamin", 30, 50, 12,  "A", "hhjas", 25);
        CuatroEstrellas ce2 = new CuatroEstrellas("ce2", "hdrtytr", "yttrt", "Loreto", 45, 90, 15,  "B", "hhjas", 40);
        CuatroEstrellas ce3 = new CuatroEstrellas("ce3", "lnbklr", "ñlvcx", "María", 50, 150, 20,  "A", "hhjas", 55);

        alojamientos.add(ce1);
        alojamientos.add(ce2);
        alojamientos.add(ce3);

        //5 Estrellas

        CincoEstrellas cie1 = new CincoEstrellas("cie1 ", "hdaj", "ahsjh", "Benjamin", 30, 50, 12, "A", "hhjas", 25, 10, 5, 10);
        CincoEstrellas cie2 = new CincoEstrellas("cie2", "hdaj", "ahsjh", "Marcelo", 30, 50, 12, "A", "hhjas", 25, 10, 5, 15);
        CincoEstrellas cie3 = new CincoEstrellas("cie3 ", "hdaj", "ahsjh", "Juan", 30, 50, 12, "A", "hhjas", 25, 10, 5, 30);

        alojamientos.add(cie1);
        alojamientos.add(cie2);
        alojamientos.add(cie3);
    }

    private boolean menu() {

        int opc;
        boolean salir = false;
        System.out.println("1. Listar alojamientos");
        System.out.println("2. Hoteles: Mas caro a mas barato");
        System.out.println("3. Campings con restaurant");
        System.out.println("4. Residencias con descuento");
        System.out.println("5. Salir");
        System.out.print("> ");
        opc = reader.nextInt();

        switch (opc) {
            case 1:
                listarAlojamientos();
                break;
            case 2:
                hotelesMasCaroAMasBarato();
                break;
            case 3:
                campingsConRestaurant();
                break;
            case 4:
                residenciasConDescuento();
                break;
            case 5:
                salir = true;
                break;
            default:
                System.out.println("Opción inválida");
        }
        return salir;
    }

    private void listarAlojamientos() {
        System.out.println("Listado de alojamientos\n");

        for (Alojamiento a : alojamientos) {
            System.out.println(a + "\n");
        }
        System.out.println("");
    }

    private void hotelesMasCaroAMasBarato() {

        ArrayList<Hotel> hoteles = new ArrayList<>();
        System.out.println("Listado de hoteles: Mas caro a mas barato\n");

        for (Alojamiento a : alojamientos) {
            if (a instanceof Hotel) {
                Hotel h = (Hotel) a;
                hoteles.add(h);
            }
        }

        hoteles.sort(Hotel.compararPrecios);

        for (Hotel h : hoteles) {
          System.out.println("Nombre hotel: " + h.getNombre()+ "| Costo: "+ h.getPrecioHabitacion() + "\n");
        }
    }

    private void campingsConRestaurant() {
        System.out.println("Listado de campings con restaurant\n");

        for (Alojamiento a : alojamientos) {
            if (a instanceof Camping) {
                Camping c = (Camping) a;

                if (c.isRestaurant()) {
                    System.out.println(c + "\n");
                }
            }
        }
        System.out.println("");
    }

    private void residenciasConDescuento() {
        System.out.println("Listado de residencias con descuento\n");

        for (Alojamiento a : alojamientos) {
            if (a instanceof Residencia) {
                Residencia r = (Residencia) a;

                if (r.isDescuento()) {
                    System.out.println(r + "\n");
                }
            }
        }
        System.out.println("");
    }
}
