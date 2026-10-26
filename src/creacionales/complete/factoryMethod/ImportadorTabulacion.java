package creacionales.complete.factoryMethod;

public class ImportadorTabulacion extends Importador {

    @Override
    protected LectorLinea crearLector() {
        return new LectorTabulacion();
    }

}
