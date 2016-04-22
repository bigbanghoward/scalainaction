package com.bhr.scala

class Self{
  self =>
  val tmp = "scala"
  def foo = self.tmp + this.tmp
}

trait S1
class S2{
  this:S1 =>
}

class S3 extends S2 with S1

class S4{
  this:S1 =>
} 

object SelfType extends S4 with S1

object SelfType_56 {
  
  def main(args:Array[String])={
    
    class Outer{
      outer =>
      val v1 = "spark"
      class Inner{
        val v1 = "scala"
        println("innrt:" + this.v1 + ",outer:" + outer.v1)
      }
    }
    
    val outer = new Outer
    val inner = new outer.Inner
    
    val s = new S2 with S1
    
  }
  
}