package com.xy

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

/**
 * @create: 2022-11-29 16:33
 * @description:
 **/
object Start {
  def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf().setMaster("local").setAppName("WordCount")
    val sc = new SparkContext(sparkConf)
    //    test_1(sc)
    test_2(sc)
    // 关闭连接
    sc.stop();
  }

  def test_1(sc: SparkContext) = {
    val lines = sc.textFile("datas")
    // 对数据进行分词
    // 扁平化:将整体拆分成个体的操作
    val words = lines.flatMap(_.split(" "))
    // 将数据根据单词进行分组，便于统计
    // （hello,hello,hello）
    val wordGroup = words.groupBy(word => word)
    // 转换数据结构 word => (word, 1)
    val wordCount = wordGroup.map {
      case (word, list) => {
        (word, list.size)
      }
    }
    // 展示数据
    wordCount.foreach(println)
  }

  def test_2(sc: SparkContext) = {
    val lines = sc.textFile("datas")
    // 对数据进行分词
    // 扁平化:将整体拆分成个体的操作
    lines.flatMap(_.split(" ")).map((_, 1)).reduceByKey(_ + _).foreach(println)
  }
}
