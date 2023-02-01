/*
   Author: 02Darling
   Date: 2023/1/31 10:34
   Description: 学习查看Kotlin反编译后字节码
 */
const val PI1 = 3.14
const val e = 2.71f
const val age = 99
//Tools-Kotlin-show Bytecode
fun main(){
    val name = "002Darlin"
    val num1 = 1
    val num2 = -1//后面不使用则会优化为bool类型
    val b = false
    println(num1)
}
