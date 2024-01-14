package ejercicio2.services;

import ejercicio2.entities.Electrodomestico;
import ejercicio2.entities.Televisor;

public class TelevisorService extends ElectrodomesticoService {

   /*Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
    padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
    los atributos del televisor. */

    public Televisor crearTelevisor() {

        Electrodomestico e = super.crearElectrodomestico();
        Televisor t = new Televisor();
        t.setColor(e.getColor());
        t.setCe(e.getCe());
        t.setPeso(e.getPeso());

        boolean salir = false;
        int resolucion;
        do {
            System.out.println("Ingrese resolución de televisor:");
            resolucion = reader.nextInt();
            if (!(resolucion < 1)) {
                salir = true;
            }
            t.setResolucion(resolucion);
        } while (!salir);

        int opc;
        t.setSintonizadorrTDT(false);
        do {
            System.out.println("Televisor tiene sintonizador TDT?  |1.Si 2.NO");
            opc = reader.nextInt();
            if (opc == 1) {
                t.setSintonizadorrTDT(true);
            }
        } while (opc != 1 && opc != 2);

        precioFinal(t);

        return t;
    }

    /*Método precioFinal(): este método será heredado y se le sumará la siguiente
    funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
    incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
    $500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
    también deben afectar al precio. */

    public void precioFinal(Televisor t) {

        super.precioFinal(t);
        if (t.getResolucion() > 40) {
            t.setPrecio(t.getPrecio() + (t.getPrecio() * 0.3));
        }

        if (t.isSintonizadorrTDT()) {
            t.setPrecio(t.getPrecio() + 500);
        }
    }
}
