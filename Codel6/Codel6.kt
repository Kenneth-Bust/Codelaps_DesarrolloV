// Divide la lista de peces en agua dulce y salada según la condición
val twoLists = fish.partition { isFreshWater(it) }
println("freshwater: ${twoLists.first}")
println("saltwater: ${twoLists.second}")

// Crea un par (Pair) con un equipo y su uso
val equipment = "fish net" to "catching fish"
println("${equipment.first} used for ${equipment.second}")

// Crea un trío (Triple) con tres números y los imprime como lista
val numbers = Triple(6, 9, 42)
println(numbers.toString())
println(numbers.toList())

// Crea un par anidado y accede a sus elementos
val equipment2 = ("fish net" to "catching fish") to "equipment"
println("${equipment2.first} is ${equipment2.second}")
println("${equipment2.first.second}")

// Desestructura un par en dos variables y las imprime
val (tool, use) = equipment
println("$tool is used for $use")

// Desestructura un trío en tres variables y las imprime
val (n1, n2, n3) = numbers
println("$n1 $n2 $n3")

// Suma los elementos de una lista de números
val list = listOf(1, 5, 3, 4)
println(list.sum())

// Intenta sumar una lista de cadenas (genera error)
val list2 = listOf("a", "bbb", "cc")
println(list2.sum()) // Error

// Suma las longitudes de las cadenas en la lista
println(list2.sumBy { it.length })

// Itera sobre una lista de cadenas e imprime cada una
for (s in list2.listIterator()) {
    println("$s ")
}

// Crea un mapa (hashMap) con síntomas y enfermedades de peces
val cures = hashMapOf("white spots" to "Ich", "red sores" to "hole disease")
println(cures.get("white spots"))
println(cures["red sores"])

// Intenta obtener un valor con una clave inexistente
println(cures["scale loss"])

// Usa un valor predeterminado si la clave no existe
println(cures.getOrDefault("bloating", "sorry, I don't know"))

// Usa un valor o ejecuta código si la clave no existe
println(cures.getOrElse("bloating") { "No cure for this" })

// Crea y modifica un mapa mutable para inventario
val inventory = mutableMapOf("fish net" to 1)
inventory.put("tank scrubber", 3)
println(inventory.toString())
inventory.remove("fish net")
println(inventory.toString())

// Declara una constante en tiempo de compilación
const val rocks = 3

// Asigna un valor en tiempo de ejecución usando una función
val value1 = complexFunctionCall()

// Declara un objeto singleton con una constante
object Constants {
    const val CONSTANT2 = "object constant"
}
val foo = Constants.CONSTANT2

// Crea una clase con un companion object que contiene una constante
class MyClass {
    companion object {
        const val CONSTANT3 = "constant in companion"
    }
}

// Función de extensión para verificar si una cadena tiene espacios
fun String.hasSpaces(): Boolean {
    val found = this.find { it == ' ' }
    return found != null
}
println("Does it have spaces?".hasSpaces())

// Versión simplificada de la función anterior
fun String.hasSpaces() = find { it == ' ' } != null

// Define una clase con una propiedad pública y otra privada
class AquariumPlant(val color: String, private val size: Int)

// Función de extensión para verificar si el color es rojo
fun AquariumPlant.isRed() = color == "red"

// Clase derivada de AquariumPlant con un tamaño predeterminado
open class AquariumPlant(val color: String, private val size: Int)
class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)

// Funciones de extensión para imprimir el tipo de planta
fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

// Ejemplo de uso de funciones de impresión con diferentes tipos
val plant = GreenLeafyPlant(size = 10)
plant.print()
val aquariumPlant: AquariumPlant = plant
aquariumPlant.print()

// Propiedad de extensión para verificar si el color es verde
val AquariumPlant.isGreen: Boolean
    get() = color == "green"
println(aquariumPlant.isGreen)

// Función de extensión que maneja un receptor nulo
fun AquariumPlant?.pull() {
    this?.apply {
        println("removing $this")
    }
}
val plant: AquariumPlant? = null
plant.pull()
