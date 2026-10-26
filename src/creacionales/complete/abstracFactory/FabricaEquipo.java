package creacionales.complete.abstracFactory;

/**
 * Fábrica abstracta que crea productos compatibles de una misma familia.
 */
public interface FabricaEquipo {
    FuenteTemperatura crearFuente();

    ConversorTemperatura crearConversor();
}
