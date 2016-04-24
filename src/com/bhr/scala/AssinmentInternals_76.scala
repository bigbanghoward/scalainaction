package com.bhr.scala

object AssinmentInternals {
  
  def main(args:Array[String])={
    val a@b = 100;
    println("a:" + a + ",b:" + b)
    
    val (c,d) = ("hello",1000)
    //val (e,F) = ("world",2000)
    println("c:" + c + ",d:" + d)
    
    val Array(g,h) = Array("scala",10)
    println("g:" + g + ",h:" + h)
    
    object Test{val 1=1}
    println(Test)
    
    //object Test2{val 2=1}
    //println(Test2)
  }
  
}