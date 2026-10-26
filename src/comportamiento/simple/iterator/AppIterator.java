package comportamiento.simple.iterator;

import java.util.List;

/**
 * Iterator: recorre una colección sin exponer cómo están almacenadas sus tareas.
 */
public final class AppIterator {
    private AppIterator() {
    }

    public static void main(String[] args) {
        ListaTareas tareas = new ListaTareas(List.of("Estudiar", "Practicar", "Repasar"));
        IteradorTareas iterador = tareas.iterador();

        while (iterador.tieneSiguiente()) {
            System.out.println(iterador.siguiente());
        }
    }
}

interface IteradorTareas {
    boolean tieneSiguiente();

    String siguiente();
}

final class ListaTareas {
    private final List<String> tareas;

    ListaTareas(List<String> tareas) {
        this.tareas = List.copyOf(tareas);
    }

    IteradorTareas iterador() {
        return new IteradorListaTareas(tareas);
    }
}

final class IteradorListaTareas implements IteradorTareas {
    private final List<String> tareas;
    private int indice;

    IteradorListaTareas(List<String> tareas) {
        this.tareas = tareas;
    }

    @Override
    public boolean tieneSiguiente() {
        return indice < tareas.size();
    }

    @Override
    public String siguiente() {
        if (!tieneSiguiente()) {
            throw new IllegalStateException("No hay más tareas");
        }
        return tareas.get(indice++);
    }
}
