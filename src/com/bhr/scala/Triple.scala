package com.bhr.scala

class Triple[F,S,T](val first:F,val second:S,val third:T) {
  
}

object HelloTypeParamterization{
  
  def main(args:Array[String]){
    val triple = new Triple("spark",3,3.1415)
    val triple2 = new Triple[String,String,Char]("spark","scala",'R')
    
    def getData[T](list:List[T]):T={
      list(list.length / 2)
    }
    
    println(getData[Int](List(1,2,3,4,5)))
    
    val f = getData[Int] _
    
    println(f(List(4,5,6,7,8,90)))
    
  }
}