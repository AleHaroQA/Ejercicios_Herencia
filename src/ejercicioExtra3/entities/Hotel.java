package ejercicioExtra3.entities;

import java.util.Comparator;

abstract public class Hotel extends Alojamiento{

    //Atributos

    protected int cantHabitaciones;
    protected int numCamas;
    protected int cantPisos;
    protected double precioHabitacion;

    //Constructor

    public Hotel(String nombre, String direccion, String localidad, String gerente, int cantHabitaciones, int numCamas, int cantPisos) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
    }

    //Getter precio

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    //Método propio para calcular capacidad del hotel
    protected double capacidadHotel() {

        return this.cantHabitaciones * this.numCamas * this.cantPisos;
    }

    public static Comparator<Hotel> compararPrecios = new Comparator<Hotel>() {
        @Override
        public int compare(Hotel o1, Hotel o2) {
            Double h1 = o1.precioHabitacion;
            Double h2  = o2.precioHabitacion;
            return h2.compareTo(h1);
        }
    };

    /*@Override
    public int compare(Hotel o1, Hotel o2) {
        Double h1 = o1.precioHabitacion;
        Double h2  = o2.precioHabitacion;
        return h2.compareTo(h1);
    }*/

    //toSting

    @Override
    public String toString() {
        return super.toString() +
                "Hotel{" +
                "cantHabitaciones=" + cantHabitaciones +
                ", numCamas=" + numCamas +
                ", cantPisos=" + cantPisos +
                ", precioHabitacion=" + precioHabitacion;
    }
}
