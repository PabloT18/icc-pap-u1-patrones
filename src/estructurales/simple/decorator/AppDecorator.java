package estructurales.simple.decorator;

/**
 * Decorator: agrega leche a una bebida envolviendo otra bebida.
 */
public final class AppDecorator {
    private AppDecorator() {
    }

    public static void main(String[] args) {
        Bebida bebida = new Leche(new CafeSimple());
        System.out.println(bebida.descripcion() + ": $" + bebida.precio());
    }
}

interface Bebida {
    String descripcion();

    double precio();
}

final class CafeSimple implements Bebida {
    @Override
    public String descripcion() {
        return "Café";
    }

    @Override
    public double precio() {
        return 2.00;
    }
}

final class Leche implements Bebida {
    private final Bebida bebida;

    Leche(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String descripcion() {
        return bebida.descripcion() + " con leche";
    }

    @Override
    public double precio() {
        return bebida.precio() + 0.50;
    }
}
