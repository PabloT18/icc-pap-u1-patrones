package creacionales.complete.factoryMethod;

public class LectorTabulacion implements LectorLinea {

    @Override
    public Lectura leer(String linea) {
        String[] partes = linea.split("\t");
        return new Lectura(partes[0], Double.parseDouble(partes[1]), partes[2]);
    }

}
