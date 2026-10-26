package comportamiento.simple.interpreter;

/**
 * Interpreter: representa una expresión como objetos y evalúa su significado.
 */
public final class AppInterpreter {
    private AppInterpreter() {
    }

    public static void main(String[] args) {
        Expresion operacion = new Suma(new Numero(4), new Numero(3));
        System.out.println("Resultado: " + operacion.evaluar());
    }
}

interface Expresion {
    int evaluar();
}

final class Numero implements Expresion {
    private final int valor;

    Numero(int valor) {
        this.valor = valor;
    }

    @Override
    public int evaluar() {
        return valor;
    }
}

final class Suma implements Expresion {
    private final Expresion izquierda;
    private final Expresion derecha;

    Suma(Expresion izquierda, Expresion derecha) {
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    @Override
    public int evaluar() {
        return izquierda.evaluar() + derecha.evaluar();
    }
}
