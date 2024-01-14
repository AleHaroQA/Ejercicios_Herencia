package ejercicioExtra1.main;

import ejercicioExtra1.entities.*;

import java.time.LocalDate;

public class ejercicioExtra1 {

    public static void main(String[] args) {

        /*Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
        métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
        precio final de su alquiler.*/

        Velero v = new Velero("GX-625", 5, LocalDate.of(1994, 12, 4), 5);
        Motor m = new Motor("SL-132", 15, LocalDate.of(1995, 7, 31), 20);
        Yate y = new Yate("MK-452", 8, LocalDate.of(1998, 1, 15), 15, 3);

        Alquiler a1 = new Alquiler("A", 1, LocalDate.of(2023, 8, 24), LocalDate.now(), 1, v);
        System.out.println("Velero: " + a1.calcularAlquiler(v));
        Alquiler a2 = new Alquiler("B", 2, LocalDate.of(2023, 8, 24), LocalDate.now(), 2, m);
        System.out.println("Motor: " + a2.calcularAlquiler(m));
        Alquiler a3 = new Alquiler("C", 3, LocalDate.of(2023, 8, 24), LocalDate.now(), 3, y);
        System.out.println("Yate: " + a3.calcularAlquiler(y));


    }
}
