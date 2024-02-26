/**
 * Crear una función que calcule el área de un rectángulo por medio de su base y altura,
 * implementarla en main.
 */


fun main() {
    val base = 5.2  
    val altura = 8.09
    val area = AreaRectangulo(base, altura)
    println("El área del rectángulo es: $area")
}

fun AreaRectangulo(base: Double, altura: Double): Double {
    return base * altura
}
