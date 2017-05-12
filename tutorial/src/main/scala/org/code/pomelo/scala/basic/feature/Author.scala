package scala.org.code.pomelo.scala.basic.feature

import java.io.File

/**
  * Created by user on 2017/5/10.
  */
class Author(val firstName:String,val lastName:String) extends Comparable[Author]{

  override def compareTo(o: Author) = {
    val lastNameComp = this.lastName compareTo(o.lastName)
    if (lastNameComp != 0) lastNameComp
    else this.firstName compareTo(o.firstName)
  }
}
object Author{
  def loadAuthorsFromFile(file:File):List[Author] = ???
}
