/**
 * Crear otra función para calcular el volumen de un prisma rectangular, utilizar la función de área.
 */



fun main() {
    val base = 12.0 
    val altura = 5.06
    val largo= 13.8
    val volumen = VolumenPrismaRectangular(base, altura, largo)
    println("El volumen del prisma es: $volumen")
}

fun VolumenPrismaRectangular(base: Double, altura: Double, largo: Double): Double {
    val areaBase = AreaRectangulo(base, altura)
    return areaBase * largo
}

fun AreaRectangulo(base: Double, altura: Double): Double {
    return base * altura
}
