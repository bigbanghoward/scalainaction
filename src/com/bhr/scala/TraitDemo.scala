package com.bhr.scala.hello

class TraitDemo {
  println("this is TraitDemo")
}

trait SubTraitDemo extends TraitDemo{
  println("this is SubTraitDemo")
  def teach
}

trait SubTraitAction extends TraitDemo{
  println("this is SubTraitAction")
  def piao = {
    println("invoke piao")
  }
}

class TteachDemo extends TraitDemo with SubTraitDemo {
  def teach = {
    println("invoke override teach")
  }
}

object TraitDemo{
  
  def main(args : Array[String]) :Unit = {
    val demo = new TraitDemo with SubTraitDemo {
      override  def teach = {
        println("inner demo teach")
      }
    }
    demo.teach
  }
  
}