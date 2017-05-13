package scala.org.code.pomelo.scala.basic.concept

import scala.org.code.pomelo.scala.basic.feature.AtomicTest._
/**
  * Created by user on 2017/5/13.
  *
  * 统计数值使用mapreduce能够便捷地得到结果
  * map和reduce操作都可适用在seq类型的数据结构上,都是遍历seq然后对每个元素进行操作
  */
object SimpleMapReduce{

  def sumOfVector(xs:Vector[Int]):Any={
    xs.reduce((x,y) => x + y)
  }

  def joinStrings(xs:Vector[String]):Any={
    xs.reduce((x,y) => x + y)
  }

  def mapTheVector(xs:Vector[Int]):Any={
    xs.map(x => x + 1)
  }

  def main(args: Array[String]): Unit = {
    val xs = Vector(1,2,3,4,5)
    val xsn = Vector("A","B","C","D")
    sumOfVector(xs) is 15
    mapTheVector(xs) is Vector(2,3,4,5,6)
    joinStrings(xsn) is "ABCD"
  }
}
