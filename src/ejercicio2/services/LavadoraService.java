package ejercicio2.services;

import ejercicio2.entities.Electrodomestico;
import ejercicio2.entities.Lavadora;


public class LavadoraService extends ElectrodomesticoService {


    /*Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
    padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
    el atributo propio de la lavadora.*/

    public Lavadora crearLavadora() {

        Electrodomestico e = super.crearElectrodomestico();
        Lavadora l = new Lavadora();
        l.setColor(e.getColor());
        l.setCe(e.getCe());
        l.setPeso(e.getPeso());

        boolean salir = false;
        int carga;
        do {
            System.out.println("Ingrese carga de lavadora:");
            carga = reader.nextInt();
            if (!(carga < 1)) {
                salir = true;
            }
            l.setCarga(carga);
        } while (!salir);

        precioFinal(l);

        return l;
    }

    /*Método precioFinal(): este método será heredado y se le sumará la siguiente
    funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
    carga es menor o igual, no se incrementará el precio. Este método debe llamar al
    método padre y añadir el código necesario. Recuerda que las condiciones que hemos
    visto en la clase Electrodoméstico también deben afectar al precio.*/

    public void precioFinal(Lavadora l) {

        super.precioFinal(l);
        if (l.getCarga() > 30) {
            l.setPrecio(l.getPrecio() + 500);
        }
    }

}
