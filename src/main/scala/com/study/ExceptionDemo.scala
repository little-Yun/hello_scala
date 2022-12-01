package main.scala.study

import java.io.{FileNotFoundException, FileReader, IOException}

/**
 * @create: 2022-11-24 15:07
 * @description:
 **/
object ExceptionDemo {
  def main(args: Array[String]): Unit = {
    try {
      var text = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException => println("file not found!")
      case ex: IOException => println("io exception!")
    } finally {
      println("this is finally!")
    }
  }
}
