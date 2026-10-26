import java.util.List;

import creacionales.complete.factoryMethod.Importador;
import creacionales.complete.factoryMethod.ImportadorPuntoComa;
import creacionales.complete.factoryMethod.ImportadorTabulacion;

public class App {
    public static void main(String[] args) throws Exception {
        runFactoryMethod();
    }

    private static void runFactoryMethod() {
        Importador impPC = new ImportadorPuntoComa();
        Importador impT = new ImportadorTabulacion();

        System.out.println(
                impPC.importacion(List.of("S01;22.5;C", "",
                        "S02;18;C", "S02;18;C", "S02;18;C")));
        System.out.println(
                impT.importacion(List.of("S01\t22.5\tC",
                        "S02\t18\tC", "S02\t18\tC", "S02\t18\tC")));

    }
}
