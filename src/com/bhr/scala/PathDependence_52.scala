package com.bhr.scala

class Outer{
  
  private val x = 10
  
  class Inner {
    private val y = x + 10
  }
  
}

object PathDependence_52 {
  
  def main(args:Array[String]) = {
    val outer = new Outer
    val inner = new outer.Inner
    val inner2 :outer.Inner = new outer.Inner
    
    val o1 = new Outer
    val o2 = new Outer
    
    //val i:o2.Inner = new o1.Inner
    
    val i:Outer#Inner = new o1.Inner
  }
  
}