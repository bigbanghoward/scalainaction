package com.bhr.scala.hello

object MathOps {
  def main(args:Array[String]):Unit = {
    val data = 3
    
    data match {
      case 1 => println("First")
      case 2 => println("Second")
      case _ => println("Not Know Number")
    }
    
    val result = data match {
      case i if i == 1 => "The First"
      case number if number == 2 => "The Second"
      case _ => "Not Know Number"
    }

    println(result)
    
    "hello world!".foreach { 
        c => println{
          c match {
            case ' ' => "char:space"
            case ch => "char:" + ch
          }
        }
    }
    
    
  }
}