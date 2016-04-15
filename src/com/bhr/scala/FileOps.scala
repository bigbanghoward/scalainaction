package com.bhr.scala

import scala.io.Source

object FileOps {
  def main(args:Array[String]):Unit = {
//    val file = Source.fromFile("F:\\temp\\key.txt")
//    
//    for(line <- file.getLines){
//      println(line)
//    }
//    
//    file.close()
//    
//    val webFile = Source.fromURL("http://spark.apache.org")
//    for(line <- webFile.getLines){
//      println(line)
//    }
//    
//    webFile.close()
    
    val writer = new java.io.PrintWriter(new java.io.File("scalaFile.txt"))
    for(i <- 1 to 100){
      writer.println(i)
    }
    writer.close()
  }
}