package com.bhr.scala

class MutipleA[T] {}
class MutipleB[T] {}

object MutipleBounds {

  def main(args: Array[String]) = {
    implicit val mutipleA = new MutipleA[Int]()
    implicit val mutipleB = new MutipleB[Int]()

    def foo[T: MutipleA: MutipleB](i: T) = {
      println("ok i:" + i)
    }
    
    foo(2)
  }

}