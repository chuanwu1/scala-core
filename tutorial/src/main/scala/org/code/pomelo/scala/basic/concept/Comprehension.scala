package scala.org.code.pomelo.scala.basic.concept

import scala.org.code.pomelo.scala.basic.feature.AtomicTest._
/**
  * Created by user on 2017/5/13.
  *
  * 推导：
  * Vector的':+'操作符接受一个Vector(不会修改它,也改不了),并将操作符右边的元素与其组合起来,
  * 以此创建一个新的Vector(旧的Vector会被丢弃且Scala会进行清理),对应的变量类型为var
  *
  * 相比较于':+'操作符一个个拼接Vector元素,关键字yield则省去了中间的很多过程,将符合条件的Vector元素
  * 提取出来一次性拼接成一个Vector对象,故对应的变量类型为val
  *
  * 与其他表达式类似,yield表达式也可以组合使用:
  * 只有在推导内部才能不为新标识符声明为val或var
  */
object Comprehension {

  def eventAndGreatThanFive(xs:Vector[Int]): Vector[Int] ={
    var result = Vector[Int]()
    for {
      v <- xs
      if v > 5
      if v % 2 == 0
    } result = result :+ v
    result
  }

  def extraDataFromVector(xs:Vector[Int]): Vector[Int] ={
    val result = for {
      v <- xs
      if v > 5
      if v % 2 == 0
    } yield v
    result
  }

  def extraDataWithComponentYield(xs:Vector[Int]): Vector[Int] ={
    for {
      v <- xs
      if v > 5
      if v % 2 == 0
    } yield{
      val u = v * 10
      u + 2
    }
  }

  def extraDataWithMultiYield(xs:Vector[Int]):Any={
    for {
      v <- xs
      if v < 8
      if v % 2 != 0
    } yield{
      //此处每个v都会产生一个内建的Vector,返回值就是Vector包含Vector
      for (vs <- Range(0,v))
        yield vs
    }
  }

  def main(args: Array[String]): Unit = {
    val vs = Vector(4,5,6,7,8)
    eventAndGreatThanFive(vs) is Vector(6)
    extraDataFromVector(vs) is Vector(6)
    extraDataWithComponentYield(vs) is Vector(62,82)
    println(extraDataWithMultiYield(vs))
  }
}
