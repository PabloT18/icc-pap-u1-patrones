package estructurales.simple.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Flyweight: comparte objetos de carácter y varía solo su posición al dibujarlos.
 */
public final class AppFlyweight {
    private AppFlyweight() {
    }

    public static void main(String[] args) {
        FabricaGlifos fabrica = new FabricaGlifos();
        Glifo primero = fabrica.obtener('A');
        Glifo segundo = fabrica.obtener('A');

        primero.dibujar(0);
        segundo.dibujar(1);
        System.out.println("Mismo glifo compartido: " + (primero == segundo));
    }
}

final class Glifo {
    private final char caracter;

    Glifo(char caracter) {
        this.caracter = caracter;
    }

    void dibujar(int posicion) {
        System.out.println(caracter + " en posición " + posicion);
    }
}

final class FabricaGlifos {
    private final Map<Character, Glifo> glifos = new HashMap<>();

    Glifo obtener(char caracter) {
        return glifos.computeIfAbsent(caracter, Glifo::new);
    }
}
