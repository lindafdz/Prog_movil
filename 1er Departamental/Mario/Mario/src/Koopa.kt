package org.example.Class

class Koopa: Enemy(name:"Koopa", strength: 2) {
    override fun collision(collider: String){
        super.collision(collider)
        println("Usando la colisión de la clase Enemy")
        when(collider){
            "Weapon" -> {

            }
        }
    }

}