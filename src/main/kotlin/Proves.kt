package org.example


fun main(num: Int): Int{
    var valor: Int
    if (num > 9){
        valor = main(num/10) % 10
    }else valor = 1
    return valor
}