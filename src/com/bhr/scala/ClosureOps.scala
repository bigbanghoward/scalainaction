package com.bhr.scala

object ClosureOps {
  def main(args:Array[String]):Unit = {
    val data = List(1,2,3,4,5,6)
    var sum = 0
    data.foreach(sum += _)
    
    println(sum)
    
    
    def add(more:Int) = (x :Int) => more + x
    def addOne(x:Int)(y:Int) = {
      x * y
    }
    
    println(add(6)(67))
    println(addOne(6)(7))
    
    val a = add(10)
    val b = add(100)
    
    println(a(1))
    println(b(1))
  }
}