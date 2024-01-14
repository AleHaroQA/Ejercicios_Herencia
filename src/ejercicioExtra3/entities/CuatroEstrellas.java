package ejercicioExtra3.entities;

public class CuatroEstrellas extends Hotel {

    //Atributos

    protected String gimnasio;
    protected String nombreRestaurant;
    protected int capacidadRestaurant;

    //Constructor

    public CuatroEstrellas(String nombre, String direccion, String localidad, String gerente, int cantHabitaciones,
                           int numCamas, int cantPisos, String gimnasio, String nombreRestaurant,
                           int capacidadRestaurant) {
        super(nombre, direccion, localidad, gerente, cantHabitaciones, numCamas, cantPisos);
        this.gimnasio = gimnasio;
        this.nombreRestaurant = nombreRestaurant;
        this.capacidadRestaurant = capacidadRestaurant;
        this.precioHabitacion = capacidadHotel();
    }

        //poner getter precio

    //Sobrescritura del método de superclase para añadir costo de habitación de hotel
    @Override
    protected double capacidadHotel() {

        //Por restaurant
        int valorExtraRest = 50;
        if (this.capacidadRestaurant < 30) {
            valorExtraRest = 10;
        } else if (this.capacidadRestaurant >= 30 && this.capacidadRestaurant <= 50) {
            valorExtraRest = 30;
        }

        //Por gimnasio
        int valorExtraGim = this.gimnasio.equalsIgnoreCase("a") ? 50 : 30;


        return super.capacidadHotel() + (valorExtraRest + valorExtraGim);
    }

    //toString

    @Override
    public String toString() {
        return super.toString() +
                "CuatroEstrellas{" +
                "gimnasio=" + gimnasio +
                ", nombreRestaurant='" + nombreRestaurant + '\'' +
                ", capacidadRestaurant=" + capacidadRestaurant +
                '}';
    }
}
