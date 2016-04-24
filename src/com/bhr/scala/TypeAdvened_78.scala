package com.bhr.scala

import scala.reflect.runtime.universe._

class Spark
trait Hadoop
object Flink
class Java {
  class Scala
}

object TypeAdvened_78 {
  def main(args:Array[String]) = {
    println(typeOf[Spark])
    println(classOf[Spark])
    
    val spark = new Spark
    println(spark.getClass)
    
    println(typeOf[Hadoop])
    println(classOf[Hadoop])
    
    //println(classOf[Flink])
    println(Flink.getClass)
    
    val java1 = new Java
    val java2 = new Java
    val scala1 = new java1.Scala
    val scala2 = new java2.Scala
    
    println(java1.getClass)
    println(java2.getClass)
    println(scala1.getClass)
    println(scala2.getClass)
    
    println(typeOf[java1.Scala])
    println(classOf[java1.Scala])

    println(typeOf[java2.Scala])
    println(classOf[java2.Scala])
    
    println(typeOf[java1.Scala] == typeOf[java2.Scala])
    println(classOf[java1.Scala] == classOf[java2.Scala])

    println(typeOf[List[Int]])
    println(classOf[List[Int]])
    
    println(typeOf[List[Int]] == typeOf[List[String]])
    println(classOf[List[Int]] == classOf[List[String]])
    
  }
}

