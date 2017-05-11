package org.code.pomelo.scala.basic.feature

/**
  * Created by user on 2017/5/10.
  *
  * traits:
  * Combine the flexibility of Java style interfaces with the power of the classes.
  * Think principled multiple-inheritance
  * trait关键字有点Java中接口的意味,不过可以实现方法,使用该关键字标识的类具有某一方面的特性,借此可以在程序中实现多继承
  */
abstract class Spacecraft {
  def engage():Unit
}

trait CommandoBridge extends Spacecraft{
  override def engage(): Unit = {
    for (_ <- 1 to 3)
      speedUp()
  }

  def speedUp():Unit
}

trait PulseEngine extends Spacecraft{

  val maxPulse:Int
  var currentPulse:Int

  def speedUp(): Unit ={
    if (currentPulse < maxPulse)
      currentPulse += 1
  }
}

class StarCruiser extends Spacecraft with CommandoBridge with PulseEngine{
  override val maxPulse: Int = 200
  override var currentPulse: Int = 0
}
