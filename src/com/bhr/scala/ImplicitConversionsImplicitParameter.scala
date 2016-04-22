package com.bhr.scala

object ImplicitConversionsImplicitParameter {
  def main(args:Array[String])={
    def bigger[T](a:T,b:T)(implicit ordered:T => Ordered[T]) = {
      if(a > b) a else b
    }
    
    println(bigger(4,3))
    println(bigger("spark","hadoop"))
    
  }
}