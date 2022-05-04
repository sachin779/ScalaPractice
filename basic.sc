object basic {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  println(sys.props.get("user.dir"))              //> Some(C:\Users\sai\Downloads\scala-SDK-4.7.0-vfinal-2.12-win32.win32.x86_64\ec
                                                  //| lipse)
  val a:Int =5                                    //> a  : Int = 5
  println(a)                                      //> 5
  
  
  val b = true                                    //> b  : Boolean = true
  
  val c='a'                                       //> c  : Char = a
  
  //string interpolation (s interpolation)
  var name : String= "Sachin"                     //> name  : String = Sachin
  println(s"Hellow $name !")                      //> Hellow Sachin !

	//f interpolation (printf style)
	
	val p =3.142f                             //> p  : Float = 3.142
	println(f"value of p is $p%.2f")          //> value of p is 3.14


	//if else
	if (2>3) {
	println("hellow")
	}
	else {
	println("there")
	}                                         //> there
	
	
	//match case
	val num =3                                //> num  : Int = 3
	
	num match{
	case 1 => println("one")
	case 2 => println("two")
	case _ => println("something else")
	}                                         //> something else
	
	
	//for loop
	
	for (x <- 1 to 10) {
	val sqaure =x*x
	println(sqaure)
	}                                         //> 1
                                                  //| 4
                                                  //| 9
                                                  //| 16
                                                  //| 25
                                                  //| 36
                                                  //| 49
                                                  //| 64
                                                  //| 81
                                                  //| 100
                                                  
  //while loop
  var i=0                                         //> i  : Int = 0
  
  while (i <5)
 {
 println(s"hello$i")
 i=i+1
 
 
 }                                                //> hello0
                                                  //| hello1
                                                  //| hello2
                                                  //| hello3
                                                  //| hello4
	
	val ba=println("hello")                   //> hello
                                                  //| ba  : Unit = ()

	
	val ag=10 ; val bd=if (ag==5) println("Hello") else (1,"Hi")
                                                  //> ag  : Int = 10
                                                  //| bd  : Any = (1,Hi)
                                                  
 
	val x=List.range(1,10)                    //> x  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
	val doubleList = x.map( _* 2)             //> doubleList  : List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18)
	val doubleListq = x.map((i : Int) => { i * 2})
                                                  //> doubleListq  : List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18)
                                
  val k="*"                                       //> k  : String = *
  
  for (i<- 1 to 5){
  
  println(k*i)                                    //> *
                                                  //| **
                                                  //| ***
                                                  //| ****
                                                  //| *****
       
       

  }
val ab = Array(9.0,10.0,10.3,11.0,15.0,18.0)      //> ab  : Array[Double] = Array(9.0, 10.0, 10.3, 11.0, 15.0, 18.0)

val dd = Array(9.5,10.5,10.7,11.5,15.5,18.5)      //> dd  : Array[Double] = Array(9.5, 10.5, 10.7, 11.5, 15.5, 18.5)

var exit_default = 0.02                           //> exit_default  : Double = 0.02
var platform = 0                                  //> platform  : Int = 0

  for (i <- 1 to ab.length){
   
   val x=1>3
   var check = ab(i+1) > dd(i)
   var gap = ab(i+1) - dd(i)
   if (ab(i+1) > dd(i)  && gap < exit_default)
      platform = platform + 1
      println(platform)
    }                                             //> 0
                                                  //| 0
                                                  //| 0
                                                  //| 0
                                                  //| java.lang.ArrayIndexOutOfBoundsException: 6
                                                  //| 	at basic$.$anonfun$main$6(basic.scala:88)
                                                  //| 	at scala.collection.immutable.Range.foreach$mVc$sp(Range.scala:156)
                                                  //| 	at basic$.$anonfun$main$1(basic.scala:85)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$anonfun$$ex
                                                  //| ecute$1(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:76)
                                                  //| 	at basic$.main(basic.scala:1)
                                                  //| 	at basic.main(basic.scala)


}