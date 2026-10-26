package creacionales.complete.factoryMethod;

public class ImportadorPuntoComa extends Importador {

    @Override
    protected LectorLinea crearLector() {
        return new LectorPuntoComa();
    }

}
