// Fernández Olvera Linda María

// Clase abstracta Travel
abstract class Travel(val country: String, val city: String, val pricePerDay: Int) {
    // Método abstracto para obtener precio
    abstract fun getPrice(): Int
}
interface Cancellable {
    fun cancelTrip(): String
}
// Clase International para viajes internacionales
class International(country: String, city: String, pricePerDay: Int) : Travel(country, city, pricePerDay) {
    // Impuestos por país y ciudad
    private val taxes = mapOf(
        "Alemania" to 0.16,
        "Chile" to 0.05,
        "Canadá" to 0.10
    )

    // Precios por día por ciudad
    private val cityPrices = mapOf(
        "Alemania" to mapOf(
            "Munich" to 980,
            "Berlín" to 820,
            "Francfort" to 850
        ),
        "Chile" to mapOf(
            "Santiago" to 643,
            "Valparaíso" to 721
        ),
        "Canadá" to mapOf(
            "Vancouver" to 620,
            "Ottawa" to 680,
            "Montreal" to 600
        )
    )

    // Método para calcular el precio con impuestos incluidos
    override fun getPrice(): Int {
        val taxRate = taxes[country] ?: 0.0 // Si el país no está en el mapa, se asume 0%
        val cityPrice = cityPrices[country]?.get(city) ?: 0 // Si la ciudad no está en el mapa, se asume 0
        val totalPrice = cityPrice * 1.0 // Precio sin impuestos
        val totalPriceWithTax = totalPrice * (1 + taxRate) // Precio con impuestos
        return totalPriceWithTax.toInt()
    }
}

// Clase NationalLowSeason para viajes nacionales en temporada baja
class NationalLowSeason(country: String, city: String, pricePerDay: Int) : Travel(country, city, pricePerDay), Cancellable {
    override fun getPrice(): Int {
        // Implementación del método getPrice para temporada baja
        return pricePerDay
    }

    override fun cancelTrip(): String {
        return "Su viaje  a $city, $country ha sido cancelado."
    }
}

fun main() {
    // Solicitar al usuario que ingrese el país y la ciudad
    println("Ingrese el país:")
    val country = readLine() ?: ""
    println("Ingrese la ciudad:")
    val city = readLine() ?: ""

    // Verificar si el país y la ciudad ingresados están en la lista de destinos
    val validDestinations = setOf(
        "Munich", "Berlín", "Francfort", // Alemania
        "Santiago", "Valparaíso", // Chile
        "Vancouver", "Ottawa", "Montreal" // Canadá
    )

    if (country !in listOf("Alemania", "Chile", "Canadá") || city !in validDestinations) {
        println("Lo siento, el país o la ciudad ingresada no están disponibles para viajes internacionales.")
    } else {
        // Calcular el precio del viaje con impuestos incluidos
        val internationalTrip = International(country, city, 0) // Precio por día no es relevante aquí
        val totalPrice = internationalTrip.getPrice()

        // Mostrar el precio del viaje con impuestos incluidos
        println("El precio del viaje a $city, $country es: $totalPrice")
    }
    // Preguntar al usuario si desea cancelar el viaje
    println("¿Desea cancelar su viaje? (si/no)")
    val decision = readLine()?.toLowerCase()
    val nationalTrip = NationalLowSeason(country, city, 0)
    if (decision == "si") {
        println(nationalTrip.cancelTrip())
    } else {
        println("Gracias por su elección. ¡Que tenga un buen viaje!")
    }
}
