package main.scala.study

trait TraitDemo {
  def isEqual(x: Any): Boolean

  def isNotEqual(x: Any): Boolean = !isEqual(x)
}


class TraitImplement(xc: Int, yc: Int) extends TraitDemo {
  val x: Int = xc
  val y: Int = yc

  override def isEqual(obj: Any): Boolean = {
    obj.isInstanceOf[TraitImplement] && obj.asInstanceOf[TraitImplement].x == x && obj.asInstanceOf[TraitImplement].y == y
  }
}

object TraitTest {
  def main(args: Array[String]): Unit = {
    val p1 = new TraitImplement(2, 3)
    val p2 = new TraitImplement(2, 4)
    val p3 = new TraitImplement(3, 3)

    println(p1.isNotEqual(p2))
    println(p1.isNotEqual(p3))
    println(p1.isNotEqual(2))
    println(p1.isEqual(p2))
  }
}
