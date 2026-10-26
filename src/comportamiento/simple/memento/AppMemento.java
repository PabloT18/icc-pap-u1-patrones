package comportamiento.simple.memento;

/**
 * Memento: guarda el estado del editor para poder restaurarlo después.
 */
public final class AppMemento {
    private AppMemento() {
    }

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.escribir("Versión inicial");
        EstadoEditor respaldo = editor.guardar();

        editor.escribir("Texto modificado");
        System.out.println(editor.leer());

        editor.restaurar(respaldo);
        System.out.println(editor.leer());
    }
}

record EstadoEditor(String texto) {
}

final class Editor {
    private String texto = "";

    void escribir(String texto) {
        this.texto = texto;
    }

    String leer() {
        return texto;
    }

    EstadoEditor guardar() {
        return new EstadoEditor(texto);
    }

    void restaurar(EstadoEditor estado) {
        texto = estado.texto();
    }
}
