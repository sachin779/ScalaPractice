object Scala {
 
 
 ////first class function
 //1.we should be able to assign the function to a variable
 
 var a:Int=5                                      //> a  : Int = 5
 def doubler(a:Int):Int={
 return a*2
 }                                                //> doubler: (a: Int)Int
 
 var b=doubler(_)                                 //> b  : Int => Int = Scala$$$Lambda$8/1809787067@6b71769e
 b(3)                                             //> res0: Int = 6
 
 
 //2.We should be able to pass a function as parameter to a function
 
 def tripler(i:Int):Int={ return i*3}             //> tripler: (i: Int)Int
 
 def fun(i:Int,f:Int =>Int):Int={f(i)}            //> fun: (i: Int, f: Int => Int)Int
 
 var c=fun(2,tripler)                             //> c  : Int = 6
 
 
 //3.we should be able to return a function from a function
 
 def func={
 x:String => x*2
  }                                               //> func: => String => String
 
 func("ss")                                       //> res1: String = ssss
 
 
 ////Higher order functions
 //A function which either takes a function as input or return another function as a output
 
 var g=1 to 10                                    //> g  : scala.collection.immutable.Range.Inclusive = Range 1 to 10
 
 def doublerr(i:Int):Int={ return i*2}            //> doublerr: (i: Int)Int
 
 g.map(doublerr)                                  //> res2: scala.collection.immutable.IndexedSeq[Int] = Vector(2, 4, 6, 8, 10, 12
                                                  //| , 14, 16, 18, 20)
 
 //map is a higher order function in above case
 
 ////Anonymus function
 
 var u=5                                          //> u  : Int = 5
 g.map(x=>x*2)                                    //> res3: scala.collection.immutable.IndexedSeq[Int] = Vector(2, 4, 6, 8, 10, 12
                                                  //| , 14, 16, 18, 20)
      
////Loop vs recursion  vs tail recursion


//Example of factorial

//1.Loop

def factorial(input:Int):Int={
var result=1

for (i <- 1 to input) {

result= result*i

}
result
}                                                 //> factorial: (input: Int)Int

factorial(4)                                      //> res4: Int = 24

//execution for loop
// i=1 result=1
// i=2 result=1*2
// i=3 result=2*3=6
// i=4 result=6*4=24


//2.Recursive

def factoriall(input:Int):Int={

if (input ==1) return 1
else input * factoriall(input -1)

}                                                 //> factoriall: (input: Int)Int

factoriall(5)                                     //> res5: Int = 120

//execution of recurssion
//5*factorial(4)
//5*4*factorial(3)
//5*4*3*factorial(2)
//5*4*3*2*factorial(1)
//120

//Recursive function is not memory efficient


//tail recursive

def factorialtail(i:Int,result:Int):Int={


if (i==1) result
else
 factorialtail(i-1,i*result)
 
 

}                                                 //> factorialtail: (i: Int, result: Int)Int

factorialtail(4,1)                                //> res6: Int = 24
//factorial(4,1)
//factorial(3,4*1)
//facyorial(2,3*4)



////Closure

def areaOfCircle= {val pi=3.14 ; (x:Int)=>pi*x*x} //> areaOfCircle: => Int => Double

val pi =3.5                                       //> pi  : Double = 3.5

areaOfCircle(2)                                   //> res7: Double = 12.56

//if we define a variable inside a function its valued will be bound to that function when in used.


////Scala Types

//There is Hirarchy in scala types ...main type is Any then anyval then anyref

//anyval will have ->byte,short,int,Long,float,double    .. unit() boolean char

//anyref will have -> List,seq,Tuple,String .. null ,nothing


val s=5                                           //> s  : Int = 5

val sa=println("Hello")                           //> Hello
                                                  //| sa  : Unit = ()
//when output is not fixed the type will be unit

val sab =if (a==1)  1  else 2.0                   //> sab  : Double = 2.0


val sabc=if (a==5) 1 else println("hello")        //> sabc  : AnyVal = 1

val sach=if (a==5) println("Hello")               //> Hello
                                                  //| sach  : Unit = ()

val sachi=if (a==5) 'a' else 4                    //> sachi  : Int = 97

val sachin=if (a==5) 2 else List(1,2)             //> sachin  : Any = 2




//Placeholder Syntax

val k=1 to 10                                     //> k  : scala.collection.immutable.Range.Inclusive = Range 1 to 10

k.map((x:Int)=>x*2)                               //> res8: scala.collection.immutable.IndexedSeq[Int] = Vector(2, 4, 6, 8, 10, 1
                                                  //| 2, 14, 16, 18, 20)

//we can also right above function as below

k.map(_*2)                                        //> res9: scala.collection.immutable.IndexedSeq[Int] = Vector(2, 4, 6, 8, 10, 1
                                                  //| 2, 14, 16, 18, 20)



////partially applied function

//This is an act of creating a brand new function by fixing one of the parametr of a function

def sumFunc(x:Int,y:Int)= {x+y}                   //> sumFunc: (x: Int, y: Int)Int

val increament=sumFunc(1,_:Int)                   //> increament  : Int => Int = Scala$$$Lambda$22/1020923989@7a5d012c


increament(3)                                     //> res10: Int = 4


////Function currying

//Logically grouping of parameters to a function

def genricsum(x:Int,y:Int)(f:Int => Int) ={
f(x)+f(y)
}                                                 //> genricsum: (x: Int, y: Int)(f: Int => Int)Int

genricsum(2,3)(x=>x*x)                            //> res11: Int = 13


//some random example

val usr="azar@tcs.com"                            //> usr  : String = azar@tcs.com
val mail_usr=usr.split("@")(0)                    //> mail_usr  : String = azar
val n=mail_usr.length                             //> n  : Int = 4
var charlist=mail_usr.toList                      //> charlist  : List[Char] = List(a, z, a, r)
//charlist(n-1)="*" * (n-2)
//for (i <- charlist ; if (i ==charlist(0) ))  yield ( i )
//charlist.patch(2-(n-1),Seq("*"),1)
val newlist=charlist.map(e=>if (e==charlist(0) || e==charlist(n-1)) e else "*").mkString
                                                  //> newlist  : String = a*ar
//charlist.slice(1,n-1).map(x=> "*")

val out=newlist +"@"+usr.split("@")(1)            //> out  : String = a*ar@tcs.com

List(1,n-1).foldLeft(mail_usr)((s, i) => s.updated(i, '*'))
                                                  //> res12: String = a*a*

val mail=usr.split("@")(0).toCharArray()          //> mail  : Array[Char] = Array(a, z, a, r)
mail.length                                       //> res13: Int = 4
}