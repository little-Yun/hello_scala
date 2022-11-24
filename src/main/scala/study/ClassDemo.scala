package main.scala.study

/**
 * @create: 2022-11-23 15:12
 * @description:
 **/
class ClassDemo(xc: Int, yc: Int) {
  var x = xc
  var y = yc

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
    println("x 的坐标点 : " + x);
    println("y 的坐标点 : " + y);
  }
}


object test {
  def main(args: Array[String]): Unit = {
    val demo = new ClassDemo(1, 1)
    demo.move(2, 3)
    printPoint(demo)
  }

  def printPoint(classDemo: ClassDemo): Unit = {
    println("x 的坐标点=== " + classDemo.x);
    println("y 的坐标点=== " + classDemo.y);
  }
}
