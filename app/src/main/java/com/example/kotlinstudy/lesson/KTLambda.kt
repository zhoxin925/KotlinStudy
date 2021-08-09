package com.example.kotlinstudy.lesson

/**
 *  Created by zx on 2021/8/1 17:37
 *  Describe: 方法
 */
//psvm

fun main() {
    Person().test()
    NumUtil.double(22)
    Person0.test2()

    //默认参数
    read(666, 2)
    //具名参数，仅仅只给start传递值，使用默认值offset = 0
    read(start = 888)

    read1(1, 2, action = {
        //return@read1 "read1"
        "括号内使用具名参数，传递action参数" //最后一行是返回值
    })
    //当且仅当方法是最后一个参数时，才可以写在括号外面
    read1(start = 1) {
        "括号外传递action参数"
    }

    //3.可变数量参数
    val append = append('1', '2','3')
    println("append: ${append}")

    val world = charArrayOf('w','o','r','l','d')
    val result = append('h','e','l','l','o','-',*world)
    println("result: ${result}")
    //3.可变数量参数, 还有其他参数时用具名参数赋值
    println("result2: " + append('s','l','e','e','p', time=11))
}

//普通类 class
class Person {
    fun test() {
        println("成员方法")
    }
}

//静态类 object
object NumUtil {
    fun double(num: Int) : Int {
        return num *2
    }
}

//伴生类 Person.test()方式时
class Person0 {
    fun test() {
        println("成员方法")
    }

    //当想要在一个普通的类（class定义的类）里面，定义一个静态方法，用仿生类？
    //不需要构建实例对象，可以通过类名，直接访问静态方法
    companion object {
        fun test2() {
            println("成员方法2")
        }
    }
}


//-------------------------- 参数 ---------------------------//
//1.默认参数，不传值用默认值
//2.具名参数
fun read(offset : Int = 0, start: Int) {
    println("offset=${offset}, start=$start")
}
//2.具名参数 第三个参数是方法: ()  -> 返回值
fun read1(offset: Int = 0, start: Int, action:() -> String/*Unit*/) {
    val ret = action()
    println("read1: " + ret)
}
//3.可变数量参数, 只有一个参数可标记为vararg
fun append(vararg str: Char): String {
    val result = StringBuffer()
    for (char in str) {
        result.append(char)
    }
    return result.toString()
}
//3.可变数量参数, 还有其他参数时用具名参数赋值
fun append(vararg str: Char, time: Int): String {
    val result = StringBuffer()
    for (char in str) {
        result.append(char)
    }
    result.append(" time = " + time)
    return result.toString()
}