package estructurales.simple.bridge;

/**
 * Implementación concreta de un dispositivo controlable.
 */
public final class Televisor implements Dispositivo {
    @Override
    public void encender() {
        System.out.println("Televisor encendido");
    }

    @Override
    public void apagar() {
        System.out.println("Televisor apagado");
    }
}
