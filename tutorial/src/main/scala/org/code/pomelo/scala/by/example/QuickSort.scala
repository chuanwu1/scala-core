package org.code.pomelo.scala.by.example

/**
  * Created by user on 2017/5/11.
  *
  * 快排
  *
  * 命令式与函数式的一点区别,本例中两种实现在复杂度方面几近相同,但是命令式的实现改变了原数组的值,
  * 而函数式操作返回的是一个新的排好序的数组,原数组的值并未改变,但函数式操作需要比命令式的需要更多的瞬时内存.
  *
  * def filter(p: A => Boolean): Repr
  * 方法p:A => Boolean(试想一个匿名方法存在参数以及返回值) 表示filter()将另外的一个方法作为参数
  */
class QuickSort {

  //concise(scala) way
  def sort1(xs:Array[Int]):Array[Int] ={
    if (xs.length <= 1) xs
    else {
      val pivot = xs(xs.length / 2)
      Array.concat(
        sort1(xs filter (pivot >)),
              xs filter (pivot ==),
        sort1(xs filter (pivot <))
      )
    }
  }

  //conventional way
  def sort(xs:Array[Int]): Unit = {
    def swap(i: Int, j: Int): Unit = {
      val t = xs(i)
      xs(i) = xs(j)
      xs(j) = t
    }

    def sort1(l: Int, r: Int): Unit = {
      val pivot = xs((l + r) / 2)
      var i = l
      var j = r
      while (i < j) {
        while (xs(i) < pivot) i += 1
        while (xs(j) > pivot) j -= 1
        if (i <= j) {
          swap(i, j)
          i += 1
          j -= 1
        }
      }
      if (l < j) sort1(l, j)
      if (j < r) sort1(i, r)
    }
    sort1(0, xs.length - 1)
  }
}

object QuickSort{
  def main(args: Array[String]): Unit = {
    var array = Array(2,14,1,6,23,4,65,4)
    var sort = new QuickSort
    val result = sort.sort1(array)
    result.foreach(s => println(s))
  }
}
