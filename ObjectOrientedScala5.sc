object ObjectOrientedScala5 {


///Option in scala
//When we dont have usefull return value we can use option

def getStringMaybe(num:Int):Option[String]=
{
var k=" "
if (num >0) Some ("a positive number")
else None
}                                                 //> getStringMaybe: (num: Int)Option[String]

println(getStringMaybe(-1))                       //> None


def prntResult(num:Int)={


getStringMaybe(num) match {

case Some(str) => println(str)
case None => println("Nothing given")
}
}                                                 //> prntResult: (num: Int)Unit

prntResult(-1)                                    //> Nothing given



///Yield in scala
//yield is useful to create a list out of for loop

val a =for(i <- 1 to 10) yield{
i*i                                               //> a  : scala.collection.immutable.IndexedSeq[Int] = Vector(1, 4, 9, 16, 25, 36
                                                  //| , 49, 64, 81, 100)
}

println(a)                                        //> Vector(1, 4, 9, 16, 25, 36, 49, 64, 81, 100)


////pattern guard
//when we use if inside the case statement it is called as pattern guard

def checkSign(x:Int):String={
x match {
case a if a<0 =>s"$a is a -ve number"
case b if b>0 =>s"$b is a +ve number"
case _ =>s" is niether a +ve or -ve number"
}
}                                                 //> checkSign: (x: Int)String


def findLeap(x:Int):Boolean={

val isLeapYear:(Int)=>Boolean=x % _==0

(isLeapYear(4) && (isLeapYear(400) || !isLeapYear(100)))

}                                                 //> findLeap: (x: Int)Boolean

println(findLeap(2000))                           //> true




def ageCal(x:Double)={

val x=List("Mercury")//"Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune"

val agePercentage=x.map(x=>(x,
{
if (x=="Mercury") {((0.002408467/100)*365.25)}
}

))
println(agePercentage)

}                                                 //> ageCal: (x: Double)Unit

println(ageCal(2000))                             //> List((Mercury,0.008796925717500001))
                                                  //| ()



}