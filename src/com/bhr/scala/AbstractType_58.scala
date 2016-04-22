package com.bhr.scala

import scala.io.BufferedSource
import scala.io.Source

trait Reader{
  type In
  type Contents
  def read(in:In):Contents
}

class FileReader extends Reader{
  type In = String
  type Contents = BufferedSource
  
  override def read(in:In) = {
    Source.fromFile(in)
  }
}

object AbstractType_58 {
  
  def main(args:Array[String]):Unit = {
    val fileReader = new FileReader
    val content = fileReader.read("E:\\workspace_scala\\scalainaction\\.cache-main")
    for(line <- content.getLines()){
      println(line)
    }
  }
}