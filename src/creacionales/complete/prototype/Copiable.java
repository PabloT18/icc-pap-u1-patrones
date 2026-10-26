package creacionales.complete.prototype;

/**
 * Contrato para los objetos que pueden crear una copia de sí mismos.
 *
 * @param <T> tipo del objeto copiado
 */
public interface Copiable<T> {
    T copiar();
}
