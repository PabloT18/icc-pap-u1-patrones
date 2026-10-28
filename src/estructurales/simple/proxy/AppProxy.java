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
