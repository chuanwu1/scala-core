package scala.org.code.pomelo.scala.basic.concept

import scala.org.code.pomelo.scala.basic.feature.AtomicTest._
/**
  * Created by user on 2017/5/13.
  *
  * 作为对象的函数(方法)
  */
object MethodAsObject {

  //将方法作为参数,实际上看作对象
  def show(name:String)={println("> " + name)}

  def main(args: Array[String]): Unit = {
    val v = Vector("tom","jerry","bob")
    //具名方法
    //v.foreach(show)
    /**
      * 匿名函数
      * */
    //v.foreach((name:String) => println("> "+name))
    //演进,编译器会联系上下文进行类型推断
    v.foreach(n => println("> "+n))



    val duck = "duck".toVector
    var result = ""
    duck.foreach(n => result = result + n + ":")
    result is "d:u:c:k:"
  }



}
