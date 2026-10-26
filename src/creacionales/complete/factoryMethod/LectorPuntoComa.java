package creacionales.complete.factoryMethod;

public class LectorPuntoComa implements LectorLinea {

    @Override
    public Lectura leer(String linea) {
        // dividir la linea por el separador ";
        String[] partes = linea.split(";");

        // devolver una instancia de Lectura
        return new Lectura(partes[0], Double.parseDouble(partes[1]), partes[2]);
    }

}
