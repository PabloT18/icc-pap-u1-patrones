package estructurales.simple.bridge;

/**
 * Control que delega las operaciones en un dispositivo intercambiable.
 */
public final class ControlRemoto {
    private final Dispositivo dispositivo;

    public ControlRemoto(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void encender() {
        dispositivo.encender();
    }

    public void apagar() {
        dispositivo.apagar();
    }
}
