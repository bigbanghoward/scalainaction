package com.bhr.scala

object BufferQueueStackOps {
  
  def main(args:Array[String]):Unit={
    import scala.collection.mutable.ListBuffer
    val listBuffer = new ListBuffer[Int]
    listBuffer += 1
    listBuffer += 2
    listBuffer ++= List(3,4)
    listBuffer ++= Array(5,6)
    
    println(listBuffer)
    
    import scala.collection.mutable.ArrayBuffer
    val arrayBuffer = new ArrayBuffer[String]
    arrayBuffer += "a"
    arrayBuffer += "b"
    arrayBuffer ++= List("c")
    arrayBuffer ++= Array("d")
    
    println(arrayBuffer)
    
    import scala.collection.immutable.Queue
    val empty = Queue[Int]()
    val queue1 = empty.enqueue("1")
    val queue2 = empty.enqueue(2)
    val queue3 = empty.enqueue(List(3,4,5))
    
    println(empty)
    println(queue1)
    println(queue2)
    println(queue3)
    
    val (elem,left) = queue3.dequeue
    
    println("elem:" + elem + ",left:" + left)
    
    import scala.collection.mutable.Queue
    val emp = new scala.collection.mutable.Queue[Int]() 
    println(emp)
    val emp1 = emp.enqueue(6)
    println(emp1)
    val emp2 = emp ++= Array(7,8)
    println(emp2)
    val emp3 = emp ++= List(9,10)
    println(emp3)
    
    import scala.collection.mutable.Stack
    val stack = new Stack[Int]()
    stack.push(1)
    stack.push(2)
    stack.push(3)
    
    println(stack.top)
    println(stack)
    println(stack.pop)
    println(stack)
  }
}