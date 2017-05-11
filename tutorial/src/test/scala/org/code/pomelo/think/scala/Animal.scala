package org.code.pomelo.think.scala

/**
  * Created by user on 2017/5/10.
  */
class Animal

class Giraffe extends Animal
class Bear extends Animal
//河马
class Hippo extends Animal{
  //优先于其它实例初始化
  println("hippo")
}

object Animal{
  def main(args: Array[String]): Unit = {
    var g = new Giraffe
    var b = new Bear
    var h = new Hippo
    println(g)
    println(b)
    println(h)
  }
}