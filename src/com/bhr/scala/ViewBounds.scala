package com.bhr.scala


//class PairNotPerfact[T <: Comparable[T]](val first:T,val second:T){
//  def bigger = if(first.compareTo(second) > 0) first else second
//}

class PairNotPerfact[T <% Comparable[T]](val first:T,val second:T){
  def bigger = if(first.compareTo(second) > 0) first else second
}


class PairBetter[T <% Ordered[T]](val first:T,val second:T){
  def bigger = if(first > second) first else second
}

object ViewBounds {
  
  def main(args:Array[String]):Unit = {
    //val pair = new PairNotPerfact[String]("spark","hadoop")
    val pair = new PairNotPerfact("spark","hadoop")
    println(pair.bigger)
    
    val pairInt = new PairNotPerfact(5,3)  //Int -> RichInt
    println(pairInt.bigger)
    
    val pairIntBetter = new PairBetter(5,3)
    println(pairIntBetter.bigger)
    
    val pairStringBetter = new PairBetter("java","scala") //String -> RichString
    println(pairStringBetter.bigger)
  }
}