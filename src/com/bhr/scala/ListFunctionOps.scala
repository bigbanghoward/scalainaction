package com.bhr.scala

object ListFunctionOps {
  
  def main(args:Array[String]):Unit={
    println(List(1,2,3,4,5).map {_ + 1})
    println(List(1,2,3,4,5) map (_ + 1))
    
    val data = List("spark","hadoop","scala")
    println(data.map { _.length })
    println(data map ( _.length() ))
    
    println(data.map { _.toList })
    //println(data.map { _.toList.mkString })
    
    println(data.flatMap { _.toList })
    
    var sum = 0
    List(1,2,3,4,5).foreach { sum += _  }
    println("sum:" + sum)
    println(List(1,2,3,4,5).sum)
    
    println(List(1,2,3,4,5).filter { _ % 2 == 0 })
    
    println(List(1,2,3,4,5).partition { _ % 2 == 0 })
    println(List(1,2,3,4,5).find { _ % 2 == 0 })
    println(List(1,2,3,4,5).find { _ % 6 == 0 })
    println(List(1,2,3,4,5).takeWhile { _ % 2 == 0 }) //获取所有符合条件的元素
    println(List(1,2,3,4,5).dropWhile { _ % 2 == 0 })//获取所有不符合条件的元素
    println(List(1,2,3,4,5).span { _ % 2 == 0 }) //获取所有符合条件的元素和所有不符合条件的元素,分成两部分.
    
    println(List(1,2,3,4,5).exists { _ % 2 == 0 })
    println(List(1,2,3,4,5).exists { _ % 10 == 0 })
    
    println(List(1,2,3,4,5).forall { _ % 2 == 0 })
    println(List(1,2,3,4,5).forall { _ % 1 == 0 })
    
    def hasTotallyZeroRow(m:List[List[Int]]):Boolean = {
      m.exists { row => row forall( _ == 0 ) }
    }
    
    val m = List(List(0,1,1),List(0,1,0),List(0,0,0))
     println("hasTotallyZeroRow:" + hasTotallyZeroRow(m))
    
  }
}