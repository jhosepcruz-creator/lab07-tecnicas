# Bitacora de tecnicas avanzadas

Laboratorio 07: Tecnicas Avanzadas de Prompting.
Herramienta de IA usada: (escribe aqui cual usaste)

## Ejercicio 2: Zero-shot, one-shot y few-shot
| Tipo | Aciertos (de 5) | Formato de la respuesta | Todas con el mismo formato (Si/No) |
|------|-----------------|-------------------------|------------------------------------|
| Zero-shot |5 |Me encantó, llegó rápido: Positivo |Si |
| One-shot |5 |Positivo |Si |
| Few-shot |5 |"Me encanto, llego rapido" -> Positivo |Si |


## Ejercicio 3: Chain of Thought
| Pedido | Respuesta de la IA | Muestra los pasos (Si/No) | Correcta (Si/No) |
|--------|--------------------|---------------------------|------------------|
| Directo |318.60 |Si |Si |
| Paso a paso |318.60 |Si |Si |


## Ejercicio 4: Role prompting
| Version | Vocabulario (sencillo/tecnico) | Usa ejemplos o codigo | A quien le sirve mas |
|---------|-------------------------------|-----------------------|----------------------|
| A. Sin rol |Sencillo |Si |Al principiante |
| B. Rol docente |Sencillo |Si |Al principiante |
| C. Rol senior |Tecnico |Si |Al experto |


## Ejercicio 5: Descomposicion
- Paso 1: 5 viñetas con los requisitos pedidos.
- Paso 2: Estructuración de las clases.
- Paso 3: Código de Java.
- Paso 4: Se nos presenta 3 mejoras en el código.

## Ejercicio 6: Prompt estructurado y autocritica
| Qué revisar | Cumple (Si/No)|
|---------|-------------------------------|
| ¿Tiene las 4 columnas pedidas? |Si|
| ¿Incluye el bloqueo después de 3 intentos? |Si |
| ¿Incluye casos con campos vacíos? |Si |
| ¿Indica qué casos agregó en la autocrítica?|Si |
| ¿Hay algún caso repetido o que no tenga sentido? |No |

```text
PROMPT:
Revisa tu tabla: faltan casos limite como campos
vacios, correo sin @ o contrasena con espacios? Agrega los que falten e indica cuales agregaste.

AUTOCRITICA:
Tienes toda la razón. En la versión anterior me enfoqué principalmente en la lógica del contador de intentos y el bloqueo, omitiendo validaciones de sintaxis y campos obligatorios (casos límite de entrada).
```
