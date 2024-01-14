package ejercicio2.enums;

public enum ConsumoEnergetico {

    A("A"),
    B("B"),
    C("C"),
    D("D"),
    E("E"),
    F("F");

    private final String ce;

    ConsumoEnergetico(String ce) {
        this.ce = ce;
    }

    public String getCe() {
        return ce;
    }

    @Override
    public String toString() {
        return this.ce;
    }
}
