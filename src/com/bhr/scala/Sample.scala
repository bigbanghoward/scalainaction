package com.bhr.scala

object Sample {
  
  def main(args:Array[String]):Unit = {
    //println("hello world!hello scala!");
    
    listFiles()
  }
  
  def listFiles():Unit = {
    val files = (new java.io.File(".")).listFiles()
    
    for(file <- files) println(file.getPath)
  }
  
}