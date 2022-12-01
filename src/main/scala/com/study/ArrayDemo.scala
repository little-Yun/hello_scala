package main.scala.study

/**
 * @create: 2022-11-21 11:17
 * @description: 数组
 **/
object ArrayDemo {
  def main(args: Array[String]): Unit = {

    // 未指定数组元素类型
    var z = new Array(3)

    // 指定数组元素类型
    var a: Array[String] = new Array[String](3)

    // 指定数组下标内容 方式一
    a(0) = "Runoob";
    a(1) = "Baidu";
    a(4 / 2) = "Google"

    // 指定数组下标内容 方式二
    var b = Array("a", "b", "c")

    // 多维数组
    val myMatrix = Array.ofDim[Int](3, 3)
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        print(" " + myMatrix(i)(j))
      }
      println();
    }

    // 合并数组
    val myList1 = Array(1.9, 2.9, 3.4, 3.5)
    val myList2 = Array(8.9, 7.9, 0.4, 1.5)

    val list3 = Array.concat(myList1, myList2)
    for (i <- list3) {
      println(i)
    }

    // 创建区间数组
    val testArray = Array.range(10, 20, 2)
    val testArray2 = Array.range(10, 20)
    for (x <- testArray) {
      print(x + "\t")
    }

    for (x <- testArray2) {
      print(x + "\t")
    }
  }
}
