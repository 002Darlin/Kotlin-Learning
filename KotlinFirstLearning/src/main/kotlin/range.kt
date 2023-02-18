/*
   Author: 02Darling
   Date: 2023/2/18 12:53
   Description:Kotlin 语言的range表达式
 */
fun main(){
    val number = 148

    //range 范围 从哪里到哪里

    if (number in 10..59){
        println("不及格")
    }else if(number in 0..9){
        println ("不及格而且分数很差")
    }else if (number in 60..100){
        println("合格")
    }else if (number !in 0..100){
        println("分数不在0到100范围内")
    }
}