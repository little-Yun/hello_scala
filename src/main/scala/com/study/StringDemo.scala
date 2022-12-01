package main.scala.study

/**
 * @create: 2022-11-18 17:51
 * @description: 字符串
 **/
object StringDemo {

  val str = "hello xiao cai"

  def main(args: Array[String]): Unit = {
    println(str)

    var buf = new StringBuilder
    buf += 'h'
    buf ++= "\t" + "hi"
    println(buf)


    val sub = new StringBuffer()
    sub.append("this ").append("is ").append('a').append(" string str")
    println(sub.toString)
    println("sub length = " + sub.length())

    val str_1 = "this is a test,"
    println(str_1.concat(" oh! that cool"))

    val day = "星期六!"
    val fs = printf("%s 真是美好的一天啊", day)
    println(fs)
  }
}
