package com.example.kotlinstudy.lesson

/**
 *  Created by zx on 2021/7/22 19:23
 *  Describe: kotlin数据类型
 */

fun main() {
    //声明一个基本数据类型变量; 默认类型为int,超出int取值范围则会推断为Long
    //整数类型
    val number = 100 //int
    val iNumber: Int = 100 //int
    val bigNumber = 8000000000 //long
    val longNumber = 20L //long
    val byteNumber:Byte = 1 //byte


    //浮点类型，小数默认double
    //float单精度 32
    val floatNumber = 3.1415928888f//只能保存6位小数3.141592
    //double双精度 64
    val doubleNumber = 3.1415928888
    println("float" + floatNumber)
    println("double" + doubleNumber)


    //字符类型char
    val char: Char = 'c'


    //布尔类型Boolean
    val isVisible: Boolean = true


    //字符串类型
    val str: String = "1234567890"
    val strNumber: Char = str[1]


    //字符串模板
    println("Result = $strNumber")
    println("Result len = ${str.length}")
    //转义字符 \n换行 \对双引号转义
    val helloworld = "{\"key\" : \"value\"}"
    //分界符"""(不需要转义)
    val helloworld1 = """
        | Tell me and I forget.
        | {"key1": "value1"}
    """.trimIndent()



    //位运算
    /**
     * shl(bits) 有符号左移
     * shr(bits) 有符号右移
     * ushr(bits) 无符号右移
     * and(bits) 位与
     * or(bits) 位或
     * inv() 位非
     * xor(bits) 位异或
     */
}