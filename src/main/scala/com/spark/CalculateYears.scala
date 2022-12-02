package com.spark

import org.apache.spark.{SparkConf, SparkContext}

/**
 * @create: 2022-12-02 15:10
 * @description:
 **/
object CalculateYears {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("getYearOld")
    val sc = new SparkContext(conf)
    val data = sc.textFile("datas/person.txt")
    val lineOfData = data.map(_.split(";"))
    // 数据持久化
    lineOfData.setName("lineOfData")
    lineOfData.persist
    val yearData = lineOfData.filter(line=> line(0).toInt > 30)
    println(yearData.count)
  }
}
