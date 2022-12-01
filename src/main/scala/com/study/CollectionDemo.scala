package main.scala.study

import java.util


/**
 * @create: 2022-11-21 14:38
 * @description:集合
 **/
object CollectionDemo {
  def main(args: Array[String]): Unit = {
    // 定义整型 List
    val x = List(1, 2, 3, 4)
    val x_1 = new util.ArrayList[Int]()
    x_1.add(1)
    x_1.add(2)
    x_1.add(3)
    x_1.add(4)

    // 定义 Set
    val y = Set(1, 3, 5, 7)
    val y_1 = new util.HashSet[Int]()
    y_1.add(1)
    y_1.add(3)
    y_1.add(5)
    y_1.add(7)

    // 定义 Map
    val z = Map("one" -> 1, "two" -> 2, "three" -> 3)
    val z_1 = new util.HashMap[String, Int]()
    //    z_1.put("one", 1)
    //    z_1.put("two", 2)
    //    z_1.put("three", 3)

    // 创建两个不同类型元素的元组
    val a = (10, "Runoob")
    //  声明一个空的元组
    val a_1 = (1, 2)
    println(a_1._1)

    // 定义 Option
    val b: Option[Int] = Some(5)


    val capitals = Map("China" -> "beijing", "Japan" -> "tokyo")
    println(capitals.get("China"))
    println(capitals.toList.apply(0)._1)
    println(None == capitals.get("test_2"))
  }
}
