package org.code.pomelo.think.scala

/**
  * Created by user on 2017/5/11.
  */
class Cell {
  var entry = ' '
  def set(e:Char):String ={
    if(entry == ' ' && (e == 'x' || e == 'o')){
      entry = e
      "successful move"
    }
    else
      "invalid move"
  }
}

class Grid{
  val cells = Vector(Vector(new Cell,new Cell,new Cell),
    Vector(new Cell,new Cell,new Cell),
    Vector(new Cell,new Cell,new Cell))

  def play(e:Char,x:Int,y:Int):String = {
    if (x < 0 || x > 2 || y < 0 || y > 2)
      "invalid move"
    else
      cells(x)(y).set(e)
  }
}

object TicTacToe{
  def main(args: Array[String]): Unit = {
    val grid = new Grid
    assert(grid.play('x',1,1) == "successful move")
    assert(grid.play('o',1,3) == "invalid move")
  }
}
