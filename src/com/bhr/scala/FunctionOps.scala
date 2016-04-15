package com.bhr.scala

object FunctionOps {
  
  def main(args:Array[String]):Unit={
    //processData("E:\\dev\\scala-2.10.5\\doc\\LICENSE",5)
    
    val someNumbers = Array(0,1,5,-1,-5)
    
    someNumbers.foreach((x:Int) => print(x))
    println
    someNumbers.foreach((x) => print(x))
    println
    someNumbers.foreach(x => print(x))
    println
    someNumbers.foreach((print(_)))
    println
    someNumbers.foreach(print(_))
  }
  
  def processData(fileName : String,width :Int) : Unit = {
    def processLine(line:String):Unit = {
      if ( line.length > width ){
        println(line)
      }
    }
    
    val source = scala.io.Source.fromFile(fileName)
    for(line <- source.getLines){
      processLine(line)
    }
  }
}