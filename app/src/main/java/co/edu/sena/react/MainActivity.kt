// Clase en Kotlin
class Persona(var nombre: String, var edad: Int) {
    // Método en la clase Persona
    fun presentarse() {
        println("Hola, soy $nombre y tengo $edad años.")
    }
}

// Función de flecha en Kotlin
val sumar = { a: Int, b: Int -> a + b }

// Variables en Kotlin
fun variables() {
    var contador = 0  // Variable mutable
    contador += 1

    val nombre = "María"  // Variable inmutable
    println("Hola, $nombre. Contador: $contador")
}

// Desestructuración en Kotlin
fun desestructuracion() {
    val (nombre, edad) = Pair("Juan", 25)
    println("Nombre: $nombre, Edad: $edad")
}

// Operador de propagación en Kotlin
fun operadorPropagacion() {
    val lista1 = listOf(1, 2, 3)
    val lista2 = listOf(*lista1.toTypedArray(), 4, 5)
    println(lista2)  // Imprime [1, 2, 3, 4, 5]
}

// Componente de función en Kotlin
fun Saludo(props: Map<String, Any>): String {
    val nombre = props["nombre"] ?: "Invitado"
    return "Hola, $nombre!"
}

// Función principal que llama a todos los ejemplos
fun main() {
    val persona = Persona("Juan", 30)
    persona.presentarse()

    val resultado = sumar(10, 5)
    println("La suma es: $resultado")

    variables()

    desestructuracion()

    operadorPropagacion()

    val mensaje = Saludo(mapOf("nombre" to "Carlos"))
    println(mensaje)
}
