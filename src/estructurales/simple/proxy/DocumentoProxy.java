package estructurales.simple.proxy;

/**
 * Proxy que pospone la creación del documento real hasta que se necesita.
 */
public final class DocumentoProxy implements Documento {
    private final String archivo;
    private DocumentoReal documento;

    public DocumentoProxy(String archivo) {
        this.archivo = archivo;
    }

    @Override
    public void mostrar() {
        if (documento == null) {
            documento = new DocumentoReal(archivo);
        }
        documento.mostrar();
    }
}
