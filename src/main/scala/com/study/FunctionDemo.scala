package main.scala.study

import java.util.Date


/**
 * @create: 2022-11-18 14:25
 * @description: 函数
 **/
object FunctionDemo {

  var factor = 3
  val multiplier = (i: Int) => i * factor

  def main(args: Array[String]): Unit = {
    println(test("2"))
    println(test(2))
    // 这也是一种函数调用哦
    test
    println(test2)

    // 传值调用
    var times = time()
    delayed(times)

    // 传名调用: time方法会被看成一个完成的对象，所以执行 ‘t’ 这行时会再次调用 time方法打印出 获取时间，单位为纳秒 这行字
    delayed(time())

    // 10 的阶乘
    for (i <- 1 to 10) {
      println("i 的阶乘为=" + factorial(i))
    }

    // 内嵌式函数
    println(factorial_2(0))
    println(factorial_2(1))
    println(factorial_2(2))
    println(factorial_2(3))

    // 匿名函数
    var inc = (x: Int, y: Int) => x * y
    println("匿名函数结果=" + inc(3, 4))

    // 偏应用函数
    val date2 = new Date()
    val logWithDateBound = log(date2, _: String)

    logWithDateBound("message1")
    Thread.sleep(1000)
    logWithDateBound("message2")
    Thread.sleep(1000)
    logWithDateBound("message3")

    // 柯理化
    val curing_slr = curiing(1)("== String")
    println(curing_slr)


    // 闭包
    println("闭包==" + multiplier(1))
  }

  def test(str: String): Boolean = {
    "1".equals(str)
  }

  def test(number: Int): String = {
    if (1 == number) {
      "sucess"
    } else {
      "false"
    }
  }

  def test = {
    println("hello")
  }

  def test2 = {
    "hello test2"
  }


  def time() = {
    println("获取时间，单位为纳秒")
    System.nanoTime
  }

  def delayed(t: => Long) = {
    println("在 delayed 方法内")
    println("参数： " + t)
    t
  }

  def factorial(t: Int): Int = {
    if (t <= 1)
      1
    else
      t * factorial(t - 1)
  }

  def factorial_2(i: Int): Int = {
    def fact(i: Int, accumulator: Int): Int = {
      if (i <= 1)
        accumulator
      else
        fact(i - 1, i * accumulator)
    }

    fact(i, 1)
  }

  def log(date: Date, message: String) = {
    println(date + "----" + message)
  }

  def curiing(x: Int)(y: String) = {
    x + y
  }
}
