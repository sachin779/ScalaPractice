object ObjectOrientedScala1 {
//class contains two things 1.Data 2.Behaviour or functionality
class Person(name:String,age:Int) //constructor

val p=new Person("Sachin",24)                     //> p  : ObjectOrientedScala1.Person = ObjectOrientedScala1$Person@2b71fc7e

//p.name    p.name command wont work because the name and age are the parameters of the class but not the fields.

//solution below if we put val or var in front of parameter while defining class it will be considered as a field.

class person(val name:String,val age:Int)

val pn =new person("sachin",24)                   //> pn  : ObjectOrientedScala1.person = ObjectOrientedScala1$person$1@2d209079

pn.name                                           //> res0: String = sachin


class persons(name:String,age:Int){

val x=20

def agedoubler=age*2

def salaryDoubler(salary:Int)=salary*2


}

val pk=new persons("sachin",30)                   //> pk  : ObjectOrientedScala1.persons = ObjectOrientedScala1$persons$1@4c203ea1
                                                  //| 
   println(pk)                                    //> ObjectOrientedScala1$persons$1@4c203ea1
pk.x                                              //> res1: Int = 20
pk.agedoubler                                     //> res2: Int = 60
pk.salaryDoubler(1000)                            //> res3: Int = 2000

//Object is used in scala to get class level functionality in case of java
//only one object we will be able to create
object Personns {
val N_Eyes=2
def canFly:Boolean=false
}
class Personns(val Name:String,val age:Int) {

def salaryDoubler(salary:Int)=salary*2

}

val pe=new Personns("Sachin",24)                  //> pe  : ObjectOrientedScala1.Personns = ObjectOrientedScala1$Personns$3@27f674
                                                  //| d
pe.salaryDoubler(2)                               //> res4: Int = 4
Personns.N_Eyes                                   //> res5: Int = 2
//the aboe scenariao called as companions


//class level functionality using object
//there is nothing like a static in scala
//desigh pattern where in a single file we have object and class with the same name
//this design pattern is called as companion.
//object is used for class level functionality
//class is used for instance level functionality
//in scala singleton design pattern is achieved using object






}