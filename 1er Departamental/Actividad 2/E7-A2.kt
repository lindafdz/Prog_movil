/*Crear y utilizar una función que regrese el número de veces que se repite un nombre en 
 * la siguiente lista de nombres:
Pedro Luis, Juan Manuel, Juan Luis, María Inés, Romeo, Ernesto, 
Juan, Pedro, Ariadna, Mireya María, Ana Sofía, José Juan
 */

fun main() {
    val nombres = listOf(
        "Pedro Luis", "Juan Manuel", "Juan Luis", "María Inés", "Romeo",
        "Ernesto", "Juan Pedro", "Ariadna", "Mireya María", "Ana Sofía", "José Juan"
    )

    val nombreBusqueda= "Pedro"
    val repeticiones = contarRepeticiones(nombreBusqueda, nombres)

    println("El nombre '$nombreBusqueda' se repite $repeticiones veces en la lista.")
}

fun contarRepeticiones(nombre: String, listaNombres: List<String>): Int {
    return listaNombres.count { it.contains(nombre) }
}

