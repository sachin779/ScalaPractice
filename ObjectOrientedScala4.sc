object ObjectOrientedScala4 {
  //case class
  class people(val name:String,age:Int) //Normal class
  case class Person(name:String,age:Int)//Case class
  ///1.Class parameters are automatically promoted to fields
  //calling normal class ...it shows error because we did not mentioned
  //val or var to the variables while defining the class
  val personn1=new people("sachin",24)            //> personn1  : ObjectOrientedScala4.people = ObjectOrientedScala4$people@5ce65a
                                                  //| 89
  println(personn1.name)//to get the ouptput we have promoted name variable in class defination
                                                  //> sachin
  
  
  //calling case class
  val person1=new Person("Sachin",24)             //> person1  : ObjectOrientedScala4.Person = Person(Sachin,24)
  person1.name                                    //> res0: String = Sachin

	///2.case classes have sensible toString
	
	//calling normal class..it gives a cyptic value
	println(personn1.toString)                //> ObjectOrientedScala4$people@5ce65a89
	
	//calling case class
	println(person1.toString)                 //> Person(Sachin,24)
	println(person1)                          //> Person(Sachin,24)
	
	///3.equals and hashCode method implemented automatically
	
	//calling normal class...it actually comparing refrence cryptic value because equals and hashcode are not implemented automatically
	val presonn2=new people("Sachin",24)      //> presonn2  : ObjectOrientedScala4.people = ObjectOrientedScala4$people@b68428
                                                  //| 6
	println(personn1==presonn2)               //> false
	
	//calling case callas
	val person2 =new Person("Sachin",24)      //> person2  : ObjectOrientedScala4.Person = Person(Sachin,24)
	println(person1==person2)                 //> true
  
  ///4.By Default case class will have companion objects
  
  //calling normal class is not possible because for that we need to have class and object with same name i.e, companion object is not defined.
  //val personn3=people
  
  //calling case class
  
 val person3=Person.apply("Sachin",24)            //> person3  : ObjectOrientedScala4.Person = Person(Sachin,24)
 
 val person4=Person("Sachin",24)                  //> person4  : ObjectOrientedScala4.Person = Person(Sachin,24)
 
 ///5. case class having copy method handy
 
 val person5=person2.copy()                       //> person5  : ObjectOrientedScala4.Person = Person(Sachin,24)
 
 
 ///6.case classes are serilizable that means case classes are can be transffered over the network
 

 
val student = ("Student1", 90, "Bangalore", "Postgraduate")
                                                  //> student  : (String, Int, String, String) = (Student1,90,Bangalore,Postgradu
                                                  //| ate)

student._2                                        //> res1: Int = 90

    val a="Hello how are you"                     //> a  : String = Hello how are you
    
   a.reverse                                      //> res2: String = uoy era woh olleH
   val b=a.split(" ").map(_.reverse)              //> b  : Array[String] = Array(olleH, woh, era, uoy)
   
   val c=b.mkString(" ")                          //> c  : String = olleH woh era uoy
   println(c)                                     //> olleH woh era uoy
   
}