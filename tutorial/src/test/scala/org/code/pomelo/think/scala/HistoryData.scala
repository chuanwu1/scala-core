package scala.org.code.pomelo.think.scala

/**
  * Created by user on 2017/5/13.
  *
  * 使用模式匹配与参数话类型统计数据
  */
object HistoryData {

  def statistic(data:Vector[Int]):String={
    var sunny = 0
    var msunny = 0
    var psunny = 0
    var mcloudy = 0
    var cloudy = 0

    for (v <- data){
      v match {
        case 100 => sunny += 1
        case 80 => msunny += 1
        case 50 => psunny += 1
        case 20 => mcloudy += 1
        case 0 => cloudy += 1
      }
    }
    s"Sunny=$sunny,Mostly sunny=$mcloudy,Partly sunny=$psunny,Mostly cloudy=$mcloudy,Cloudy=$cloudy"
  }

  def main(args: Array[String]): Unit = {
    val v:Vector[Int] = Vector(100,80,20,100,20)
    println(statistic(v))
  }
}
