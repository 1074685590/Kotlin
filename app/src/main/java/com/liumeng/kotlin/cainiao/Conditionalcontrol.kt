package com.liumeng.kotlin.cainiao

/**
 * Created by liumeng on 2021/6/9 0009.
 * Describe:
 */
class Conditionalcontrol {
    var a:Int = 3
    var b:Int = 4

    fun getMax(a: Int, b: Int): Int {
        var max = a
        if(a<b) max=b
        return max
    }

    fun getMax2(a: Int, b: Int): Int {
        var max:Int
        if(a<b) {
            max=b
        }else{
            max =a;
        }
        return max
    }

    val max = if (a>b) a else b

}

fun main() {
    val x = 5
    val y = 10
    if (x in 1..9) {
        println("x在区间内")
    }

    when (x) {
        0, 1 -> println("x==1 or x==0")
        else -> println("otherwise")
    }

    when (x) {
        1 -> println("x==1")
        2 -> println("x==2")
        else -> {
            println("x不是1,也不是2")
        }
    }

    when (x) {
        in 0..10 -> println("x在该范围内")
        else -> println("x不在范围内")
    }

    val items = setOf("a", "b", "c")
    when {
        "d" in items-> println("d")
        "b" in items-> println("b is good ")
    }

}


