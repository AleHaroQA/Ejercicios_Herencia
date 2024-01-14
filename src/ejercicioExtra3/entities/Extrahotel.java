package ejercicioExtra3.entities;

abstract public class Extrahotel extends Alojamiento{

    //Atributos

    protected boolean privado;
    protected double mt2;

    //Constructor

    public Extrahotel(String nombre, String direccion, String localidad, String gerente, boolean privado, double mt2) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.mt2 = mt2;
    }

    //toString

    @Override
    public String toString() {
        return super.toString() +
                "Extrahotel{" +
                "privado=" + privado +
                ", mt2=" + mt2 +
                '}';
    }
}
