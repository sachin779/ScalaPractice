

object MyThird extends App{
 
  //**strict val and lazy val
  //Note:Lazy val is evaluated during the first use
  //strict val example 
  val r=10
  val area ={
    println("calcullating area of circle")
    3.14*r*r
  }
  
 println(area)
 //lazy val example
 val r1=11
 lazy val areas={
   
   3.14*r*r
 }
 //if we call only areas it wont be executing the code snippet
 areas
 //if we call areas in println the the code will be executes
 println(areas)
 
 
 //**default scala packages
   //by default ,three packages are implicitly imported for you:
   //java.lang._
   //scala._
   //scala.Predef._
 
 
 //**Scala apply Method
   //apply serves the purpose of closing the gap between object oriented 
   //and function paradign in scala
   //we will be able to call an object like a function
 
 object Person{
   
   def apply(name:String,age:Int)={
     s"$name is $age years old"
   }
 }
 
 val x=Person.apply("Sachin",24)
 println(x)
 
 val z=Person("Sachin",25)
 println(z)
 
 
 //**Diamond problem in scala and how it is solved.
   //A problem which comes with multiple inheritance
   //For eg Lets say class A and class B are having the method or function
   //with the same name and Class C needs to extend both of these classes and use the Method
   //but class C will be confused from where it should use the Method or function.
   //this is the reason why scala does not support multiple inheritance.
 
   //to solve this problem we can use traits
 
 trait traitA{
   def name=println("Grandparent")
 }
 
 trait traitB extends traitA {
   override def name={
     println("B child of A")
     super.name
   }
 }
   
 trait traitC extends traitA{
   override def name={
     println("C is a child of A.")
     super.name
   }
 }
 
 object grandChild extends traitB with traitC
 
 grandChild.name
   //linerization rule come into play to decide the call hierarchy.
   //grandchile->traitC->traitB->traitA
 
 //**why scala over python or java
 
   //1.scala we can write a very consise code
   //2.spark is written in scala
   //3.if any new feature is released in spark then
   //first it comes in scala and then rolled to other languages.
   //4.scala gives best performance with spark.
 
 
 //**type safe in scala
   //Type safetly means that the compiler will validate types while compiling and throw an
   //error if we try assining wrong type to a variable.
   //if we run below code it will show error wjile compiling code.
   //val a:Int="Sachin"
 
 //**What is the statically typed language and dynamically typed language.
   //statically typed-A language is statically typed if the type of a variable is 
   //known at compile time rather than runtime.
   //for eg . java,C,scala,etc..
 
   //dyncamically typed language the type is checked at runtime.
   //for eg. javascript,python,etc..
 
 //Note:Static typing usually results in a better performance because compiler knows datatypes in
 //advance and has scope to do optimization.
 //static type we dont run into error at runtime
 
 
 //**Exception handling in scala
   //Exception is a abnormal condition which areise because of our code.
   //Error is a abnormal condition because of system issues.
 
 try {
   val b=5/0
 }
 
 catch{
   case e:Exception=>println("please give a denominator other than 0")
 }
 
 
 
 //**Monad
   //A monad is not a class or a trait.it is just a concept.
   //A monad id an object that wraps another object in scala.
   //The output of a calculation at any step is the input to other calculation
 
 val list1=List(1,2,3,4)
 val list2=List(5,6,7,8)
 
val listof=list1.flatMap {x=> list2.map{
  y=>x+y
}
}
 
 println(listof)
 
 
 //**Streams in scala
   //streams are lazy lists 
   val l=List(1,2,3,4)
   val li=100 #:: 200 #:: 300 #::  Stream.empty
   println(li)
   li.take(5).print
   
 
 //**ofDim
   //use to create a multidimentional array
   val myarr=Array.ofDim[Int](2,2)
   myarr(0)(0)=2
   myarr(0)(1)=7
   myarr(1)(0)=7
   myarr(1)(1)=7
   for (i<-0 to 1;j<- 0 until 2){
     println(myarr(i)(j))
         }
 
 
 
 
}