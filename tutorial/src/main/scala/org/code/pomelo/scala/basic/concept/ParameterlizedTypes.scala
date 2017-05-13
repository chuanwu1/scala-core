package scala.org.code.pomelo.scala.basic.concept

import scala.org.code.pomelo.scala.basic.feature.AtomicTest._
/**
  * Created by user on 2017/5/13.
  *
  * 参数化类型(类似于Java中泛型)
  */
object ParameterlizedTypes {

  def inferred(v1:Char,v2:Char,v3:Char)={
    Vector(v1,v2,v3)
  }

  //指定了参数化类型,Scala将会检查并强化你的意图
  def explicit(v1:Char,v2:Char,v3:Char):Vector[Char]={
    Vector(v1,v2,v3)
  }

  def explicit(v1:Double,v2:Double,v3:Double):Vector[Double]={
    Vector(v1,v2,v3)
  }

  def explicit(v1:Vector[Double]):List[Double]={
    v1.toList
  }

  def explicitSet(v1:Vector[Double]):Set[Double]={
    v1.toSet
  }

  def main(args: Array[String]): Unit = {
    /**
      * 约束了值类型则在定义或者获取值的时候会进行检查,不符合则type mismatch,如下:
      */
    //val v1:Vector[Int] = Vector(1,"2",3)

    val v2:Vector[Int] = Vector(1,2,3)
    v2 is Vector(1,2,3)

    inferred('a','b','c') is Vector('a','b','c')
    explicit('a','b','c') is Vector('a','b','c')
    explicit(11.0,22.0,33.0) is Vector(11.0,22.0,33.0)
    explicit(Vector(11.1,22.2)) is List(11.1,22.2)
    explicit(Vector(11,22)) is List(11,22)
    explicitSet(Vector(11.1,22.2,11.1,22.2)) is Set(11.1,22.2)
  }
}
