package com.bhr.scala.hello

object ListOps {
  def main(args:Array[String]):Unit={
    val list = List(1,2,3,4,5,6)
    println(list.head)
    println(list.tail)
    
    list.foreach { println }
  }
}