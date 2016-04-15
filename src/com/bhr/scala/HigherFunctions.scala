package com.bhr.scala

object HigherFunctions {
  
  def main(args:Array[String]):Unit = {
    (1 to 10).map("*" * _).foreach(println)
    
    (1 to 10).filter(_ % 2 == 0).foreach(println)
    
    println((1 to 10).reduceLeft(_ * _))
    
    "Redistribution and use in source and binary forms, with or without modification,".split(" ").sortWith(_.length > _.length()).foreach(println)
  }
}