package com.bhr.scala

import java.io.File
import scala.io.Source
import java.io.File
import scala.io.Source

class RichFile(val file:File){
  def read:String = {
    Source.fromFile(file.getPath).mkString
  }
}

object Context{
  implicit def file2RichFile(file:File) = new RichFile(file)
}

object ImplictConversins_59 {
  def main(args:Array[String]):Unit = {
    import Context._
    println(new File("E:\\workspace_scala\\scalainaction\\.classpath").read)
  }
}