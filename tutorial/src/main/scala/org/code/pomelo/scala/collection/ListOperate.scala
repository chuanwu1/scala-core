package org.code.pomelo.scala.collection

/**
  * Created by user on 2017/5/11.
  */
object ListOperate {

  def main(args: Array[String]): Unit = {
    val xs = List(1,2,3,4,5)
    val ys = List(1,2,4,5)
    //groupList(xs,2)
    //slideList(xs,3)
    //iteratorList(xs)
    println(sameEles(xs,ys))
  }

  //iterableLike提供的grouped方法
  def groupList(xs:List[Int],size:Int):Unit = {
    val git = xs.grouped(size);
    while (git.nonEmpty)
      println(git.next())
  }

  //iterableLike提供的sliding
  def slideList(xs:List[Int],size:Int): Unit ={
    val sit = xs sliding size
    while (sit.nonEmpty)
      println(sit.next())
  }

  //调用trait类的方法
  def iteratorList(xs:List[Int]): Unit ={
    var it = xs.iterator
    while (it.hasNext)
      println(it.next())
  }

  def sameEles(xs:List[Int],ys:List[Int]):Boolean ={
    xs.sameElements(ys)
  }
}
