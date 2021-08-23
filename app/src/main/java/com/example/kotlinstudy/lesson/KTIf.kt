package com.example.kotlinstudy.lesson

import java.lang.IllegalArgumentException

/**
 *  Created by zx on 2021/8/19 20:50
 *  Describe: 条件语句 if when
 */
fun main(args: Array<String>) {
    eval(333)
    eval2(2.2)

    val value = getValue()
    when(value) {
        is Int -> "Int $value".apply(::println)
        else -> "Any $value".apply(::println)
    }
    when(val value2 = getValue()) {
        is Int -> "Int $value2".apply(::println)
        else -> "Any $value".apply(::println)
    }
}

fun getValue(): Any {
    return 100f
}

fun maxOf(a: Int, b:Int) : Int {
    if(a>b) {
        return a
    } else {
        return b
    }
}

fun maxOf2(a: Int, b:Int) : Int {
    //三目运算
    return if(a>b) a else b
}

//多级运算
fun eval(a: Number) {
    // is判断是否是某一种类型
    if(a is Int) {
        println("this is int number")
    } else if(a is Float) {
        println("this is Float number")
    } else if(a is Long) {
        println("this is Long number")
    } else if(a is Double) {
        println("this is Double number")
    } else if(a is Short) {
        println("this is Short number")
    } else if(a is Byte) {
        println("this is Byte number")
    } else {
        throw IllegalArgumentException("invalid argument")
    }
}
// when表达式
// when同样是带有返回值的
// when将他的参数与所有分支条件顺序比较，直到某个分支满足条件
fun eval2(num: Number): String = when(num) {
    200f -> "this is Float number"
    is Int -> "this is int number"
    is Double -> "this is Double number"
    is Float -> {
        println("the is Float number")
        "this is Float number"
    }
    is Long -> "this is Long number"
    is Byte -> "this is Byte number"
    is Short -> "this is Short number"
    else -> "invalid number"
}