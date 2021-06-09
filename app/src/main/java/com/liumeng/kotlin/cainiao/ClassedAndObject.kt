package com.liumeng.kotlin.cainiao

/**
 * Created by liumeng on 2021/6/9 0009.
 * Describe:
 */
class ClassedAndObject {
}

class Person {

    var lastName:String = "zhang"
         get() = field.toUpperCase() //将变量赋值后转为大写
         set
    var no:Int = 100
        get() = field
        set(value) {
            if (value < 10) {
                field = value
            } else {
                field = -1
            }
        }
    var height:Float = 145.4f
        private set

}

fun main() {
    var person:Person = Person()
    person.lastName = "wang"
    println("lastName:${person.lastName}")

    person.no = 9
    println("no:${person.no}")

    person.no = 20
    println("no:${person.no}")
}