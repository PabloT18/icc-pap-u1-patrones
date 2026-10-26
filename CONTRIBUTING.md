Guía de contribución
Gracias por contribuir a Ejemplos de patrones de diseño, un repositorio educativo de implementaciones en Java.
Objetivo
Las contribuciones deben facilitar la comprensión de los patrones de diseño y conservar ejemplos claros, ejecutables y organizados.
Organización
Los ejemplos se agrupan en src/creacionales/, src/estructurales/ y src/comportamiento/.
Cada categoría distingue dos modalidades:
- simple/<patron>/: implementación directa, con pocas abstracciones y clases de nivel superior, sin clases anidadas para representar participantes del patrón.
- complete/<patron>/: implementación que expone los participantes, sus responsabilidades y relaciones; incluye un diagrama UML en asset/ cuando corresponda.
Utiliza nombres de directorios en minúsculas y sin espacios. Respeta los paquetes Java correspondientes a la ruta del código fuente.
Criterios para nuevos ejemplos
1. Selecciona la clasificación y el patrón adecuados.
2. Emplea un contexto sencillo y diferente entre las modalidades simple y complete.
3. Identifica con claridad los participantes del patrón y evita abstracciones innecesarias.
4. Incluye una clase App... con método public static void main(String[] args) que demuestre el funcionamiento.
5. Mantén cada clase participante en su propio archivo .java y utiliza nombres descriptivos.
6. Evita dependencias externas en los ejemplos simples. Si alguna integración las requiere, documenta sus requisitos y cómo ejecutarla.
7. Actualiza la tabla de patrones del README.md cuando agregues o completes un ejemplo.
8. Si incorporas diagramas UML, asegúrate de que coincidan con el código.
Estilo de código
- Sigue las convenciones de Java: clases e interfaces en PascalCase, métodos y variables en camelCase, constantes en UPPER_SNAKE_CASE.
- Usa sangría de cuatro espacios y codificación UTF-8.
- Prioriza código legible, responsabilidades delimitadas y ejemplos reproducibles.
- Incluye comentarios cuando aclaren una decisión de diseño; evita comentarios que repitan literalmente el código.
- No incluyas credenciales, contraseñas, archivos compilados ni configuraciones locales.
Validación
Desde la raíz del repositorio, compila todos los archivos fuente:
mkdir -p bin
javac -encoding UTF-8 -d bin $(find src -name '*.java')
Ejecuta la clase principal del ejemplo que hayas agregado o modificado. Por ejemplo:
java -cp bin creacionales.simple.builder.AppBuilder
El ejemplo simple de Singleton con conexión a base de datos requiere MySQL y el controlador JDBC correspondiente. No se exige levantar servicios externos para verificar los demás ejemplos simples.
Propuesta de cambios
1. Abre un issue para plantear cambios importantes o nuevos enfoques.
2. Crea una rama descriptiva, por ejemplo feat/strategy-complete o docs/uml-builder.
3. Realiza cambios acotados a un patrón o mejora concreta.
4. Comprueba la compilación y la ejecución del ejemplo afectado.
5. Abre un pull request dirigido a main e incluye:
   - Patrón y modalidad modificados.
   - Explicación breve del cambio y su finalidad educativa.
   - Instrucciones de ejecución y resultado esperado.
   - Actualizaciones del README o diagramas, si corresponden.
Las propuestas se revisarán por corrección técnica, claridad didáctica, coherencia con la estructura del repositorio y facilidad de ejecución.
Conducta
Mantén una comunicación respetuosa y constructiva en los issues, revisiones y pull requests.