object ScalaBasics2 {
 
 //Functional programming in scala example
 
 def squareIt(x:Int) :Int={
	return x*x
 }                                                //> squareIt: (x: Int)Int
  
  val a=squareIt(4)                               //> a  : Int = 16
  
  
  //We can give a function as a parameter to another function(Higher order function)
  
  def transformtoInt(x :Int, f:Int =>Int) :Int ={
  
  f(x)
  
  }                                               //> transformtoInt: (x: Int, f: Int => Int)Int
  
  transformtoInt(2,squareIt)                      //> res0: Int = 4
  
 
 //annoymous function example below
 transformtoInt(2,x=>{val y=2;y*y})               //> res1: Int = 4
 
 
 
 def gh(y:Array[Int],f:Array[Int]=>Int):Int ={
 
 f(y)
 
}                                                 //> gh: (y: Array[Int], f: Array[Int] => Int)Int



def add(a:Array[Int]):Int=
{
val k=a.takeRight(a.length).sum

return k
}                                                 //> add: (a: Array[Int])Int


//x=>x.takeRight(x.length).sum
val z=gh(Array(1,2,3),add)                        //> z  : Int = 6

println(z)                                        //> 6

}