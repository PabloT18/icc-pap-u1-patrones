package estructurales.simple.facade;

/**
 * Facade que coordina los componentes necesarios para iniciar una película.
 */
public final class CineEnCasa {
    private final Proyector proyector = new Proyector();
    private final Reproductor reproductor = new Reproductor();

    public void iniciarPelicula() {
        proyector.encender();
        reproductor.reproducir("Mi película");
    }
}
