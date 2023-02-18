/*
   Author: 02Darling
   Date: 2023/1/31 10:51
   Description: Kotlin语言的引用数据类型
    Java语言有两种数据类型:
        第一种: 基本类型: int double等
        第二种: 引用类型 String等
    Kotlin语言只有一种数据类型:
        看起来是数据类型,实际上编译器会在Java字节码中, 修改成"基本类型"

 */
fun main(){
    val age: Int = 99// 引用类型
    val pi: Float = 3.1415f
    val pi2: Double = 3.1415
    val isOk: Boolean = true
}
/*字节码反编译成Java语言
public final class QuoteKt {
   public static final void main() {
      int age = true;
      float pi = 3.1415F;
      double pi2 = 3.1415;
      boolean isOk = true;
   }

   // $FF: synthetic method
   public static void main(String[] var0) {
      main();
   }
}
*/