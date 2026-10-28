package estructurales.simple.proxy;

/**
 * Documento que realiza la carga real del archivo al ser creado.
 */
public final class DocumentoReal implements Documento {
    private final String archivo;

    public DocumentoReal(String archivo) {
        this.archivo = archivo;
        System.out.println("Cargando " + archivo);
    }

    @Override
    public void mostrar() {
        System.out.println("Mostrando " + archivo);
    }
}
