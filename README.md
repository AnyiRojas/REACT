# Documentación de React

## React

### ¿Qué es React?
React es una biblioteca de JavaScript creada por Facebook. Es una herramienta para crear componentes de UI.

### ¿Cómo funciona React?
React crea un DOM virtual donde realiza la manipulación necesaria antes de realizar algún cambio en el navegador, optimizando los cambios necesarios.

### Configuración de un entorno React
Para crear una aplicación de manera global:
```
npx create-react-app my-react-app
```
Para desinstalarlo:
```
npm uninstall -g create-react-app
```
### Ejecutar la aplicación React

Para moverse al directorio:
```
cd my-react-app
```
Para ejecutar la aplicación:
```
npm start
```
# ES6 (JavaScript)

## ¿Qué es ES6?
ES6 es un estándar de lenguaje de scripting desarrollado de acuerdo con las indicaciones contenidas en el documento proporcionado por Ecma International (European Computer Manufacturers Association).

## Clases
Una clase es un tipo de función, pero en lugar de usar la palabra clave `function` para iniciarla, usamos la palabra clave `class`.

## Métodos en clases
Puedes agregar tus propios métodos en una clase.
```
class Persona(var nombre: String, var edad: Int) {
    fun presentarse() {
        println("Hola, soy $nombre y tengo $edad años.")
    }
}
```

## Herencia de clase
Para crear una herencia de clase, utilice la palabra clave `extends`.

## Funciones de flecha
Las funciones de flecha nos permiten escribir una sintaxis de función más corta:
```
// Ejemplo de función de flecha en JavaScript
const sumar = (a, b) => a + b;

// Uso de la función de flecha
const resultado = sumar(10, 5);
console.log(`La suma es: ${resultado}`);
```

## ¿Qué pasa con `this`?
`this` es diferente en las funciones de flecha en comparación con las funciones regulares. En resumen, con las funciones de flecha no hay vinculación de `this`.

## Variables
- Si usas `var` fuera de una función, pertenece al ámbito global.
- Si usas `var` dentro de una función, pertenece a esa función.
- Si usas `var` dentro de un bloque, es decir, un bucle `for`, la variable aún estará disponible fuera de ese bloque.
- `let` es la versión con ámbito de bloque de `var`, y está limitada al bloque (o expresión) donde está definida. Termina siendo local.
- `const` es una variable que una vez creada su valor nunca podrá cambiar.
```
fun variables() {
    var contador = 0  
    contador += 1

    val nombre = "María" 
    println("Hola, $nombre. Contador: $contador")
}
```

## Métodos de matriz
El `.map()` método le permite ejecutar una función en cada elemento de la matriz y devolver una nueva matriz como resultado.

## Desestructuración
Es una expresión de JavaScript que permite desempacar valores de arreglos o propiedades de objetos en distintas variables.
```
fun desestructuracion() {
    val (nombre, edad) = Pair("Juan", 25)
    println("Nombre: $nombre, Edad: $edad")
}
```

### Desestructuración de matrices
Permite asignar valores de un arreglo a variables individuales de forma directa.

### Desestructuración de objetos
Consiste en extraer valores de propiedades específicas de un objeto y asignarlos a variables con los mismos nombres.

## Operador de propagación
Este permite copiar rápidamente todo o parte de una matriz u objeto existente en otra matriz u objeto.
```
fun operadorPropagacion() {
    val lista1 = listOf(1, 2, 3)
    val lista2 = listOf(*lista1.toTypedArray(), 4, 5)
    println(lista2)  // Imprime [1, 2, 3, 4, 5]
}
```

## Módulos
Son componentes autónomos que encapsulan tanto la interfaz visual como la lógica, permitiendo una estructura más clara.

### Exportar
Puede exportar una función o variable desde cualquier archivo.

### Importar
Puede importar módulos a un archivo de dos maneras, dependiendo de si son exportaciones con nombre o exportaciones predeterminadas.

## Operador ternario
El operador ternario es un operador condicional simplificado como `if/else`.

## La función Render
Permite a los desarrolladores controlar dinámicamente qué contenido se muestra en la pantalla en función de valores específicos que pueden almacenarse en una variable, estado o propósito.

## El código HTML
El código HTML de este tutorial utiliza JSX, lo que le permite escribir etiquetas HTML dentro del código JavaScript.
## El nodo raíz
El nodo raíz es el elemento HTML donde desea mostrar el resultado.

## ¿Qué es JSX?
JSX es una extensión sintáctica para JavaScript que permite a los desarrolladores escribir código similar al HTML dentro de un archivo JavaScript.

## Codificación JSX
JSX nos permite escribir elementos HTML en JavaScript y colocarlos en el DOM sin necesidad de usar `createElement()` y/o `appendChild()`.

## Expresiones en JSX
La expresión puede ser una variable o propiedad de React, o cualquier otra expresión válida de JavaScript. JSX ejecutará la expresión y devolverá el resultado.

## Insertar un bloque grande de HTML
Para escribir HTML en varias líneas, coloque el HTML entre paréntesis.

## Un elemento de nivel superior
El código HTML debe estar envuelto en un único elemento de nivel superior.

## Los elementos deben estar cerrados
JSX sigue las reglas XML y, por lo tanto, los elementos HTML deben cerrarse correctamente.

## Clase de atributo = nombreClase
El atributo `class` es muy utilizado en HTML, pero como JSX se representa como JavaScript y la palabra clave `class` es una palabra reservada en JavaScript, no está permitido utilizarla en JSX. En su lugar, use `className`.

## Condiciones - declaraciones `if`
Para usar declaraciones condicionales en JSX, debes colocar las declaraciones `if` fuera de JSX, o puedes usar una expresión ternaria en su lugar.

## Componentes de React
Los componentes son fragmentos de código independientes y reutilizables. Cumplen la misma función que las funciones de JavaScript, pero funcionan de forma aislada y devuelven HTML.

### Componente de clase
Un componente de clase debe incluir la declaración `extends React.Component`. Esta declaración crea una herencia para `React.Component` y le otorga a su componente acceso a las funciones de `React.Component`.

### Componente de función
Un componente de función también devuelve HTML y se comporta de forma muy similar a un componente de clase, pero los componentes de función se pueden escribir utilizando mucho menos código, son más fáciles de entender y serán los preferidos en este tutorial.
```
fun Saludo(props: Map<String, Any>): String {
    val nombre = props["nombre"] ?: "Invitado"
    return "Hola, $nombre!"
}
```

## Accesorios
Los accesorios son como argumentos de función y se envían al componente como atributos.

## Componentes en Componentes
Se pueden definir componentes dentro de otros componentes de la misma manera en la que defines otro elemento JSX.

## Componentes en archivos
React se trata de reutilizar código y se recomienda dividir los componentes en archivos separados.

## Constructor de componentes
La función constructora también es donde se respeta la herencia del componente padre al incluir la declaración `super()`, que ejecuta la función constructora del componente padre, y su componente tiene acceso a todas las funciones del componente padre (`React.Component`).

## Accesorios en el Constructor
Si su componente tiene una función constructora, las propiedades siempre deben pasarse al constructor y también a `React.Component` a través del método `super()`.

## Creando el objeto de estado
El objeto de estado se inicializa en el constructor:
```
constructor(props) {
  super(props);
  this.state = { valor: 0 };
}
```

## Usando el objeto de estado
Haga referencia al objeto de estado en cualquier lugar del componente utilizando la sintaxis this.state.propertyname.

Cambiando el objeto de estado
Para cambiar un valor en el objeto de estado, se utiliza el método this.setState():
```
this.setState({ valor: nuevoValor });
```

## Accesorios de React
Las propiedades de React son como argumentos de función en JavaScript y atributos en HTML.

## Pasar datos
Los accesorios también son la forma de pasar datos de un componente a otro, como parámetros.

##Agregar eventos
Los eventos de React se escriben en sintaxis camelCase:
```
onClick={this.handleClick}
```

## Pasando argumentos
Para pasar un argumento a un controlador de eventos, se utiliza una función de flecha.

## Objeto de evento de React
Los controladores de eventos tienen acceso al evento React que activó la función.

## if Declaración
Podemos utilizar el if operador JavaScript para decidir qué componente renderizar.

## && Operador lógico
Otra forma de representar condicionalmente un componente React es mediante el operador &&.

## Agregar formularios en React
Agrega un formulario con React como cualquier otro elemento:
```
<form>
  <input type="text" />
</form>
```

## Manejo de formularios
El manejo de formularios tiene que ver con cómo se manejan los datos cuando cambian de valor o se envían.

##Envío de formularios
Puede controlar la acción de envío agregando un controlador de eventos en el atributo onSubmit para <form>:
```
<form onSubmit={this.handleSubmit}>
  <input type="text" />
</form>
```
## Campos de entrada múltiples
Puede controlar los valores de más de un campo de entrada agregando un name atributo a cada elemento.

## Área de texto
En HTML, el valor de un área de texto era el texto entre la etiqueta de inicio <textarea> y la etiqueta final </textarea>.

## Seleccionar
En HTML, el valor seleccionado en la lista desplegable se definió con el atributo selected:

```
<select value={this.state.value} onChange={this.handleChange}>
  <option value="valor1">Valor 1</option>
  <option value="valor2">Valor 2</option>
</select>
```

Este README.md proporciona una visión general de React y ES6 en JavaScript, con explicaciones y ejemplos prácticos para cada tecnología.
