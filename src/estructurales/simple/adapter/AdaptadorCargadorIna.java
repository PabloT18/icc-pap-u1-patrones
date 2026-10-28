package estructurales.simple.adapter;

public class AdaptadorCargadorIna implements Cargador {

    private final CargadorInalambrico cInalambrio;

    public AdaptadorCargadorIna(CargadorInalambrico cInalambrio) {
        this.cInalambrio = cInalambrio;
    }

    @Override
    public void cargarCelular() {
        /// validaciones
        /// // try cath
        /// mcontrol de excepciones
        cInalambrio.cargarBase();
    }

}
