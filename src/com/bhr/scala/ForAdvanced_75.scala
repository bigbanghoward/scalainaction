package com.bhr.scala

object ForAdvanced_75 {
  
  def main(args:Array[String]) = {
    for(i <- 1 to 5)println(i)
    
    //别名绑定
    for(index@"Flink" <- List("Hadoop","Spark","Flink") )println(index)
    
    for((language,"hadoop") <- Set("scala" -> "spark","java" -> "hadoop"))println(language)    
 
    for((k,v:Int) <- List("Spark" -> 5,"Hadoop"->"big data"))println(k)
  }
  
}