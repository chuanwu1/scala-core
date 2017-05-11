package org.code.pomelo.scala.basic.concept

import org.code.pomelo.scala.basic.feature.AtomicTest._
/**
  * Created by user on 2017/5/11.
  *
  * 可变元参数列表,使用'*'表示,其将参数变成一个序列seq
  */
case class VaryMetadata(args:Int*) {

  def sum(): Int ={
    var sum = 0
    for (v <- args)
      sum += v
    sum
  }
}

object VaryMetadata{
  def main(args: Array[String]): Unit = {
    val vary = VaryMetadata(1,2,3,4,5)
    vary.sum() is 15
  }
}
