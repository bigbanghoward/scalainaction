package com.bhr.scala.hello

abstract class Item
case class Book(description:String,price:Double) extends Item
case class Bundle(description:String,price:Double,items:Item*) extends Item

object CaseClassNested {
  
  def main(args:Array[String]):Unit = {
    
    def case_class_nested(item:Item) = {
      item match{
        case Bundle(_,_,book@Book(_,_),_*) => println("the book price:" + book.price + ",description:" + book.description)
        //case Bundle(_,_,Book(desc,_),_*) => println("the book desc:" + desc)
      }
    }
    
    
    case_class_nested(Bundle("something",20.02,Book("spark",49.98),Bundle("onlyou",13.14,Book("hadoop",61.29))))
    
  }
}