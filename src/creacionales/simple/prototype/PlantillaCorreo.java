package creacionales.simple.prototype;

/**
 * Plantilla mutable que puede duplicarse para crear correos personalizados.
 */
public final class PlantillaCorreo {
    private String asunto;
    private String mensaje;

    public PlantillaCorreo(String asunto, String mensaje) {
        this.asunto = asunto;
        this.mensaje = mensaje;
    }

    /**
     * Devuelve una plantilla nueva con los mismos valores iniciales.
     */
    public PlantillaCorreo copiar() {
        return new PlantillaCorreo(asunto, mensaje);
    }

    public void cambiarAsunto(String asunto) {
        this.asunto = asunto;
    }

    public void cambiarMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String contenido() {
        return asunto + ": " + mensaje;
    }
}
