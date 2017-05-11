package org.code.pomelo.think.scala

/**
  * Created by user on 2017/5/10.
  */
class Flare {

  def light():String={
    "Flare used"
  }
}

object Flare{
  def main(args: Array[String]): Unit = {
    var f = new Flare
    assert(f.light == "Flare used","expect got " + f.light)
  }
}
