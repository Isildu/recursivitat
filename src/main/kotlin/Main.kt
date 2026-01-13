package org.example
import org.example.utilities.*
import org.example.Exercicis.*
fun main() {
    menu()
}
fun mostrarMenu(){
    println("Escolleix un dels exercicis (no se cuanta memoria gasta per lo que cap no tancare el menu dins un bucle): \n"+
            "1. Càlcul del Factorial \n" +
            "2. Càlcul del Doble Factorial \n" +
            "3. Càlcul de la quantitat de xifres d'un número \n" +
            "4. Número invertit \n" +
            "5. La sèrie Fibonacci \n" +
            "6. Nombres creixents \n" +
            "7. Reducció de dígits \n" +
            "8. Primers perfectes \n" +
            "9. Torres de Hanoi \n"

    )
}
fun menu(){
    mostrarMenu()
    var opcio = readInt("Escolleix un numero de les opcions", "No se a introduit un nombre enter", "Nombre no pot ser inferior a 1 ni superior a 9", 1, 9)
    when (opcio){
        1 -> ex1(readInt("Introdueix un numero per obtenir el seu factorial", "No se a introduit un nombre enter", "Nombre no pot ser negatiu ni superior a 12(limitacions del programa)", 0, 12))
        2 -> ex2(readInt("Introdueix un numero per obtenir el seu factorial", "No se a introduit un nombre enter", "Nombre no pot ser negatiu ni superior a 12(limitacions del programa)", 0, 12))
        else -> println("En proces de desarrollament")
    }
}