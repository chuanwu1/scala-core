package org.code.pomelo.think.scala

/**
  * Created by user on 2017/5/10.
  */
object ScalaMethod {

  def main(args: Array[String]): Unit = {
    var result = getSquare(4);
    assert(result == 16,"seem wrong")

    result = getSquareDouble(1.2);
    assert(result == 1.44,"seem wrong")

    var res = isArg1GreaterThanArg2(2.1,1.2)
    assert(res,"seem wrong")

    /*res = isArg1GreaterThanArg2(1.2,1.6)
    assert(res,"seem wrong")*/
    var str = getMe("abcdefRdS")
    assert(str == "abcdefrds","you seem wrong")

    str = getMe("abc123A")
    assert("abc123a" == str,"you seem wrong")
  }

  def getSquare(side: Int): Double = {
    Math.pow(side, 2);
  }

  def getSquareDouble(side:Double):Double ={
    Math.pow(side,2);
  }

  def isArg1GreaterThanArg2(arg1:Double,arg2:Double):Boolean = {
    arg1 >= arg2
  }

  def getMe(str:String): String ={
    str.toLowerCase()
  }
}
