package main.scala.study

import scala.util.matching.Regex

/**
 * @create: 2022-11-24 14:55
 * @description:
 **/
object RegexDemo {
  def main(args: Array[String]): Unit = {
    // 使用.r 构建正则匹配对象
    val pattern = "Scala".r
    val testStr = "Scala is langue! on scala"
    val result = pattern.findFirstIn(testStr)

    if (None != result) {
      println("match result: " + result.get)
    } else {
      println("not match!")
    }

    val pattern_2 = new Regex("(S|s)cala")
    // mkString 方法为链接字符串
    println(pattern_2.findAllIn(testStr).mkString(","))

    val pattern_3 = new Regex("abl[ae]\\d+")
    val str = "ablaw is able1 and cool"
    println((pattern_3.findAllIn(str)).mkString(","))
  }
}
