package ejercicioExtra3.entities;


public final class CincoEstrellas extends CuatroEstrellas {

    //Atributos

    protected int cantSalones;
    protected int cantSuites;
    protected int cantLimosinas;

    //Constructor

    public CincoEstrellas(String nombre, String direccion, String localidad, String gerente, int cantHabitaciones,
                          int numCamas, int cantPisos, String gimnasio, String nombreRestaurant,
                          int capacidadRestaurant, int cantSalones, int cantSuites, int cantLimosinas) {
        super(nombre, direccion, localidad, gerente, cantHabitaciones, numCamas, cantPisos, gimnasio,
                nombreRestaurant, capacidadRestaurant);
        this.cantSalones = cantSalones;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
        this.precioHabitacion = capacidadHotel();
    }

    @Override
    protected double capacidadHotel() {

        return super.capacidadHotel() + (this.cantLimosinas * 15);
    }

    //toString

    @Override
    public String toString() {
        return super.toString() +
                "CincoEstrellas{" +
                "cantSalones=" + cantSalones +
                ", cantSuites=" + cantSuites +
                ", cantLimosinas=" + cantLimosinas +
                '}';
    }
}


