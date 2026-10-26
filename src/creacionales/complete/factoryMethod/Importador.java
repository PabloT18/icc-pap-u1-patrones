package creacionales.complete.factoryMethod;

import java.util.ArrayList;
import java.util.List;

// mantener el proceso dre importación y delega la creación
public abstract class Importador {

    // FACTORY METHOD
    protected abstract LectorLinea crearLector();

    public final List<Lectura> importacion(List<String> lecturas) {
        LectorLinea lector = crearLector(); // Polimorfica
        // impPC -> ImportadorPuntoComa -> LectorPuntoComa
        List<Lectura> resultado = new ArrayList<>();
        for (String lectura : lecturas) {
            if (lectura.isBlank()) {
                // REGSITRE EN LOGS y me mande corre ctamente
                continue;
            }
            try {
                resultado.add(lector.leer(lectura));
            } catch (Exception e) {
                throw new IllegalArgumentException("linea mal formada");
            }
        }
        return resultado;
    }

}
