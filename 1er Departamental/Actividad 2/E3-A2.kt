/**Crear una función que entregue el promedio de tres calificaciones. 
 * Esta debe recibir dos parámetros con calificaciones por defecto 8, 
 * y el tercer parámetro no debe venir predefinido. 
 */

fun main() {
    val calificacion3 = 8.5
    val promedio = CalcularPromedio(calificacion3 = calificacion3)
    println("El promedio es: $promedio")
}

fun CalcularPromedio(calificacion1: Double = 8.0, calificacion2: Double = 8.0, calificacion3: Double): Double {
    return (calificacion1 + calificacion2 + calificacion3) / 3
}

