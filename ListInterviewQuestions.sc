object ListInterviewQuestions {


//Question 1. Given a list of numbers ...requirement is to find the last number in recursive way
//list =2,3,4,5
def lastELement(list:List[Int]):Int=list match {
    case Nil => return 0
    case head::tail => {
      if (list.size==1) head
      else lastELement(list.tail)
    }
  }                                               //> lastELement: (list: List[Int])Int
  
val aj=List(1,2,3,4)                              //> aj  : List[Int] = List(1, 2, 3, 4)
println(lastELement(aj))                          //> 4
  



//Question 2.Given a list of numbers...requirement is to get the list of (i,i+1,i+2) for each number of given list
 
val x=aj.map(x=>List(x,x+1,x+2)).flatten          //> x  : List[Int] = List(1, 2, 3, 2, 3, 4, 3, 4, 5, 4, 5, 6)


//Question 3.Given a number..requirement is to create  list of numbers like below
//given number is 6 ...we have to create a list like => List(List(2,3),List(4,5),List (6,7)) //note -Logic -> add one in each till 6 like below
//1,2,3 -> 2,3,4
  val num=7                                       //> num  : Int = 7
val range=Range(1,num)                            //> range  : scala.collection.immutable.Range = Range 1 until 7

val get_val=range.map(x=>x+1).toList              //> get_val  : List[Int] = List(2, 3, 4, 5, 6, 7)
val get_list=get_val.sliding(2,3).toList          //> get_list  : List[List[Int]] = List(List(2, 3), List(5, 6))
//One more efficient solution for this

val endLimit = num.toInt;                         //> endLimit  : Int = 7
val list = for(i <- 2 to endLimit by 2) yield List(i,i+1)
                                                  //> list  : scala.collection.immutable.IndexedSeq[List[Int]] = Vector(List(2, 3
                                                  //| ), List(4, 5), List(6, 7))
println(list.toList)                              //> List(List(2, 3), List(4, 5), List(6, 7))



//Question 4.Given a list of list...requirement is to flatten out the list

val list1 = List(1, 2, List(4, 5, List(9,10)))    //> list1  : List[Any] = List(1, 2, List(4, 5, List(9, 10)))
val list2=List(4, List(8))                        //> list2  : List[Any] = List(4, List(8))

def flat_List(ls: List[_]): List[Any] = ls match {
  case Nil => Nil
  case (head: List[_]) :: tail => flat_List(head) ::: flat_List(tail)
  case head :: tail => head :: flat_List(tail)
 }                                                //> flat_List: (ls: List[_])List[Any]

val l1=list1.tail                                 //> l1  : List[Any] = List(2, List(4, 5, List(9, 10)))
val l2=l1.tail                                    //> l2  : List[Any] = List(List(4, 5, List(9, 10)))
l2.tail                                           //> res0: List[Any] = List()
 // List(1,List(2,List(4, 5, List(9,10))))
 // List(1,2,List(List(4, 5, List(9,10)))
 // List(1,2,List(4, 5, List(9,10)))
 // List(1,2,4,List(5, List(9,10)))
 //List(1,2,3,5,List(List(9,10)))
 
 
 
 //Question 6.Write a Scala program to add single element and multiple elements to a given listbuffer/list.
 
import scala.collection.mutable.ListBuffer

 var question6List=new ListBuffer[String]()       //> question6List  : scala.collection.mutable.ListBuffer[String] = ListBuffer()
                                                  //| 

 //add single element
 
   question6List+="sid"                           //> res1: scala.collection.mutable.ListBuffer[String] = ListBuffer(sid)
 //add multiple element
 
   question6List++=List("sid")                    //> res2: scala.collection.mutable.ListBuffer[String] = ListBuffer(sid, sid)
   
   
 //Question 8,Write a Scala program to remove single and multiple elements from a given listbuffer/list.
 
 
 var Listma= new ListBuffer[Int]()                //> Listma  : scala.collection.mutable.ListBuffer[Int] = ListBuffer()
 
 Listma++=List(1,2,3,4)                           //> res3: scala.collection.mutable.ListBuffer[Int] = ListBuffer(1, 2, 3, 4)
 
 Listma-=3                                        //> res4: scala.collection.mutable.ListBuffer[Int] = ListBuffer(1, 2, 4)
 
 Listma--=List(2,4)                               //> res5: scala.collection.mutable.ListBuffer[Int] = ListBuffer(1)
 
 //Question 9.Write a Scala program to delete element(s) from a given List.
 
 val randomElement=List(1,2,3,4,5,6,6)            //> randomElement  : List[Int] = List(1, 2, 3, 4, 5, 6, 6)
 
 val newRandomel=randomElement.filter(_ !=6)      //> newRandomel  : List[Int] = List(1, 2, 3, 4, 5)
 randomElement.drop(2)                            //> res6: List[Int] = List(3, 4, 5, 6, 6)
 //Question 10.Write a Scala program to iterate over a list to print the elements and calculate the sum and product of all elements of this list.
 
 val newlist=List(1,2,3,4,5,6,6)                  //> newlist  : List[Int] = List(1, 2, 3, 4, 5, 6, 6)
 
 for(x <- newlist){
  println(x)                                      //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 6
 }
 
 var ak=0                                         //> ak  : Int = 0
 for(x <- newlist){
     ak=x+ak
 }
 println(ak)                                      //> 27
//other way to get sum

newlist.sum                                       //> res7: Int = 27

newlist.max                                       //> res8: Int = 6
newlist.min                                       //> res9: Int = 1

//Question 11.Write a Scala program to remove duplicates from a given list.

newlist.toSet.toList                              //> res10: List[Int] = List(5, 1, 6, 2, 3, 4)

//Question 12.Write a Scala program to check a given list is empty or not.

newlist.isEmpty                                   //> res11: Boolean = false


//Question 13.Write a Scala program to find the index of an element in a given list.

newlist.indexOf(3)                                //> res12: Int = 3

//Question 14.Write a Scala program to merge (concatenate) given lists.


val List1=List(1,2,3,4,5,6)                       //> List1  : List[Int] = List(1, 2, 3, 4, 5, 6)
val List2=List(3,4)                               //> List2  : List[Int] = List(3, 4)

List1:::List2                                     //> res13: List[Int] = List(1, 2, 3, 4, 5, 6, 3, 4)

//OR

List1++List2                                      //> res14: List[Int] = List(1, 2, 3, 4, 5, 6, 3, 4)

//Question 15.Write a Scala program to find the even and odd numbers from a given list.

var EvenList=new ListBuffer[Int]()                //> EvenList  : scala.collection.mutable.ListBuffer[Int] = ListBuffer()
var OddList=new ListBuffer[Int]()                 //> OddList  : scala.collection.mutable.ListBuffer[Int] = ListBuffer()

List1.map(x=>
if(x%2==0) EvenList+=x
else OddList+=x)                                  //> res15: List[scala.collection.mutable.ListBuffer[Int]] = List(ListBuffer(1, 
                                                  //| 3, 5), ListBuffer(2, 4, 6), ListBuffer(1, 3, 5), ListBuffer(2, 4, 6), ListB
                                                  //| uffer(1, 3, 5), ListBuffer(2, 4, 6))

println(EvenList)                                 //> ListBuffer(2, 4, 6)
     //if we dont want even and odd number in list so we can do beo=low
     
val evens=List1.filter(_%2==0)                    //> evens  : List[Int] = List(2, 4, 6)
val ods =List1.filter(_%2!=0)                     //> ods  : List[Int] = List(1, 3, 5)



//Question 16.Write a Scala program to reverse a given list.

List1.reverse                                     //> res16: List[Int] = List(6, 5, 4, 3, 2, 1)

//Question 17.Write a Scala program to count the number of occurrences of each element in a given list.

val randomList=List(1,2,1,2,3,1,3,4,4)            //> randomList  : List[Int] = List(1, 2, 1, 2, 3, 1, 3, 4, 4)

val b=randomList.groupBy(el=>el).map(e=>(e._1,e._2.length))
                                                  //> b  : scala.collection.immutable.Map[Int,Int] = Map(2 -> 2, 4 -> 2, 1 -> 3, 
                                                  //| 3 -> 2)
 println(b)                                       //> Map(2 -> 2, 4 -> 2, 1 -> 3, 3 -> 2)
                                                  //> res17: List[Int] = List(2, 3, 1, 3, 4, 4)

//Question 18.Write a Scala program to split a given list into two lists.
            randomList.sliding(5,2).toList        //> res18: List[List[Int]] = List(List(1, 2, 1, 2, 3), List(1, 2, 3, 1, 3), Lis
                                                  //| t(3, 1, 3, 4, 4))
            val newrandom=(randomList.take(1), randomList.drop(n=1))
                                                  //> newrandom  : (List[Int], List[Int]) = (List(1),List(2, 1, 2, 3, 1, 3, 4, 4)
                                                  //| )
                                                  

//Question19.Given a List...create a new list having only  the strings which contain the letter 'r'




val list13:List[String]=List("sachin","rahul")    //> list13  : List[String] = List(sachin, rahul)
list13.last                                       //> res19: String = rahul
for (i<- list13 ; if (i.contains("r")) ) yield (i)//> res20: List[String] = List(rahul)

//another solution
var list14=new ListBuffer[String]()               //> list14  : scala.collection.mutable.ListBuffer[String] = ListBuffer()
for (i<- list13){

if (i.contains("r"))  { list14+=i
}
 list14
}
                              
println(list14)                                   //> ListBuffer(rahul)
}