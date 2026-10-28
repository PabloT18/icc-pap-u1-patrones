package estructurales.simple.bridge;

/**
 * Bridge: el control remoto puede operar distintos dispositivos sin acoplarse a uno.
 */
public final class AppBridge {
    private AppBridge() {
    }

    public static void main(String[] args) {
        ControlRemoto control = new ControlRemoto(new Televisor());
        control.encender();
        control.apagar();
    }
}
