package com.bhr.scala

import java.io.File
import scala.io.Source

object ContextHelper{
  implicit class FileEnhancer(file:File){
    def read = Source.fromFile(file).mkString
  }
  
  implicit class Op(x:Int){
    def add(second:Int) = x + second
  }
}

object ImplicitClass {
  
  def main(args:Array[String])={
    import ContextHelper._
    println(1.add(2))
    println(new File("F:\\workspace_scala\\scalainaction\\.classpath").read)
  }
  
}