package estructurales.simple.flyweight;

/**
 * Objeto compartido que almacena el estado intrínseco del carácter.
 */
public final class Glifo {
    private final char caracter;

    Glifo(char caracter) {
        this.caracter = caracter;
    }

    public void dibujar(int posicion) {
        System.out.println(caracter + " en posición " + posicion);
    }
}
