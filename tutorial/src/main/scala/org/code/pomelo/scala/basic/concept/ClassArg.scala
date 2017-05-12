package org.code.pomelo.scala.basic.concept

import scala.org.code.pomelo.scala.basic.feature.AtomicTest._
/**
  * Created by user on 2017/5/11.
  *
  * 类参数
  */
class ClassArg(arg:String) {
  println(foo)
  def foo():String = {
    "Hello Scala! " + arg
  }
}

object ClassArg{
  def main(args: Array[String]): Unit = {
    val clazz = new ClassArg("Woho!")
    clazz.foo() is "Hello Scala! Woha!"
  }
}
