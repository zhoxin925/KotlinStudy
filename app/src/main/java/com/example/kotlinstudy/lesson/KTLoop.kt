package com.example.kotlinstudy.lesson

/**
 *  Created by zx on 2021/8/21 19:24
 *  Describe: for(in, until, downTo --step) while
 *  数组 集合 map
 */
fun main() {

    val items = listOf("aa", "bb", "cc")
    for(item in items) {
        println("for(.. in ..)： $item")
    }

    items.forEach {
        println("datas.forEach： $it")
    }

    items.forEachIndexed{
        index, item ->
        println("datas.forEachIndexed： index=$index, item=$item")
    }

    var index = 0
    while (index < items.size) {
        println("while：index=$index, item=${items[index++]}")
    }

    index = items.size - 1
    do {
        //第一次无条件执行，此后当while条件为true时才执行
        println("do while：index=$index, item=${items[index++]}")
    } while (index < items.size)

    //区间迭代器
    for(i in 1..10) {//[1, 10]
        print("$i ")
    }
    println(" ")
    for(i in 1 until 10) {//[1, 10)
        print("$i ")
    }
    println(" ")
    for(i in 10 downTo 1) {
        print("$i ")
    }
    println(" ")
    for(i in 10 downTo 1 step 2) {
        print("$i ")
    }

    //break 终止最直接包围它的循环，直接跳出循环
    //continue 继续下一次最直接包围它的循环，跳过本次继续下一次
}