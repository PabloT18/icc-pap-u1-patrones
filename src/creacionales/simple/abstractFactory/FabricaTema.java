package creacionales.simple.abstractFactory;

/**
 * Fábrica abstracta: crea los componentes que pertenecen a un mismo tema.
 */
public interface FabricaTema {
    Boton crearBoton();

    Casilla crearCasilla();
}
