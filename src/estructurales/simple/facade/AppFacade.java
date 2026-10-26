package estructurales.simple.facade;

/**
 * Facade: ofrece una operación simple para iniciar varios componentes de un cine.
 */
public final class AppFacade {
    private AppFacade() {
    }

    public static void main(String[] args) {
        CineEnCasa cine = new CineEnCasa();
        cine.iniciarPelicula();
    }
}

final class CineEnCasa {
    private final Proyector proyector = new Proyector();
    private final Reproductor reproductor = new Reproductor();

    void iniciarPelicula() {
        proyector.encender();
        reproductor.reproducir("Mi película");
    }
}

final class Proyector {
    void encender() {
        System.out.println("Proyector encendido");
    }
}

final class Reproductor {
    void reproducir(String pelicula) {
        System.out.println("Reproduciendo: " + pelicula);
    }
}
