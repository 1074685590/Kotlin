package com.liumeng.kotlin

/**
 * Created by liumeng on 2021/6/9 0009.
 * Describe:
 */
class KotlinTest {
    fun sum(a: Int, b: Int) :Int{
        return a+b
    }
}
fun main(args: Array<String>) {    // 包级可见的函数，接受一个字符串数组作为参数
    var test  =  KotlinTest ()
    val sum = test.sum(1, 3)
    println(sum)

}