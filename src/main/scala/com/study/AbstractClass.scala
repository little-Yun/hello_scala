package main.scala.study

/**
 * @create: 2022-11-23 16:27
 * @description:
 **/
class AbstractClass {
  var name: String = ""

  override def toString = getClass.getName + "[ name=" + name + "]"
}

class AbstractChildClass extends AbstractClass {
  var age: Int = 0

  override def toString: String = super.toString + "[name=" + age + "]"
}


object AbstractObject {
  def main(args: Array[String]): Unit = {
    val child = new AbstractChildClass
    child.name = "张三"
    child.age = 18
    println(child.toString)
  }
}
