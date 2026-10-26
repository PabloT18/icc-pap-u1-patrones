package comportamiento.simple.templateMethod;

/**
 * Template Method: fija los pasos para preparar una bebida y delega los detalles.
 */
public final class AppTemplateMethod {
    private AppTemplateMethod() {
    }

    public static void main(String[] args) {
        new TeNegro().preparar();
    }
}

abstract class PreparadorTe {
    public final void preparar() {
        hervirAgua();
        agregarTe();
        servir();
    }

    private void hervirAgua() {
        System.out.println("Hervir agua");
    }

    protected abstract void agregarTe();

    private void servir() {
        System.out.println("Servir en una taza");
    }
}

final class TeNegro extends PreparadorTe {
    @Override
    protected void agregarTe() {
        System.out.println("Agregar una bolsita de té negro");
    }
}
