/*Crear una función que pida como parámetros las medidas de los lados de un triángulo. 
 * Debe imprimirnos el tipo de tríangulo:
 * Equilatero: los tres lados tienen el mismo valor
 * Isóceles: Tiene dos lados iguales
 * Escaleno: Los tres lados son diferentes
 */

fun main() {
    println(tipoTriangulo(5, 5, 5))  // Equilátero
    println(tipoTriangulo(5, 6, 7))  // Escaleno
    println(tipoTriangulo(5, 5, 8))  // Isósceles

}

fun tipoTriangulo(lado1: Int, lado2: Int, lado3: Int): String {
    return if (lado1 == lado2 && lado2 == lado3) {
        "El triangulo es Equilátero"
    } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
        "El triangulo es Isósceles"
    } else {
        "El triangulo es Escaleno"
    }
}


