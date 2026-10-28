package estructurales.simple.decorator;

/**
 * Contrato común de bebidas que pueden describirse y cotizarse.
 */
public interface Bebida {
    String descripcion();

    double precio();
}
