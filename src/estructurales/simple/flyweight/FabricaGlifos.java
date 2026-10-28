package estructurales.simple.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Fábrica que reutiliza una instancia de glifo para cada carácter.
 */
public final class FabricaGlifos {
    private final Map<Character, Glifo> glifos = new HashMap<>();

    public Glifo obtener(char caracter) {
        return glifos.computeIfAbsent(caracter, Glifo::new);
    }
}
