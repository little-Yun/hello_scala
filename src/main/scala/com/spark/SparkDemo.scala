package com.spark

import org.apache.spark.{SparkConf, SparkContext}


/**
 * @create: 2022-12-01 14:37
 * @description:
 **/
object SparkDemo {
  def main(args: Array[String]): Unit = {
    val file = "datas/1.txt"
    // 设置程序名称
    val config = new SparkConf().setMaster("local").setAppName("sampleApp")
    // 封装成content对象
    val sc = new SparkContext(config)
    // 加载文件为RDD，并且进行缓存
    val data = sc.textFile(file).cache()

    val acount = data.filter(element => element.contains("a")).count()
    val bcount = data.filter(element => element.contains("b")).count()
    println("result is a: %s, b:%s".format(acount, bcount))
  }
}
