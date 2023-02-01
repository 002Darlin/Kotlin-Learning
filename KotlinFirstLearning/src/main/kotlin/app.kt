/*
   Author: 02Darling
   Date: 2023/1/30 2:13
   Description:
 */
fun main() {
    println("Hello World!")

    // 声明变量

    /*
    可读可改  变量名    类型     值
    var     name   : String = "002Darlin"
     */
    var name: String = "002Darlin"
    name = "02"
    println(name)

    //内置类型
    /*
    String 字符串
    Char   单字符
    Boolean true/false
    Int    整型
    Double 浮点型
    List   集合
    Set    无重复的元素集合
    Map    键值对的集合

    Int --> java int
    Float --> java float
     */

    //Kotlin的只读变量
    //默认提示: 变量永远不会被修改, 建议修改成 val == 不可改变的
    val info : String = "INFO"//Alt+Enter
    println(info)//info.sout

    /*
      只读   变量名   类型   值
      val     age : Int  = 99
     */
    val age: Int = 99
    //age = 19
    println(age)

    //类型推断
    /*
    提示: Explicitly given type is redundant here
         显示给定的类型是多余的
     */

    val info_ : String = "this is a sentence"
    println(info_)

    val age_ = 99
    println(age_)
}