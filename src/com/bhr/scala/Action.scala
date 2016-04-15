package com.bhr.scala

trait Action{
  def doAction
}

trait TBeforeAction extends Action{
  abstract override def doAction ():Unit = {
    println("doaction before...")
    super.doAction
    println("doaction after...")
  }
}

class Work extends Action{
  override def doAction = {
    println("work doAction")
  }
}

object AopAction {
  def main(args : Array[String]):Unit = {
    val demo = new Work with TBeforeAction 
    demo.doAction()
  }
}