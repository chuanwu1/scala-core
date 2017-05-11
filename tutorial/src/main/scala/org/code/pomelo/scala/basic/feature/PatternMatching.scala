package org.code.pomelo.scala.basic.feature

/**
  * Created by user on 2017/5/10.
  *
  * In scala,case classes are used to represent structural data type.
  * They implicitly equip the class with meaningful toString,equals and hashCode method,
  * as well as the ability to be deconstructed with pattern matching.
  * scala中使用case关键字修饰的类代表结构化的数据类型,
  */
sealed abstract class Tree
case class Node(elem: Int,left: Tree,right: Tree) extends Tree
case object Leaf extends Tree{

  def inOrder(t: Tree):List[Int] = t match {
    case Node(e,l,r) => inOrder(l) ::: List(e) ::: inOrder(r)
    case Leaf => List()
  }
}