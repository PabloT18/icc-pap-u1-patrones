package estructurales.simple.proxy;

/**
 * Proxy: retrasa la carga del documento real hasta que se solicita su contenido.
 */
public final class AppProxy {
    private AppProxy() {
    }

    public static void main(String[] args) {
        Documento documento = new DocumentoProxy("informe.pdf");
        System.out.println("El proxy ya está creado.");
        documento.mostrar();
        documento.mostrar();
    }
}

interface Documento {
    void mostrar();
}

final class DocumentoReal implements Documento {
    private final String archivo;

    DocumentoReal(String archivo) {
        this.archivo = archivo;
        System.out.println("Cargando " + archivo);
    }

    @Override
    public void mostrar() {
        System.out.println("Mostrando " + archivo);
    }
}

final class DocumentoProxy implements Documento {
    private final String archivo;
    private DocumentoReal documento;

    DocumentoProxy(String archivo) {
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
