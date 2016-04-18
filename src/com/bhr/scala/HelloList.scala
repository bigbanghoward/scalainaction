package com.bhr.scala.hello

object HelloList {
  
  def main(args:Array[String]):Unit={
    
    val big = List("hadoop","scala","spark")
    val data = List(34,49,59)
    
    println(big.take(2))
    println(big(1))
    
    val core = "hadoop" :: "scala" :: "spark" :: Nil
    println(core)
    
    println(core.head)
    println(core.head.tail)
    println(core.tail.head)
    
    
    val List(a,b,c) = core
    println("a:" + a + ";b:" + b)
    
    val x::y = core
    println("x:" + x + ";y:" + y)
    
    
    val shuffledData = List(3,6,8,9,1,2,0,5,13,21,13)
    
    println(sortList(shuffledData))
    
    def sortList(list:List[Int]):List[Int]={
      list match{
        case List() => List()
        case head::tail => computer(head,sortList(tail))
      }
    }
    
    
    def computer(headData:Int,tailList:List[Int]):List[Int]={
       tailList match{
         case List() => List(headData)
         case head::tail => 
           if (headData <= head) {
           headData :: tailList
         }else{
           head::computer(headData,tail)
         }
       } 
    }
    
    
    println(computer(3,List(2,1)))
    
  }
}