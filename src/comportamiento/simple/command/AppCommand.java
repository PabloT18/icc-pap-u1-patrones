package comportamiento.simple.command;

/**
 * Command: encapsula una acción para que quien la solicita no dependa de su receptor.
 */
public final class AppCommand {
    private AppCommand() {
    }

    public static void main(String[] args) {
        Luz luz = new Luz();
        Comando encender = new EncenderLuz(luz);

        // El invocador ejecuta el comando sin conocer los detalles de la luz.
        encender.ejecutar();
    }
}

interface Comando {
    void ejecutar();
}

final class Luz {
    void encender() {
        System.out.println("Luz encendida");
    }
}

final class EncenderLuz implements Comando {
    private final Luz luz;

    EncenderLuz(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void ejecutar() {
        luz.encender();
    }
}
