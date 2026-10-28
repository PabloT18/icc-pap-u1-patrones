package estructurales.simple.adapter;

/**
 * Adapter: permite usar un termómetro Fahrenheit con una aplicación que espera
 * Celsius.
 */
public final class AppAdapter {

    public static void main(String[] args) {
        CargadorAntiguo cAntiguo = new CargadorAntiguo();
        Cargador cargor1 = new AdaptadorCargador(cAntiguo);

        CargadorInalambrico cInalambrico = new CargadorInalambrico();
        Cargador cargor2 = new AdaptadorCargadorIna(cInalambrico);

        /// CARGAR EL CELULAR
        cargor1.cargarCelular();
        cargor2.cargarCelular();

    }
}
