# Ejemplos de patrones de diseño

Este proyecto reúne ejemplos educativos de patrones de diseño. El objetivo es
mostrar tanto cómo se organiza cada patrón como una forma directa de aplicarlo
en un contexto sencillo.

Los ejemplos se organizarán en las tres clasificaciones habituales:

- **Creacionales:** patrones relacionados con la creación de objetos.
- **Estructurales:** patrones que organizan clases y objetos para formar
  estructuras más grandes.
- **De comportamiento:** patrones que describen cómo colaboran los objetos y
  cómo distribuyen sus responsabilidades.

## Organización

Dentro de `src/creacionales/`, `src/estructurales/` y
`src/comportamiento/` se organizarán los ejemplos por clasificación. En cada
clasificación habrá dos modalidades:

- **`complete/`:** ejemplos más completos, con varias clases, interfaces y
  niveles de abstracción para mostrar la estructura del patrón. Cuando
  corresponda, incluirán un diagrama UML del patrón.
- **`simple/`:** ejemplos directos y fáciles de seguir, con menos niveles de
  abstracción y un contexto distinto al de los ejemplos completos. Los
  participantes del patrón son clases de nivel superior, no clases anidadas.

La estructura prevista es:

```text
src/
├── creacionales/
│   ├── complete/
│   │   └── <patron>/
│   │       ├── *.java
│   │       └── asset/      # Diagrama UML, cuando esté disponible
│   └── simple/
│       └── <patron>/
│           └── *.java
├── estructurales/
│   ├── complete/
│   └── simple/
└── comportamiento/
    ├── complete/
    └── simple/
```

Actualmente, están implementados ejemplos creacionales y estructurales:

| Clasificación | Patrón | Ejemplo completo | Ejemplo simple |
| --- | --- | --- | --- |
| Creacional | Abstract Factory | Equipos y conversión de temperatura | Componentes de temas visuales |
| Creacional | Builder | Configuración de un plan de muestreo | Preparación de una pizza |
| Creacional | Factory Method | Importación de lecturas | Generación de saludos |
| Creacional | Prototype | Copia de perfiles de sensores | Copia de una plantilla de correo |
| Creacional | Singleton | Configuración de muestreo | Conexión a base de datos |
| Estructural | Adapter | — | Adaptación de un termómetro Fahrenheit |
| Estructural | Bridge | — | Control remoto y televisor |
| Estructural | Composite | — | Productos y combos de menú |
| Estructural | Decorator | — | Café con leche |
| Estructural | Facade | — | Inicio de un cine en casa |
| Estructural | Flyweight | — | Glifos compartidos |
| Estructural | Proxy | — | Carga diferida de un documento |

Los ejemplos completos estructurales y los ejemplos de comportamiento se
incorporarán posteriormente.

## Ejecución

El proyecto usa Java y mantiene el código fuente en `src/`. En Visual Studio
Code, las clases se pueden ejecutar desde el editor. También es posible compilar
el proyecto desde una terminal:

```sh
mkdir -p bin
javac -encoding UTF-8 -d bin $(find src -name '*.java')
```

Cada ejemplo tiene una clase `App...` con un método `main`. Por ejemplo, para
ejecutar el Builder simple después de compilar:

```sh
java -cp bin creacionales.simple.builder.AppBuilder
```

Los ejemplos simples se ejecutan sin servicios externos. El Singleton de
conexión a base de datos requiere un servidor MySQL y el controlador JDBC
correspondiente para ejecutarse.
