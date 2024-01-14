package ejercicio2.main;

import ejercicio2.entities.*;
import ejercicio2.enums.*;
import ejercicio2.services.*;

import java.util.ArrayList;

public class Ejercicio2 {

    public static void main(String[] args) {

        LavadoraService ls = new LavadoraService();
        TelevisorService ts = new TelevisorService();

       /* Lavadora l = ls.crearLavadora();
        System.out.println(l);

        Televisor t = ts.crearTelevisor();
        System.out.println(t);*/


        /* EJERCICIO 3. Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
        para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
        Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
        deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
        televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
        precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
        2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
        electrodomésticos, 2000 para lavadora y 5000 para televisor.*/

        ArrayList<Electrodomestico> listaElectro = new ArrayList<>();

        crearArrayList(listaElectro);
        imprimirPrecioFinal(listaElectro,ls, ts);

    }

    public static void crearArrayList(ArrayList<Electrodomestico> electrodomesticos) {

        Lavadora l1 = new Lavadora(1000, Color.ROJO, ConsumoEnergetico.C, 54, 10);
        Lavadora l2 = new Lavadora(1000, Color.AZUL, ConsumoEnergetico.A, 40, 35);
        Televisor t1 = new Televisor(1000, Color.NEGRO, ConsumoEnergetico.B, 20, 24, true);
        Televisor t2 = new Televisor(1000, Color.GRIS, ConsumoEnergetico.E, 10, 65, false);

        electrodomesticos.add(l1);
        electrodomesticos.add(l2);
        electrodomesticos.add(t1);
        electrodomesticos.add(t2);
    }

    public static void imprimirPrecioFinal(ArrayList<Electrodomestico> list, LavadoraService ls, TelevisorService ts) {

        double suma = 0;
        for (Electrodomestico e : list) {

            if (e instanceof Lavadora) {
                Lavadora l = (Lavadora) e;
                ls.precioFinal(l);
            } else {
                Televisor t = (Televisor) e;
                ts.precioFinal(t);
            }
            suma += e.getPrecio();
            System.out.println("Precio final: " + e.getPrecio());
        }

        System.out.println("La suma de los precios de los electrodomésticos es: " + suma);
    }
}
