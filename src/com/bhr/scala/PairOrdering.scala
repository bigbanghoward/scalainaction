package com.bhr.scala

class PairOrdering[T:Ordering](val first:T,val second:T){
  def bigger(implicit ordered:Ordering[T]) = {
    if(ordered.compare(first, second) > 0) first else second
  }
}

object PairOrdering {
  def main(args:Array[String]):Unit = {
    val pair = new PairOrdering("hadoop","spark")
    println(pair.bigger)
    
    val pairInt = new PairOrdering(3,5)
    println(pairInt.bigger)
  }
}