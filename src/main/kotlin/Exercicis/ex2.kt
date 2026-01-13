package org.example.Exercicis

fun ex2(num: Int): Int{
    var valor: Int
    if (num < 1){
        valor = 1
    }
    else{
        valor = num * ex2(num - 2)
        println("$valor")
    }
    return valor
}