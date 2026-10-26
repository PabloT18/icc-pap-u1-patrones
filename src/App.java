import java.util.List;

import factoryMethod.Importador;
import factoryMethod.ImportadorPuntoComa;
import factoryMethod.ImportadorTabulacion;

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
