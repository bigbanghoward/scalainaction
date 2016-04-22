package com.bhr.scala

object ContextParams{
  implicit val default:String = "java"
}

object Param{
  def print(content:String)(implicit luanguage:String) = {
    println(luanguage + ":" + content)
  }
}

object ImplicitParamters_60 {
  
    def main(args:Array[String]):Unit={
      Param.print("spark")("scala")
      
      import ContextParams._
      Param.print("hadoop")
    }
}