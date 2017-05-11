package org.code.pomelo.think.scala

/**
  * Created by user on 2017/5/10.
  */
object RangeDemo {

  def main(args: Array[String]): Unit = {
    //rangByStep(Range(0,10))
    //stringSplit("This is tutorial of scala")
    stringEq("silly".toUpperCase,"silly")
  }

  def rangByStep(r:Range):Unit ={
    for (i <- r by(2))
      println(i)
  }

  def stringSplit(str:String):Unit = {
    var sp = str.split(" ")
    sp.foreach(s => println(s))
  }

  def stringEq(str1:String,str2:String):Unit = {
    assert(str1.equals(str2),"is not eq!")
  }
}
