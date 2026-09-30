# Tarea: Mi prompt avanzado

## Tarea elegida
Generar casos de prueba y código en Java para un módulo de Registro de Usuarios en un sistema de gestión escolar.

---

## Version 1: prompt basico

```text
Crea pruebas y codigo para un registro de usuarios.
```

## Version 2: prompt intermedio

```text
Crea pruebas y codigo para un registro de usuarios.
```

## Version 3: prompt final

```text
<rol>
Actúa como un Arquitecto de Software y QA Lead especializado en aplicaciones enterprise en Java.
</rol>

<contexto>
Estamos desarrollando un sistema de gestión escolar. El módulo de registro de usuario requiere validar:
1. Correo electrónico con dominio obligatorio "@colegio.edu.pe".
2. Contraseña con mínimo 8 caracteres, al menos un número y un símbolo especial.
3. Rol asignado (Estudiante, Docente, Padre).
</contexto>

<tarea>
1. Piensa paso a paso (Chain of Thought) qué validaciones y excepciones pueden fallar en la lógica de negocio.
2. Genera 4 casos de prueba clave según los ejemplos provistos.
3. Escribe la clase `UsuarioService.java` que implemente estas validaciones.
</tarea>

<ejemplos>
TC01 | Registro exitoso con datos válidos | juan@colegio.edu.pe, Pass123! | Usuario registrado exitosamente.
TC02 | Dominio de correo inválido | juan@gmail.com, Pass123! | Error: El correo debe pertenecer al dominio @colegio.edu.pe.
</ejemplos>

<formato>
- Casos de prueba en una tabla Markdown con las columnas: ID | Escenario | Datos de Entrada | Resultado Esperado.
- Código en Java limpio y documentado dentro de un bloque de código ```java.
</formato>

<autocritica>
Al finalizar, revisa tu respuesta y verifica: ¿Faltó validar campos nulos o vacíos? Si es así, agrega los métodos de validación faltantes al código Java e indícalo en un breve comentario final.
</autocritica>
```



| Técnica de Prompting | Ubicación en el Prompt Final | Propósito |
|--------|--------------------|---------------------------|
| Role Prompting |Etiquetas <rol>...</rol> |Define la perspectiva y nivel de experiencia técnica esperada (Arquitecto y QA Lead). |
| Prompt Estructurado |Uso de etiquetas XML (<rol>, <contexto>, etc.) |Separa ordenadamente las instrucciones para evitar ambigüedades. |
| Chain of Thought |Etiqueta <tarea>, punto 1 |Fuerza a la IA a razonar los fallos de negocio antes de generar las soluciones. |
| Few-Shot |Etiquetas <ejemplos>...</ejemplos> |Fija la estructura y sintaxis exacta que debe tener la tabla de prueba. |



| Evaluacion de resultado | Cumple (Sí / No) | Observaciones |
|--------|--------------------|---------------------------|
| ¿Asigna un rol específico y contextualizado? |Si |Se definió el rol de Arquitecto de Software y QA Lead en Java. |
|¿Aplica al menos 3 técnicas avanzadas en el prompt final? |Si |Se aplicaron 6 técnicas (Role, Estructurado, CoT, Few-Shot, Descomposición, Autocrítica). |
| ¿Define un formato claro de salida para la respuesta? |Si |Especifica la tabla Markdown para pruebas y bloque java para el código. |
| ¿Incluye autocrítica y ajusta la solución? |Si |La IA detecta casos nulos e incluye métodos de validación adicionales. |