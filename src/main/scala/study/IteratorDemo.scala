package main.scala.study

/**
 * @create: 2022-11-23 15:01
 * @description: 迭代器
 **/
object IteratorDemo {
  def main(args: Array[String]): Unit = {
    val it = Iterator("baidu", "tengxun")
    // 类似于java的Iterator
    while (it.hasNext) {
      println(it.next())
    }

    val ita = Iterator(20, 40, 2, 50, 69, 90)
    val itb = Iterator(20, 40, 2, 50, 69, 90)
    println("最大元素是：" + ita.max)
    println("最小元素是：" + itb.min)
  }
}
