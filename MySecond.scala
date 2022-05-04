

object MySecond extends App{
  
  
 //yield:
 //With the help of yield we can get a new list from a for loop.
  
  
 val a= for (i <- 1 to 10) yield {
    
   i*i
  }
 
 println(a)
 //if we use yield on for loop it will give us the vector which is similar to List.
 //Array provides indexed support
 //List gives immutability
 //vetor provides indexed based searching and immutability.
  
  
 val b=for (i <-1 to 10) yield {
   if (i%2==0)
     i*i   
 }
 println(b)
 
 //we get other things also in this list like below
 //Vector((), 4, (), 16, (), 36, (), 64, (), 100)
 //To avoid these other thins we can use If gaurd
 
 //if guard:
 //its like a filter for results of for loop 
 val c=for (i<-1 to 10;if i%2==0) yield{
   i*i
 }
 
 println(c)
 //we can transform above code snippet to below
 
 val d=for { i<-1 to 10
   if i%2==0} yield i*i
 
   println(d)
   
 //pattern guard: when we use if inside the case statement it is called as pattern guard.
 //case statements can be combined with if expresssions to provide extra logic during pattern matching.
   
   def checkSign(x:Int): String ={
     x match{
       case a if a<0 => s"$a is a negative number"
       case b if b>0 => s"$b is a positive number"
       case c => s"$c is niether positive nor negative"
       
     }
   }
     println(checkSign(0))
   
  def f(x:Option[Int])=x match{
       case Some(i) if i%2 ==0 => println(i)
       case None=> println("none")
       case _ =>println("Something else")
     }   
     
 //For comprehesiions
     //both the statements below will give same output...in order to run fast scala will 
     //internally converts the code as on the 2nd line below
     //eg1.1    
     for (i <- 1 to 10) println(i*i)
     (1 to 10).foreach(i=> println(i*i))
//eg.2
     for (i<-1 to 10) yield println(i*i)
     var q=(1 to 10).map(i=>i*i)
     println(q)
//eg.3
     for (i<- 1 to 10;j<- 'a' to 'c') yield println(i*2+" "+j)
     
 
}