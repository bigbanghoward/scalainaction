package com.bhr.scala.hello

object OptionInteral {
  
  def main(args:Array[String]):Unit={
    
    val scores = Map("spark" -> 69,"scala" -> 58)
    
    scores.get("spark") match{
      case Some(score) => println(score)
      case None => println("no score")
    }
    
    
    
  }
}