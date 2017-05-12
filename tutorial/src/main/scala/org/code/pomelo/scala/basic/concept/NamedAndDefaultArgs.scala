package org.code.pomelo.scala.basic.concept

/**
  * Created by user on 2017/5/12.
  *
  * 具名参数和缺省参数
  * 1、实例化对象时可指定命名参数病赋值
  * 2、可以为参数设置缺省值
  * 3、参数前后位置不作要求(不存在可变参数的情况下)
  */
class NamedAndDefaultArgs(num:Int,length:Long = 100,desc:String)

object NamedAndDefaultArgs{
  def main(args: Array[String]): Unit = {
    new NamedAndDefaultArgs(num = 20,desc = "namedArgs")
    new NamedAndDefaultArgs(length = 10000,desc = "too long",num = 10)
  }
}

/**
  * 包含可变参数
  * 1、可变参数可不存在
  * 2、存在可变参数情况下具名参数位置要与声明时一致
  */
class Family(mon:String,dad:String,childs:String*)

object Family{
  def main(args: Array[String]): Unit = {
    new Family(mon = "mon",dad = "dad")
    new Family(mon = "mon",dad = "dad",childs = "tom","jerry")
  }
}