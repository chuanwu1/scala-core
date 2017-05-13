package scala.org.code.pomelo.scala.basic.concept

import scala.org.code.pomelo.scala.basic.feature.AtomicTest._
/**
  * Created by user on 2017/5/13.
  *
  * 字符串插值允许字符串输出格式化信息,只需在字符串前添加s即标识字符串允许插值,一般搭配'$'使用
  *
  * 可以将表达式置于${}中进行计算或者转换,类比于Java servlet中el表达式
  *
  * case类的表示以及三重引号可以包含双引号
  */
case class StringInterpolation(style:String) {
  def formatStr(name:String,age:Int,score:Double):String={
    s"name is $name,age is $age,score is $score"
  }

  def formatExpression(num:Int):Int={
    num * num
  }
}

object StringInterpolation{
  def main(args: Array[String]): Unit = {
    s"""${new StringInterpolation("Blue")}""" is "StringInterpolation(Blue)"

    new StringInterpolation("Black").formatStr("Joe",25,100.0) is "name is Joe,age is 25,score is 100.0"
    s"f(7) is ${StringInterpolation("red").formatExpression(7)}" is "f(7) is 49"
  }
}
