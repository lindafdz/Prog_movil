/**Utilizar la función promedio, Comentar qué pasa si se ingresa sólo una calificación 
 * en la función y después con dos. Finalmente, buscar que la función corra enviando 
 * únicamente la tercera calificación con 10f.
 * 
 * 
 * Si se ingresa una sola calificaciòn Kotlin asumirá que estás ingresando el valor de calificacion1.
 * Ya que es obligatorio proporcionar la calificacion3, te da un error de compilación indicando que 
 * faltan parámetros.
 * 
 * Si ingresas dos valores, estos se asignarán a calificacion1 y calificacion2, te da un error 
 * porque calificacion3 es un parámetro obligatorio sin valor predeterminado y la función lo espera.
 */

fun main() {
    // Para que funcione con 10f pasamos el valor de la tercera calificación como un Float
    val promedio = calcularPromedio(calificacion3 = 10f)
    println("El promedio es: $promedio")
}

fun calcularPromedio(calificacion1: Float = 8.0f, calificacion2: Float = 8.0f, calificacion3: Float): Float {
    return (calificacion1 + calificacion2 + calificacion3) / 3
}
