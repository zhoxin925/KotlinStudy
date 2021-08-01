package com.example.kotlinstudy.lesson

import org.json.JSONObject

/**
 *  Created by zx on 2021/7/22 20:04
 *  Describe: 数据容器
 *  数组
 */
//psvm

fun main() {
    val arrayNumber: Array<Int> = arrayOf(1, 2, 3)
    val stringNumber = arrayOf("aaa", "bbb", "ccc")
    val byteNumber = arrayOf('a', 'b', 'c')
    //val anyNumber: Array<Any> = arrayOf('a', 1, "String", true, JSONObject())

    val nullArray = arrayOfNulls<Any>(5)
    val nullArray1: Array<String?> = arrayOfNulls<String>(5)

    val asc = Array(5) {i -> (i * i).toString()}
    val bytes = ByteArray(5)
    bytes[0] = 0

    val intArray2 = IntArray(5)
    intArray2[0] = 1

    val intArr2 = IntArray(5){100}

    val intArr3 = IntArray(5) {it * 2} //it代表数组的下标lambda； //IntArray(5) {i -> i*2}


    //数据for循环遍历
    for(item in intArr3) {
        println(item)
    }
    //遍历下标再取值
    for(i in intArr3.indices) {
        println(i.toString() + "->" + intArr3[i])
    }
    //带下标 & 元素
    for((index, elem) in intArr3.withIndex()) {
        println("index = " + index + ", elem = " + elem)
        println("$index->$elem")
    }
}