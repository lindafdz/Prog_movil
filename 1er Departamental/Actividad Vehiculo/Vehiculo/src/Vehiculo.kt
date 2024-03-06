package vehiculos
class Vehiculo(var color: String, var marca: String, var modelo: String, var placas: String) {
    var encendido = false
    var gasolina = 0f

    fun encender() {
        if (!encendido && gasolina > 0) {
            encendido = true
            println("El vehículo está encendido.")
        } else if (gasolina <= 0) {
            println("No se puede encender. El tanque está vacío.")
        } else {
            println("El vehículo ya está encendido.")
        }
    }

    fun apagar() {
        if (encendido) {
            encendido = false
            println("El vehículo está apagado.")
        } else {
            println("El vehículo ya está apagado.")
        }
    }

    fun recargar(litros: Float) {
        gasolina += litros
        println("Se han recargado $litros litros. Total en tanque: $gasolina litros.")
    }
}
