package com.bhr.scala.hello

object PatternMatchOps {
  
  def main(args:Array[String]):Unit = {
    
    def match_type(t:Any) :Unit = {
      t match{
        case p:Int => println("It is Integer")
        case p:String => println("It is String,the content is:" + p)
        case m:Map[_,_] => m.foreach(println)
        case _ => println("Unknow type!")
      }
    }
    
    match_type(5)
    match_type("hello world!")
    match_type(Map("scala" -> "spark"))
    
    
    def match_array(t:Any) = {
      t match{
        case Array(0) => println("array:" + "0")
        case Array(x,y) => println("array:" + x + "," + y)
        case Array(x,_*) => println("array:" + x + "...")
        case _ => println("something else")
      }
    }
    
    match_array(Array(0))
    match_array(Array(1))
    match_array(Array(2,3))
    match_array(Array(4,5,6,7))
    
    def match_list(t:Any):Unit = {
      t match {
        case 0::Nil => println("list:0")
        case x::y::Nil => println("list:" + x + "," + y)
        case 0::tail => println("list:0...")
        case x::tail => println(tail.foreach{println})
        case _ => println("somethine else")
      }
    }
    
    match_list(List(0))
    match_list(List(1))
    match_list(List(2,3))
    match_list(List(4,5,6))
    
  }
}