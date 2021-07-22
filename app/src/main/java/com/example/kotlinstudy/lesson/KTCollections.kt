package com.example.kotlinstudy.lesson

import org.json.JSONObject

/**
 *  Created by zx on 2021/7/22 20:04
 *  Describe: 数据容器
 */
//psvm

fun main() {
    val arrayNumber: Array<Int> = arrayOf(1, 2, 3)
    val stringNumber = arrayOf("aaa", "bbb", "ccc")
    val byteNumber = arrayOf('a', 'b', 'c')
    val anyNumber: Array<Any> = arrayOf('a', 1, "String", true, JSONObject())

    val nullArray = arrayOfNulls<Any>(5)
    val nullArray1: Array<String?> = arrayOfNulls<String>(5)
}