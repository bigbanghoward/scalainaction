package com.bhr.scala

abstract class BigData
class Hadoop2 extends BigData
class Spark2 extends BigData


object ListConstruckonInternals_81 {
  def main(args:Array[String]) = {
    val hadoop = new Hadoop2 :: Nil
    println(hadoop)
    
    val spark = new Spark2 :: hadoop
    println(spark)
  }
}
