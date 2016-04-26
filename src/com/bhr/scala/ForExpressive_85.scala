package com.bhr.scala

case class Persion2(name:String,isMale:Boolean,children:Persion2*)

object ForExpressive_85 {
  
  def main(args:Array[String])={
    val lauren = new Persion2("lauren",false)
    val rucky = new Persion2("rucky",true)
    val vivian = new Persion2("vivian",false,lauren,rucky)
    
    val persons = List(rucky,lauren,vivian)
    
    val result = persons.filter(person => !person.isMale).flatMap(person => person.children map(child => (person.name,child.name)))
    println(result)
    
    val forResult = for(person <- persons;if !person.isMale; child <- person.children)
      yield {
        (person.name,child.name)
    }
    println(forResult)
    
    
  }
  
}