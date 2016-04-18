package com.bhr.scala.hello

object ScalaInAction {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val nums = Array(1, 3, 5)                       //> nums  : Array[Int] = Array(1, 3, 5)
  val strs = Array("hello", "world")              //> strs  : Array[String] = Array(hello, world)

  strs(0) = "scala"
  strs                                            //> res0: Array[String] = Array(scala, world)

  import scala.collection.mutable.ArrayBuffer

  val buffer = ArrayBuffer[Int]()                 //> buffer  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()

  val t = buffer += 1                             //> t  : com.bhr.scala.hello.ScalaInAction.buffer.type = ArrayBuffer(1)

  buffer += (2, 3, 5, 8, 13)                      //> res1: com.bhr.scala.hello.ScalaInAction.buffer.type = ArrayBuffer(1, 2, 3, 5
                                                  //| , 8, 13)
  buffer ++= Array(22, 33, 44)                    //> res2: com.bhr.scala.hello.ScalaInAction.buffer.type = ArrayBuffer(1, 2, 3, 5
                                                  //| , 8, 13, 22, 33, 44)
  buffer                                          //> res3: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 5, 8,
                                                  //|  13, 22, 33, 44)
  buffer.insert(3, 55)
  buffer                                          //> res4: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 55, 5
                                                  //| , 8, 13, 22, 33, 44)

  buffer.remove(3)                                //> res5: Int = 55
  buffer                                          //> res6: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 5, 8,
                                                  //|  13, 22, 33, 44)

  buffer.toArray                                  //> res7: Array[Int] = Array(1, 2, 3, 5, 8, 13, 22, 33, 44)
  buffer                                          //> res8: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 5, 8,
                                                  //|  13, 22, 33, 44)

  val t2 = buffer.filter(_ % 2 == 0)              //> t2  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(2, 8, 22, 44)
                                                  //| 
  t2.map(_ * 2)                                   //> res9: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(4, 16, 44, 88)
                                                  //| 
 val tt2 = (1, 3.14, "R", "spark")                //> tt2  : (Int, Double, String, String) = (1,3.14,R,spark)

 tt2._1                                           //> res10: Int = 1
 tt2._2                                           //> res11: Double = 3.14
  
  "Welcome to the Scala worksheet".partition(_.isUpper)
                                                  //> res12: (String, String) = (WS,elcome to the cala worksheet)
                                                  
   val arr1 = Array(1,2,3,4)                      //> arr1  : Array[Int] = Array(1, 2, 3, 4)
   val arr2 = Array("a","b","c","d","e")          //> arr2  : Array[String] = Array(a, b, c, d, e)
   arr1.zip(arr2)                                 //> res13: Array[(Int, String)] = Array((1,a), (2,b), (3,c), (4,d))
  
}