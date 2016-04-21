package com.bhr.scala

trait CompoundTypeA
trait CompoundTypeB

class CompoundType extends CompoundTypeA with CompoundTypeB

object CompoundType {
  
  def compund(x:CompoundTypeA with CompoundTypeB)={
    println("Compound type in global method")
  }
  
  def main(args:Array[String])={
    compund(new CompoundTypeA with CompoundTypeB)
    
    object CompoundTypeObject extends CompoundTypeA with CompoundTypeB
    compund(CompoundTypeObject)
    
    type CompundAlias = CompoundTypeA with CompoundTypeB
    
    def compoundTypeLocal(x:CompundAlias) = println("compund type in local method")
    
    val compoundType = new CompoundType
    compoundTypeLocal(compoundType)
    
    type scala = CompoundTypeA with CompoundTypeB {
      def init():Unit 
    }
    
    //compoundTypeLocal(new {def init():Unit=println("init")})
  }
  
}