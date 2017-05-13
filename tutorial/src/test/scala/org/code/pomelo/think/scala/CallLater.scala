package scala.org.code.pomelo.think.scala

import scala.org.code.pomelo.scala.basic.feature.AtomicTest._
/**
  * Created by user on 2017/5/13.
  *
  * 以一个匿名方法作为参数
  */
class CallLater(val f:() => Unit) {

  def call():Unit={
    f()
  }
}

class CallBefore(val f:() => String){

  def call():String = {
    f()
  }
}

/**
  * 定义将两数进行相加操作作为参数
  * */
class CallAfter(val f:(Int,Int,Int*) => Int){

  def call(x: Int,y:Int):Int={
    f(x:Int,5,3)
  }
}

object CallLater{
  def main(args: Array[String]): Unit = {
    val cl = new CallLater(() => println("now"))
    cl.call()

    val cb = new CallBefore(() => "before")
    cb.call() is "before"

    val ca = new CallAfter((x,y,z) => x + y)
    ca.call(11,22) is 17
  }
}
