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
  abstracción y un contexto distinto al de los ejemplos completos. Cada clase
  se mantiene en su propio archivo.

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

Actualmente, los ejemplos implementados corresponden a patrones creacionales:

| Patrón | Ejemplo completo | Ejemplo simple |
| --- | --- | --- |
| Abstract Factory | Equipos y conversión de temperatura | Componentes de temas visuales |
| Builder | Configuración de un plan de muestreo | Preparación de una pizza |
| Factory Method | Importación de lecturas | Generación de saludos |
| Prototype | Copia de perfiles de sensores | Copia de una plantilla de correo |
| Singleton | Configuración de muestreo | Conexión a base de datos |

Las carpetas para patrones estructurales y de comportamiento forman parte de la
organización prevista del proyecto; sus ejemplos se agregarán posteriormente.

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
