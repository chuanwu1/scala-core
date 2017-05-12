package org.code.pomelo.scala.basic.concept

/**
  * Created by user on 2017/5/12.
  *
  * 辅助构造器(类参数中的 具名参数和缺省参数可以以多种方式构造对象,
  *   同样可以使用构造器重载来实现多种构造器)
  *
  * 任何辅助构造器首行都必须是对主构造器的调用或者对另一个构造器的调用
  * 不能在辅助构造器参数前面使用关键字val或者var
  */
import scala.org.code.pomelo.scala.basic.feature.AtomicTest._

class GardenGnome(val height:Double,val weight:Double,val happy:Boolean) {
  println("Inside primary constructor")
  var painted = true
  def magic(level:Int):String={
    "Poof! " + level
  }

  //花括号后面可省略'='号
  def this(height:Double){
    //首行必须调用类定义的构造器
    this(height,100.0,true)
  }

  def this(name:String)={
    this(15.0)
    painted is true
    //return outside method definition不可在构造器中显示调用return去返回结果
    //return name
  }

  def show():String = {
    height + " " + weight + " " + happy + " " + painted
  }
}

object GardenGnome{
  def main(args: Array[String]): Unit = {
    new GardenGnome(12.0,16.0,false).show() is "12.0 16.0 false true"

    new GardenGnome("tom").show() is "15.0 100.0 true true"
  }
}
