package org.example.Exercicis

fun ex4(num: Int): Int{
    var valor: Int
    if (num > 9){
        valor = ex3(num/10)
    }else valor = num +1
    return valor
}