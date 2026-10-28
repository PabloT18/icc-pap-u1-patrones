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
