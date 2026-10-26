package comportamiento.simple.chainOfResponsibility;

/**
 * Chain of Responsibility: cada filtro procesa el mensaje o lo pasa al siguiente.
 */
public final class AppChainOfResponsibility {
    private AppChainOfResponsibility() {
    }

    public static void main(String[] args) {
        FiltroMensaje cadena = new FiltroSpam(new FiltroLongitud(null));
        cadena.procesar("Hola, equipo");
        cadena.procesar("COMPRAR AHORA");
    }
}

abstract class FiltroMensaje {
    private final FiltroMensaje siguiente;

    FiltroMensaje(FiltroMensaje siguiente) {
        this.siguiente = siguiente;
    }

    final void continuar(String mensaje) {
        if (siguiente != null) {
            siguiente.procesar(mensaje);
        } else {
            System.out.println("Mensaje aceptado: " + mensaje);
        }
    }

    abstract void procesar(String mensaje);
}

final class FiltroSpam extends FiltroMensaje {
    FiltroSpam(FiltroMensaje siguiente) {
        super(siguiente);
    }

    @Override
    void procesar(String mensaje) {
        if (mensaje.toLowerCase().contains("comprar ahora")) {
            System.out.println("Mensaje rechazado por spam");
            return;
        }
        continuar(mensaje);
    }
}

final class FiltroLongitud extends FiltroMensaje {
    FiltroLongitud(FiltroMensaje siguiente) {
        super(siguiente);
    }

    @Override
    void procesar(String mensaje) {
        if (mensaje.length() > 100) {
            System.out.println("Mensaje rechazado por longitud");
            return;
        }
        continuar(mensaje);
    }
}
