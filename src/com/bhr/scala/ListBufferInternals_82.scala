package com.bhr.scala

object ListBufferInternals_82 {
  def main(args:Array[String])={
    val list = List(1,2,3,4,5,6,7,8,9)
    println(increment(list))
    println(incrementMoreEffective(list))
    println(incrementMostEffective(list))
  }
  
  def increment(list:List[Int]):List[Int]={
    list match{
      case List() => List()
      case head::tail => head + 1 :: increment(tail)
    }
  }
  
  def incrementMoreEffective(list:List[Int]):List[Int]={
    var result = List[Int]()
    for(elem <- list){
      result = result ::: List(elem +1)
    }
    result
  }
  
  def incrementMostEffective(list:List[Int]):List[Int]={
    import scala.collection.mutable._
    val result = new ListBuffer[Int]()
    for(elem <- list){
      result += elem + 1
    }
    result.toList
  }
  
}