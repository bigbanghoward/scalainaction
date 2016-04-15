package com.bhr.scala

object ListInteral {
  def main(args:Array[String]){
    val list = List[Int](1,2,3,4,5)
    val listAny = list
    println(listAny.isEmpty)
    println(listAny.head)
    println(listAny.tail)
    println(listAny.length)
    println(listAny.drop(2))
    
    val tmpList = listAny.map(_ * 2)
    println(tmpList)
    
  }
}