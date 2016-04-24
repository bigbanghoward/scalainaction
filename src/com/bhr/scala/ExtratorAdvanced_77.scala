package com.bhr.scala

object :> {
  def unapply[T](list:List[T]){
    Some((list.init,list.last))
  }
  
}

object ExtratorAdvanced_78 {
  
  def main(args:Array[String]) = {
    //(1 to 9).toList match{case _ :> 9 => println("hadoop")}
  }
  
}