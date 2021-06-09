package com.liumeng.kotlin.cainiao

/**
 * Created by liumeng on 2021/6/9 0009.
 * Describe:
 */
class ForLoop {

}

fun main() {
    val items = listOf("a", "b", "c")
    for (item in items) {
        println(item)
    }
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }

    for ((index, value) in items.withIndex()) {
        println("item at $index is $value")
    }

    println("----while 使用-----")
    var x = 5
    while (x > 0) {
        println(x--)
    }

    println("----do...while 使用-----")
    var y =5
    do {
        println(y--)
    } while (y > 0)

    for (i in 1..10) {
        if (i==3) continue
        println(i)
        if (i>5) break
    }
}