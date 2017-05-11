package org.code.pomelo.think.scala

/**
  * Created by user on 2017/5/10.
  */
object Vectors {

  def main(args: Array[String]): Unit = {
    val v1 = Vector(1,3,5,7,9)
    assert(v1 == Vector(1,3,5,7,9));
    assert(v1(3) == 7)
    //不可用new实例化
    //var v2 = new Vector(1,3,4)
    //一旦定义就不再变化
    val v2 = Vector(1.1,2.2,3.3,4.4)
    assert(v2.reverse == Vector(4.4,3.3,2.2,1.1))
    //任何类型均接受
    val v3 = Vector(1.1,"2.2",3.3,4)
    assert(v3.reverse == Vector(4,3.3,"2.2",1.1))

    assert(v3.head == 1.1)
    assert(v3.tail == Vector("2.2",3.3,4))
    println(v1.reverse)
    println(v1.reverse.sorted)
  }
}
