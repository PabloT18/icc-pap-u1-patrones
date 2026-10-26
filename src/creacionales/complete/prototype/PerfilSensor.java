package creacionales.complete.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Prototipo de perfil de sensor, compuesto por reglas de umbral mutables.
 */
public final class PerfilSensor implements Copiable<PerfilSensor> {
    private String nombre;
    private final List<ReglaUmbral> reglas = new ArrayList<>();

    public PerfilSensor(String nombre) {
        renombrar(nombre);
    }

    /**
     * Cambia el nombre del perfil, que no puede ser nulo ni estar vacío.
     */
    public void renombrar(String nuevo) {
        if (nuevo == null || nuevo.isBlank()) {
            throw new IllegalArgumentException("Nombre obligatorio");
        }
        nombre = nuevo;
    }

    /**
     * Agrega una regla al perfil.
     */
    public void agregarRegla(String magnitud, double limite) {
        reglas.add(new ReglaUmbral(magnitud, limite));
    }

    /**
     * Ajusta el límite de la regla ubicada en el índice indicado.
     */
    public void ajustarLimite(int indice, double limite) {
        reglas.get(indice).cambiarLimite(limite);
    }

    /**
     * Copia el perfil y cada regla para que la copia sea independiente.
     */
    @Override
    public PerfilSensor copiar() {
        PerfilSensor copia = new PerfilSensor(nombre);
        for (ReglaUmbral regla : reglas) {
            copia.reglas.add(regla.copiar());
        }
        return copia;
    }

    @Override
    public String toString() {
        return nombre + ": " + reglas;
    }
}
