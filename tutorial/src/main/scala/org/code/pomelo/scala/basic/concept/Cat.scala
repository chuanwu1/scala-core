package scala.org.code.pomelo.scala.basic.concept

import scala.org.code.pomelo.scala.basic.feature.AtomicTest._
/**
  * Created by user on 2017/5/13.
  *
  * Case classes without a parameter list are not allow(Case类必须定义参数)
  * Case类参数类型默认为val,即值类型的参数,创建之后不再变化
  *
  *
  * Case类在创建的时候可以不使用new关键字,直接使用类名就可实例化对象
  */
case class Cat(name:String,age:Int)

object Cat{
  def main(args: Array[String]): Unit = {
    val cats = Vector(Cat("Tom",2) , 121Cat(name = "Jerry",age = 1))
    cats is "Vector(Cat(Tom,2), Cat(Jerry,1))"
  }
}
