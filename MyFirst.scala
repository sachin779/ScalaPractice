

object MyFirst extends App {
  //App in scala is a helper class which have the main method internally..Using it we can skip writing a main method inside the object.
  println("hello")
  
  
  //There are different kind of arguements we can use
  //Default argument:we can give the default value of arguement while defining the function itself and if we want to change it while calling the 
  //the function we can actually do it like below
  def add(num: Int,incrementBy: Int =5)= {
    
    num+incrementBy
  }
  
  println(add(5,6))
  //Named arguement: if all the arguements are havings default value and we want to change the value of only one of them then we can use the 
  //name of vairable while calling the method like below
  
  println(add(5,incrementBy=10))
  
  
  //Variable length arguement : While running the code if we are providing many parameters on that time this type of argument can be used
  def prntFunction(name: String*){
    
    for (i<- name) {
      
      println(i)
    }
  }
  
  prntFunction("Hellp","Sachin")
  
  
  //**Nil,null,None,Nothing,Option,Unit
  //Null : Null is a trait in scala. There is only one instance of Null,and that is null.
  
  def tryIt(thing:Null){
    println("That worked")
  }
  
  //tryIt("sid")
  //if we will try to exexute above command it will give the error saying it is expecting null but we have given string
  //Only thing we can pass is null
  
  tryIt(null)
  
  
  //Nil:=> Nill is an empty list
  
  val c=Nil
  println(c)
  
  //Nothing :=> Trait in scala. There is no instances of Nothing in scala
  //Nothing means that there was an error or exception and nothing was returned.
  def func={
    throw new Exception
  }
  
  //func
  
  //Option:=> Consider you are writing a fuction and you run in to the situation where you dont have a useful value to return.
  //then what to do?
  //returning null is not preffered because it can lead to null pointer exception,
  //scala has a built in solution to this problem
  //Options returns some or none.
  
  
  def getAStringMayBe(num:Int):Option[String]= {
    var k=""
    if (num >=0) Some("A positive number!")
    else None
  }
 
  def printlRslt(num:Int)={
    
    getAStringMayBe(num) match {
      case Some(str) => println(str)
      case None =>println("Nothing given as input!")
    }
    
   
  }

 println(printlRslt(-10))

 
//how to deal with nulls in scala?
  case class Address(city:String,state:String,zip:String)

 /*class user (email:String,password:String){
   
   var firstName:String=_
   var lastName:String=_
   var address:Address=_
   
 }
 
 val usr=new user("pardesisachin@779","sdfd")
 //we get null pointer exception if we do below println
 println(usr.firstName)*/
 
 class user (email:String,password:String){
   
   var firstName:Option[String]=Some("Sumit")
   var lastName:Option[String]=None
   var address:Option[Address]=None
   
 }
 
 val usr=new user("pardesisachin@779","sdfd")
 println(usr.firstName.getOrElse("<not assigned>"))
 println(usr.lastName.getOrElse("<not assigned>"))
 
 
}
