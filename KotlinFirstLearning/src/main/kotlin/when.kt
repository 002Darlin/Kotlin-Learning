/*
   Author: 02Darling
   Date: 2023/2/18 13:16
   Description:when表达式
 */
fun main(){
    val week = 8

    //Java的if语句
    //KT的if表达式 有返回值
    val info = when(week){//
        1 ->"今天是星期一"
        2 ->"今天是星期二"
        3 ->"今天是星期三"
        4 ->"今天是星期四"
        5 ->"今天是星期五"
        6 ->"今天是星期六"
        7 ->"今天是星期天"
        else -> {
            println("忽略星期几")
        }
    }
    println(info)//如果关键字无返回 是空地void关键字 返回类kotlin.Unit 用Unit代表了void关键字
}