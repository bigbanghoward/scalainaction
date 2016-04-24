package com.bhr.scala

import scala.reflect.runtime.universe._

object Scala
class Java1
class Jvm{
  def method1:this.type = this
}
class JvmLanguage extends Jvm{
  def method2:this.type = this
}

object SingletonType_79 {
  
  def main(args:Array[String]) = {
	  println(Scala.getClass)
	  println(typeOf[Scala.type])
	  //println(classOf[Scala.type])
	  
	  val java1 = new Java1
	  val java2 = new Java1
    println(typeOf[java1.type])
    println(typeOf[java2.type])
	  //println(java2.type.getClass)
	  
    val content:java1.type = java1
    val content2:java2.type = java2
    println(content)
	  println(content2)
	 
	  val jvm = new JvmLanguage
	  println(jvm.method1)
	  println(jvm.method2)
	  //jvm.method2.method1
	  
  }
  
}
