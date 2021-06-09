package com.liumeng.kotlin.cainiao

/**
 * Created by liumeng on 2021/6/9 0009.
 * Describe:
 */
class Basicgrammar{
//    public 方法则必须明确写出返回类型
    //这个public为什么是灰色的 ??
    public fun sum5(a:Int,b:Int):Int = a+b
}

fun sum(a: Int, b: Int):Int {
    return a+b;
}
//表达式作为函数体，返回类型自动推断：
fun sum2(a:Int,b:Int) = a+b



fun sum3(a: Int, b: Int):Unit {
    println(a+b)
}

//Unit可以省略
fun sum4(a: Int, b: Int) {
    println(a+b)
}

fun vars(vararg v:Int) {
    for (i in v) {
        print(i)
    }
}

fun main(args: Array<String>) {
    vars(1,2,3,4,5)
    val sum: (Int, Int)->Int = {x,y -> x + y}
    println(sum(3,4))

    val a:Int = 1
    val b = 2;
    val c:Int
    c = 4
    var x= 5
    x += 1

    var d = 1
    var e = "d is $d"
    d = 2
    var f = "${e.replace("is","was")},but now is $d"
    println(e)
    println(f)

    //类型后面+?表示可为空
    var age:String? = "23"
    //抛出空指针异常
    var age2 = age!!.toInt()
    //不做处理返回null
    var age3 = age?.toInt()
    //age为空返回-1
    var age4 = age?.toInt()?:-1

    var m  = parseInt(args[0])
    var n  = parseInt(args[1])
    if (m != null && n != null) {
        println(m*n)
    }

    val stringLen = getStringLen("liumeng")
    val stringLen1 = getStringLen(3)
    println(stringLen)
    println(stringLen1)
    println(getStringLen2("liumeng"))

    print("循环输出：")
    for(i in 1..4) print(i)
    println("\n----------------")
    //设置步长
    print("设置步长：")
    for (i in 1..4 step 2) print(i)
    println("\n----------------")
    print("使用 downTo：")
    for (i in 4 downTo 1 step 2) print(i)
    println("\n----------------")
    print("使用 until：")
    for (i in 1 until 4) print(i)
}

fun parseInt(s: String): Int? {
    return s.toInt();
}

fun getStringLen(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}

fun getStringLen2(obj: Any): Int? {
    if (obj !is String) {
        return null
    }
    return obj.length
}

fun getStringlen3(obj: Any): Int? {
    if (obj is String && obj.length > 0) {
        return obj.length
    }
    return null
}
