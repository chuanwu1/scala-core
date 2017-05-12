package org.code.pomelo.scala.util.matching

import scala.org.code.pomelo.scala.basic.feature.AtomicTest._
/**
  * Created by user on 2017/5/11.
  *
  * 模式匹配的基本用法及规则
  */
object MatchExpressions{

  def matchColor(color:String):String = {
    color match {
      case "red" => "RED"
      case "green" => "GREEN"

      //'_'表示通配符,模式匹配未匹配到会报错
      case _ => "UNKNOW COLOR " + color
    }
  }

  def main(args: Array[String]): Unit = {
    matchColor("white") is "UNKNOW COLOR whiter"
    matchColor("red") is "RED"
  }
}

