package main.scala.study

import scala.util.parsing.json.JSONArray

/**
 * @create: 2022-11-16 16:39
 * @description: 数据类型: char、byte、short、int、long、float、double、char、boolean、unit、anything、null...
 **/
object DataType {

  def main(args: Array[String]): Unit = {

    // 变量
    var a: Int = 10
    var b: String = "this is a string"
    var c: Float = 1f
    var d: Double = 1.1
    println(a + "\t" + b + "\t" + c + "\t" + d)

    // 常量
    var e = 0;
    println(e)

    // 文字段落
    var long_str = """asdadasdads"""
    println("this is long string:" + "\t" + long_str)

    // 元组
    val pa = (40, "Foo")
    println(pa)
    println("index_0 ==" + pa._1)
    // pa._2 = "food" 元组数据无法进行修改，会编译错误


    // 数组
    var arr = Array("string", 100);
    println(arr(1))

    val array = Array(1, 3, 4, 2, 5)
    // 数组是无法输出的，强行输出你得到的就是一串栈地址
    println(array.sorted.reverse)

    // 使用json工具转换数组进行输出
    var jsonArray = JSONArray(array.toList)
    println(jsonArray)
  }
}
