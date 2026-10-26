package comportamiento.simple.visitor;

/**
 * Visitor: agrega la operación de calcular áreas sin modificar las figuras.
 */
public final class AppVisitor {
    private AppVisitor() {
    }

    public static void main(String[] args) {
        VisitanteFiguras calculadora = new CalculadoraArea();
        Figura circulo = new Circulo(2);
        Figura rectangulo = new Rectangulo(3, 4);

        System.out.println("Área del círculo: " + circulo.aceptar(calculadora));
        System.out.println("Área del rectángulo: " + rectangulo.aceptar(calculadora));
    }
}

interface Figura {
    double aceptar(VisitanteFiguras visitante);
}

interface VisitanteFiguras {
    double visitar(Circulo circulo);

    double visitar(Rectangulo rectangulo);
}

final class Circulo implements Figura {
    private final double radio;

    Circulo(double radio) {
        this.radio = radio;
    }

    double radio() {
        return radio;
    }

    @Override
    public double aceptar(VisitanteFiguras visitante) {
        return visitante.visitar(this);
    }
}

final class Rectangulo implements Figura {
    private final double ancho;
    private final double alto;

    Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    double ancho() {
        return ancho;
    }

    double alto() {
        return alto;
    }

    @Override
    public double aceptar(VisitanteFiguras visitante) {
        return visitante.visitar(this);
    }
}

final class CalculadoraArea implements VisitanteFiguras {
    @Override
    public double visitar(Circulo circulo) {
        return Math.PI * circulo.radio() * circulo.radio();
    }

    @Override
    public double visitar(Rectangulo rectangulo) {
        return rectangulo.ancho() * rectangulo.alto();
    }
}
