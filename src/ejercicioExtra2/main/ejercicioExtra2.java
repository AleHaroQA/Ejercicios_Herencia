package ejercicioExtra2.main;

import ejercicioExtra2.entities.Edificio;
import ejercicioExtra2.entities.EdificioDeOficinas;
import ejercicioExtra2.entities.Polideportivo;

import javax.security.auth.login.AccountExpiredException;
import java.util.ArrayList;
import java.util.List;

public class ejercicioExtra2 {

    public static void main(String[] args) {

        /* Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
        dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
        métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
        superficie y el volumen de cada edificio.
        Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
        techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
        cantPersonas() y mostrar los resultados de cada edificio de oficinas.*/

        ArrayList<Edificio> listaEdificios = llenarLista();
        mostrarEdificios(listaEdificios);

    }

    public static ArrayList<Edificio> llenarLista(){

        ArrayList<Edificio> listaEdificios = new ArrayList<>();
        Polideportivo p = new Polideportivo(10,20.5,40, "Poli 1", true);
        Polideportivo p1 = new Polideportivo(10,25,50, "Poli 2", true);
        EdificioDeOficinas edo1 = new EdificioDeOficinas(2.5,15,30, 5,4,10);
        EdificioDeOficinas edo2 = new EdificioDeOficinas(2,10,25, 3,10,5);

        listaEdificios.add(p);
        listaEdificios.add(p1);
        listaEdificios.add(edo1);
        listaEdificios.add(edo2);

        return listaEdificios;

    }

    public static void mostrarEdificios(ArrayList<Edificio> edificioArrayList){

        int cantTechados = 0;
        int cantAbiertos = 0;
        for (Edificio e : edificioArrayList) {

            if (e instanceof Polideportivo) {
                System.out.println("--------------POLIDEPORTIVO--------------");
                Polideportivo p = (Polideportivo) e;
                System.out.println("Superficie " + p.getNombre() + ": " + p.calcularSuperficie());
                System.out.println("Volumen " + p.getNombre() + ": " +  p.calcularVolumen());

                if (p.isTechado()) {
                    cantTechados++;
                }else {
                    cantAbiertos++;
                }
            }else{
                System.out.println("--------------EDIFICIO DE OFICINAS--------------");
                EdificioDeOficinas edo = (EdificioDeOficinas) e;
                System.out.println("Superficie " + edo.calcularSuperficie());
                System.out.println("Volumen " + edo.calcularVolumen());
                edo.cantPersonas(edo);
            }
        }

        System.out.println(" ");
        System.out.println("Cantidad polideportivos techados: " +cantTechados);
        System.out.println("Cantidad polideportivos abiertos: " +cantAbiertos);
    }
}
