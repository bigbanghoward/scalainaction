package com.bhr.scala

class Persion
class Student extends Persion
class C[+T](val args:T)
class S[+T](val arg:T) extends C[T](arg)
trait Friend[-T]{
  def makeFriend(somebody:T)
}

object Variance {
  
  def makdeFriendWithYou(s:Student,f:Friend[Persion]) = {
    f.makeFriend(s)
  }
  
  def main(args:Array[String])={
    
    val value:C[Persion] = new C[Student](new Student)
    
    //List<? extends Object> list = new ArrayList<String)()
    val list:List[_ <: Any] = List[String]("spark")
    
  }
  
}