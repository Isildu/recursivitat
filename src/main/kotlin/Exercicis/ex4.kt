package org.example.Exercicis

fun ex4(num: Int): Int{
    var valor: Int
    if (num > 9){
        valor = ex4(num/10) % 10
    }else valor = 1
    return valor
}