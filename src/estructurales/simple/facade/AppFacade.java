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
