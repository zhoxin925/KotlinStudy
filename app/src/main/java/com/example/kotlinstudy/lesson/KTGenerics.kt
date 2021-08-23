package com.example.kotlinstudy.lesson

/**
 *  Created by zx on 2021/8/23 21:30
 *  Describe:
 */
fun main() {

    //1.泛型接口
    DrinkApple().price("zhao xiao dong shi ge zhubajie")
    //2.泛型类
    BlueColor(Blue()).printColor()
    //3.泛型方法
    fromJson<String>("", String::class.java)

}

//泛型接口
interface Drinks<T> {
    fun taste(): T
    fun price(t: T)
}
class DrinkApple:Drinks<String> {
    override fun taste(): String {
        println("taste()")
        return ""
    }

    override fun price(t: String) {
        println("price($t)")
    }

}

//泛型类  //泛型字段
abstract class Color<T>(var c: T/*泛型字段*/) {
    abstract fun printColor()
}
class Blue {
    val color = "bule"
}
class BlueColor(t: Blue) : Color<Blue>(t) {
    override fun printColor() {
        println("color: ${c.color}")
    }

}
//泛型方法
fun<T> fromJson(json: String, tClass: Class<T>): T? {//T后面加？表示返回值可null
    val t: T = tClass.newInstance()
    return t
}
//泛型约束
//泛型中的out与in