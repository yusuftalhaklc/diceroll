package com.yusuftalhaklc.kotlin101

fun main () {

    val yas = 222
    when(yas){
        in 1..17 -> print("Yetişkin değil")
        in 18..150 -> print("Yetişkin")
        else -> print("Aralıkta değil")
    }
}