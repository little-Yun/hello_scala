package main.scala.study

/**
 * @create: 2022-11-23 15:20
 * @description: 子类继承父类
 **/
class Localtion(val xc: Int, val yc: Int, zc: Int) extends ClassDemo(xc, yc) {
  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int) {
    x = x + dx
    y = y + dy
    z = z + dz
    println("x 的坐标点 : " + x);
    println("y 的坐标点 : " + y);
    println("z 的坐标点 : " + z);
  }
}

object test_1 {
  def main(args: Array[String]): Unit = {
    val localtion = new Localtion(1, 2, 3)
    localtion.move(4, 5, 6)
    println("调用父类方法啦")
    localtion.move(4, 5)
  }
}
