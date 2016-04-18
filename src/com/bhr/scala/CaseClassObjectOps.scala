package com.bhr.scala.hello

abstract class Persion
case class Student(age:Int) extends Persion
case class Teacher(name:String,age:Int) extends Persion
case object Shard extends Persion 

object CaseClassObjectOps {
  
  def main(args:Array[String]):Unit = {
    
    def caseOps(persion:Persion):Unit = {
      persion match {
        case Student(age:Int) => println("i'm a student,my age:" + age)
        case Teacher(name:String,age:Int) => println("i'm a teacher,my name is " + name + ",my age is " + age)
        case Shard => println("i'm is Shard")
      }
    }
    
    caseOps(Student(18))
    caseOps(Teacher("marry",18))
    caseOps(Shard)
   
    val teach = Teacher("jack",28)
    val t = teach.copy(age = 31)
    
    println(teach)
    println(t)
    
  }
}