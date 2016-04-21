package com.bhr.scala

class Structural{
  def open() = println("a class instance open")
}

object StructuralType_53 {
  
  def main(args:Array[String])={
    
    init(new {def open():Unit=println("open")})
    
    type x = {def open():Unit}
 
    def init(res:x) = res.open
    
    init(new {def open()=println("open agin")})
    
    object A{def open(){println("a single object open")}}
    
    init(A)
    init(A)
    
    val structural = new Structural
    init(structural)
    init(structural)
  }
  
  def init(res:{def open():Unit}){
    res.open()
  }
  
}