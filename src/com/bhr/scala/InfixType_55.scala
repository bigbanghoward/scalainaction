package com.bhr.scala

object InfixType_55 {
  
  def main(args:Array[String]):Unit={
    object Log {
      def >>:(data:String):Log.type = {
        println(data)
        Log
      }
    }
    
    "hadoop" >>: "spark" >>: Log
    
    val list = List()
    val newlist = "java" :: "scala" :: list
    println(newlist)
    
    class Infix[A,B]
    val infix:Int Infix String = null;
    val infix1:Infix[Int , String] = null;//等价
    
    case class Cons (first:String,second:String)
    val case_class = Cons("java","scala")
    case_class match{
      case "java" Cons "scala" => println("spark!!!") //unapply
    }
    
  }
  
}