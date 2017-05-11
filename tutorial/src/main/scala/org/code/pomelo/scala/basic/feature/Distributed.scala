package org.code.pomelo.scala.basic.feature

import scala.concurrent.{Future, Promise}

/**
  * Created by user on 2017/5/10.
  *
  * In scala,futures and promises can be used to process data ansynchronously,
  * making it easier to parallelize or even distribute application.
  * scala中使用Future和Promises类可以异步处理数据
  */
object Distributed {

  /**
    * someExpensiveComputation
    */
  /*val x = Future{
    for (_ <- 1 to 10000)
      for (_ <- 1 to 1000)
        println("gg")
  }*/


  /**
    * someOtherExpensiveComputation
    */
  /*val y = Future{
    for (_ <- 1 to 100)
      for (_ <- 1 to 1000)
        println("mm")
  }

  val z = for (a <- x; b <-y) yield a*b

  for (c <- z) println("Result: " + c)
  println("Meanwhile,the main thread goes on")*/
}
