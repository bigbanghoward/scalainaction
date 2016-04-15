package com.bhr.scala

import scala.collection.mutable

object SetMapOps {
  
  def main(args:Array[String]):Unit = {
    val data = mutable.Set.empty[Int]
    
    data.+(1,2,3)
    println(data)
    data += 1
    println(data)
    data.add(4)
    println(data)
    
    data ++= List(5,6,7)
    println(data)
    data.clear
    println(data)
    
    val map = mutable.Map.empty[String,String]
    map.put("java", "hadoop")
    println(map)
    map("scala") = "spark"
    println(map.get("java"))
    println(map("scala"))
    
    val treeSet = mutable.TreeSet(7,6,54,34,12,12,5,6,5,87)
    println(treeSet)
    
    treeSet.add(10)
    println(treeSet)
    
    val treeMap = scala.collection.immutable.TreeMap("hello" -> "world","java" -> "hadoop","scala" -> "spark")
//    treeMap.++("java")
//    println(treeMap)
//    treeMap.++:("scala")
    println(treeMap)
  }
}