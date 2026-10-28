package estructurales.simple.flyweight;

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
