package org.example.Exercicis

fun ex3(num: Int): Int{
    var valor: Int
    if (num > 9){
        valor = ex3(num/10) + 1
    }else valor = num
    return valor
}