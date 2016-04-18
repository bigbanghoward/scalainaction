package com.bhr.scala.hello

class Apply {
  
  def apply() = {
    println("this is class")
  }
}

object Apply {
  
  def apply() = {
    println("this is object")
    new Apply()
  }
  
  def main(args: Array[String]): Unit = {
     val a1 = Apply()
     val a2 = new Apply()
    println(a2())
  }
}