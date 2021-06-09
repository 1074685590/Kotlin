package com.liumeng.kotlin.cainiao

/**
 * Created by liumeng on 2021/6/9 0009.
 * Describe:
 */
class BasicDateType {
}

fun main() {
    var a:Int = 1000
    println(a===a) //true

    var boxedA:Int? = a
    var boxedAntherA:Int? = a
    println(boxedA === boxedAntherA)
    println(boxedA==boxedAntherA)

    var b:Byte = 1 //OK, 字面值是静态检测的
    //由于不同的表示方式，较小类型并不是较大类型的子类型，较小的类型不能隐式转换为较大的类型。
    // 这意味着在不进行显式转换的情况下我们不能把 Byte 型值赋给一个 Int 变量。
//    var c:Int = b //错误
    //我们可以用toInt代替
    var c:Int =  b.toInt()

    //[1,2,3]
    val d = arrayOf(1,2,3)
    //0,2,4
    val e = Array<Int>(3,{i->(i*2)})
    println(d[0])
    println(e[1])

    val text = """
    多行字符串
    多行字符串
    """
    println(text)   // 输出有一些前置空格

    val text2 = """
    |多行字符串
    |菜鸟教程
    |多行字符串
    |Runoob
    """.trimMargin()
    println(text2)    // 前置空格删除了

    var f =1
    var g = "f = $f"
    println(g)

    val s = "runoob"
    val str = "$s.length is ${s.length}"
    println(str)

    val h = "${'$'}9.99"
    println(h)
}

fun check(c: Char) {
    //if (c==1) //错误,类型不兼容
}

fun decimalDigitValue(c:Char):Int {
    if (c !in '1'..'9') {
        throw IllegalArgumentException("out of range")
    }
    return c.toInt()
}