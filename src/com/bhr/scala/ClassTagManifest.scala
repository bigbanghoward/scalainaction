package com.bhr.scala

import scala.reflect.ClassTag

class ClassTagManifest{
  def arrayMake[T:Manifest](first:T,second:T)={
      val r = new Array[T](2);r(0) = first;r(1) = second;r
    }
  
  def mainf[T](x:List[T])(implicit m : Manifest[T]) = {
      if(m <:< manifest[String])
        println("List is Strings")
      else
        println("Some other type")
  }
}

object ClassTagManifest {
  
  def main(args:Array[String]):Unit={
    
    val classTagManifest = new ClassTagManifest
    val array = classTagManifest.arrayMake("hadoop", "java")
    println(array)
    array.foreach { println }
    
    def mkArray[T:ClassTag](elems:T*) = {
      Array[T](elems:_*)
    }
    
    mkArray(23,43).foreach{println}
    mkArray("Japan","Brazil","Germany").foreach{println}
    
    classTagManifest.mainf(List("spark","scala"))
    classTagManifest.mainf(List(3,5))
    classTagManifest.mainf(List("hello",100))
    
    
  }
}