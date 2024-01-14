package ejercicioExtra3.entities;

public final class Camping extends Extrahotel{

    //Atributos

    protected int cantCarpas;
    protected int cantWC;
    protected boolean restaurant;

    //Constructor

    public Camping(String nombre, String direccion, String localidad, String gerente, boolean privado, double mt2, int cantCarpas,
                   int cantWC, boolean restaurant ) {
        super(nombre, direccion, localidad, gerente, privado, mt2);
        this.cantCarpas = cantCarpas;
        this.cantWC = cantWC;
        this.restaurant = restaurant;
    }

    //Getter restaurant

    public boolean isRestaurant() {
        return restaurant;
    }


    //toString

    @Override
    public String toString() {
        return super.toString() +
                "Camping{" +
                "cantCarpas=" + cantCarpas +
                ", cantWC=" + cantWC +
                ", restaurant=" + restaurant +
                '}';
    }
}
