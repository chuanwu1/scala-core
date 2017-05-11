package org.code.pomelo.think.scala

/**
  * Created by user on 2017/5/11.
  */
object ForVector {

  def main(args: Array[String]): Unit = {
    val v = Vector("somewhere","over","the","rainbow")
    for (s <- v)
      print(s + "  ")
  }
}
