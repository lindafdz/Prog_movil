//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
1.Crear una clase que represente un vehículo, que tenga las siguientes propiedades y métodos.
Propiedades: Color, Marca, Modelo, Placas, Encendido (Prendido o Apagado), Gasolina
Métodos
Encender, Apagar, Recargar
1.Crear un objeto de Vehículo y setear los datos de tu coche:
Color, Marca, Modelo, Placas
1.Checar si el coche está encendido (imprimiendo el status del coche), encender el coche y volver a checar.
1.Verificar en nivel del tanque imprimiendo la cantidad de gasolina, recargar unos cuantos litros y después volver a consultar.
1.Crear una clase Person con datos de constructor:
Nombre, Apellidos, Sexo, Altura
 */
import vehiculos.Vehiculo
import personas.Persona

fun main() {
    // Creación y configuración de un objeto Vehiculo
    val miCoche = Vehiculo("Rojo", "Toyota", "Corolla", "XAW253")
    println("Vehículo creado: ${miCoche.marca} ${miCoche.modelo} con placas ${miCoche.placas} y color ${miCoche.color}")

    // Checar estado del coche y encenderlo
    println("¿Está el coche encendido? ${miCoche.encendido}")
    miCoche.encender() // Intenta encender sin gasolina
    miCoche.recargar(20.0F) // Recarga gasolina
    miCoche.encender() // Enciende con gasolina
    println("¿Está el coche encendido después de encender? ${miCoche.encendido}")

    // Recargar gasolina y verificar el nivel
    println("Nivel actual de gasolina: ${miCoche.gasolina} litros")
    miCoche.recargar(10.0F)
    println("Nivel de gasolina después de recargar: ${miCoche.gasolina} litros")

    // Creación de un objeto Persona
    val persona = Persona("Diana", "Robles", "Femenino", 1.70)
    println("Persona creada: ${persona.nombre} ${persona.apellidos}, ${persona.sexo}, ${persona.altura}m de altura")
}