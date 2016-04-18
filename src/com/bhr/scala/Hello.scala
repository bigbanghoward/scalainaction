package com.bhr.scala.hello

object Hello {
  def main(args: Array[String]): Unit = {
    //print("hello world!hello scala!")
    
    def addA(x:Int):Int = x + 100
    var addB = (x:Int) => x + 200
    
    println(addA(100))
    println(addB(200))
    
    val tuple = (1,3.14,"R","spark");
    
    tuple._1
    tuple._2 
    tuple._3 
    tuple._4
    
  }
}