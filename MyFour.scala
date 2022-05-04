

object MyFour extends App {
  
  //** Design pattern
    //Design patter is a general reusable solution to a commonly occuring problem in software desion.
    //It is a template for how to solve a problem that can be used in many differant situations.
  //Examples of design pattern
  //1.Factory design pattern
    //the main aim of a factory design pattern is that,it seprates instance  creation
    //logic from the client.
    //we implement instance creation logic in a factory class without 
    //exposing the logic to the client.
  //example below:
  
  trait Computer{
    def ram:String
    def hdd:String
    def cpu:String
  }
  
  case class PC(ram:String,hdd:String,cpu:String) extends Computer
  case class LAPTOP(ram:String,hdd:String,cpu:String) extends Computer
  case class Anypc(ram:String,hdd:String,cpu:String) extends Computer
  
  object ComputerFactory {
    def apply(compType:String,ram:String,hdd:String,cpu:String)= compType match{
      
      case "PC" => PC(ram,hdd,cpu)
      case "LAPTOP" =>LAPTOP(ram,hdd,cpu)
      case  _ =>Anypc(ram,hdd,cpu)
    }
    
    
    println(ComputerFactory("PC","16gb","1tb","2.3gz"))
    ComputerFactory("Laptop","16gb","1tb","2.3gz")
    

  }
  
 //2.Singletone design pattern
    //The singleston patter restricts the instantiation of a class to one objec
    //and provides a glbal point of access to it.
  
  object Student {
    //class level functionallity 
    
  }
  
 //3.Lazy initialization
    //its a technique that intitalizes a value on its first acess.
    //Lazy initialization allows to avoid some expensive computation.
  
  lazy val x={
    
    println("Computing x")
    36
  }
  
  println(x)
  
//**Difference between Array and ArrayBuffer in scala
    //both Array and ArrayBuffer are mutable.
    //ArrayBuffer is resizable but Array isn't.
    //if you append an element to an Arraybuffer,it gets larger.
    //but if you try to append an element in Array it will internally create a new Array.
  
  val a=scala.collection.mutable.ArrayBuffer(1,2,3,4)
  a+=5
  a.append(6)
  println(a)
  
//How to remove duplicates from an array or List
  
  val b=Array(1,2,3,4,4)
  b.toSet.toArray
 
  println(b.distinct)
  
  
}