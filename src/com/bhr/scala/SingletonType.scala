package com.bhr.scala

class Animal{
  def breathe:this.type = {
    this
  }
}


class Cat extends Animal{
  def eat = this
}

object SingletonType {
  
  def main(args:Array[String]):Unit = {
    val cat = new Cat
    cat.eat
    cat.eat.breathe
    cat.breathe.eat
  }
  
  
}