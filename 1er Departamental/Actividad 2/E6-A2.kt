/*Con When identificar si el tipo de dato es:
 * String
 * Int
 * Double
 * Otro
 */





fun main() {
    println(identificarTipo("Kotlin"))  //String
    println(identificarTipo(false))    // Otro    
    println(identificarTipo(123))     // Int
    println(identificarTipo(123.45))  // Double

}
fun identificarTipo(dato: Any): String {
    return when (dato) {
        is String -> "Tipo de dato String"
        is Int -> "Tipo de dato Int"
        is Double -> "Tipo de dato Double"
        else -> "Otro tipo de dato"
    }
}

