package com.bhr.scala

class PairImplicits[T: Ordering](first: T, second: T) { //Ordering[T]
  def bigger(implicit ordered: Ordering[T]) = {
    if (ordered.compare(first, second) > 0) first else second
  }
}

class PairImplicitly[T: Ordering](first: T, second: T) {
  def bigger = if (implicitly[Ordering[T]].compare(first, second) > 0) first else second
}

class PairImplicitlyOrdered[T: Ordering](first: T, second: T) {
  def bigger = {
    import Ordered._
    if (first > second) first else second
  }
}

object ContextBoundsInternals_62 {

  def main(args: Array[String]) = {
    println(new PairImplicits(7, 9).bigger)
    println(new PairImplicitly(7, 9).bigger)
    println(new PairImplicitlyOrdered(7, 9).bigger)
  }
}