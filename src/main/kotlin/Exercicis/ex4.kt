package org.example.Exercicis

import kotlin.math.sign

fun ex4(num: Int): Int{
    var valor: Int = 0
    if (num > 9){
        var rest = num % 10
        rest *= 10
        valor = num / 10

    }else valor = 1
    return valor
}