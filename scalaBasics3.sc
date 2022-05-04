object scalaBasics3 {


//scala collections
//Array

val a=Array(1,"s",3,4,5.5)                        //> a  : Array[Any] = Array(1, s, 3, 4, 5.5)
println(a)//this doesnt works since its an object //> [Ljava.lang.Object;@566776ad


val p =a.toList                                   //> p  : List[Any] = List(1, s, 3, 4, 5.5)
println(p)                                        //> List(1, s, 3, 4, 5.5)

println(a.mkString("|"))                          //> 1|s|3|4|5.5

for (i <- a) println(i)                           //> 1
                                                  //| s
                                                  //| 3
                                                  //| 4
                                                  //| 5.5

//Array is mutable

a(1)=5
println(a.mkString("|"))                          //> 1|5|3|4|5.5

a.reverse                                         //> res0: Array[Any] = Array(5.5, 4, 3, 5, 1)



//List

val b =List(2,1,3,6,5.5)                          //> b  : List[Double] = List(2.0, 1.0, 3.0, 6.0, 5.5)

println(b.head)                                   //> 2.0
println(b.tail)                                   //> List(1.0, 3.0, 6.0, 5.5)


for (i <- b) println(i)                           //> 2.0
                                                  //| 1.0
                                                  //| 3.0
                                                  //| 6.0
                                                  //| 5.5

//reverse built in function for list
b.reverse                                         //> res1: List[Double] = List(5.5, 6.0, 3.0, 1.0, 2.0)

//to add element in list
10::b                                             //> res2: List[AnyVal] = List(10, 2.0, 1.0, 3.0, 6.0, 5.5)



//Tuple

val c=("a",1,true)                                //> c  : (String, Int, Boolean) = (a,1,true)
c._1                                              //> res3: String = a

//defining a tuple as a key value pair

val d=(1,"Sachin")                                //> d  : (Int, String) = (1,Sachin)

//or

var g= 1 -> "sachin"                              //> g  : (Int, String) = (1,sachin)



//Range

val r=1 to 10                                     //> r  : scala.collection.immutable.Range.Inclusive = Range 1 to 10


for (i <- r) println(i)                           //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 7
                                                  //| 8
                                                  //| 9
                                                  //| 10

val ra= 1 until 5                                 //> ra  : scala.collection.immutable.Range = Range 1 until 5
for (i<-ra) println(i)                            //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  
                                                  
//Set

val kd=Set(1,1,2,2,3)                             //> kd  : scala.collection.immutable.Set[Int] = Set(1, 2, 3)



//Map


val kkd=Map(1 -> "Sachin",2 -> "Hitesh" )         //> kkd  : scala.collection.immutable.Map[Int,String] = Map(1 -> Sachin, 2 -> Hi
                                                  //| tesh)

kkd.get(1)                                        //> res4: Option[String] = Some(Sachin)



}