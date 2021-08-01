package com.example.kotlinstudy.lesson

/**
 *  Created by zx on 2021/8/1 16:42
 *  Describe: 集合
 *
 *  List：有序，可重复
 *  Set：无序，不可重复
 *  Map：键值对，无序，键不可重复
 */

fun main() {
    //数据可变 arrayListOf；mutableListOf
    var list = arrayListOf<Int>()
    list.add(999)
    val list1 = mutableListOf<Int>()//推荐使用
    list1.add(8)
    list1.add(0, 6)
    list1.set(1, 6)
    //list1[1] = 1
    val list3 = mutableListOf<Int>(1,2,3,4,5,6)
    //数据不可变 listOf
    val list4 = listOf<String>("Hello", "world", "koltin")

    //数据可变
    val setlist = mutableSetOf<Int>()
    setlist.add(19)
    //数据不可变
    val setList2 = setOf<Int>(1,6,9)

    //数据可变
    val maplist0 = mutableMapOf<Int, String>(Pair(16, "age"))
    var mapList = mutableMapOf<Int, String>()
    mapList[0] = "zxx"
    mapList.put(3, "zdd")
    //数据不可变
    val mapList2 = mapOf<String, String>()

    val iterator = mapList.iterator()
    iterator.forEach {
        //println("it: ${it}")
        println("it: $it")
    }
}