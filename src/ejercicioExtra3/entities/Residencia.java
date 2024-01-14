package ejercicioExtra3.entities;

public final class Residencia extends Extrahotel{

    //Atributos

    protected int cantHabitaciones;
    protected boolean descuento;
    protected boolean campoDeportivo;

    //Constructor

    public Residencia(String nombre, String direccion, String localidad, String gerente, boolean privado, double mt2,
                      int cantHabitaciones, boolean descuento, boolean campoDeportivo) {
        super(nombre, direccion, localidad, gerente, privado, mt2);
        this.cantHabitaciones = cantHabitaciones;
        this.descuento = descuento;
        this.campoDeportivo = campoDeportivo;
    }

    //Getter descuento

    public boolean isDescuento() {
        return descuento;
    }

    //toString

    @Override
    public String toString() {
        return super.toString() +
                "Residencia{" +
                "cantHabitaciones=" + cantHabitaciones +
                ", descuento=" + descuento +
                ", campoDeportivo=" + campoDeportivo +
                '}';
    }
}
