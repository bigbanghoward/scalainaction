package com.bhr.scala

import java.io.File
import java.io.File

import scala.io.Source
import scala.io.Source

class RicherFile(val file:File){
  def read:String = {
    Source.fromFile(file.getPath).mkString
  }
}

class FileImplicit(path:String) extends File(path)

object FileImplicit{
  implicit def file2RicherFile(file:File) = new RicherFile(file)
  
  def apply(path:String)= new FileImplicit(path)
}

object ImplictInternal_65 {
  def main(args:Array[String]):Unit = {
    //println(new FileImplicit("F:\\workspace_scala\\scalainaction\\.classpath").read)
    println(FileImplicit("F:\\workspace_scala\\scalainaction\\.classpath").read)
  }
}