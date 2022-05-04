import scala.collection.mutable.MutableList


object StrictlyLess {
  
  
  def main(args : Array[String]) {
    //reading first line which consist size of list and number with which we want to compare
    val line1=readLine()
    
    val SizeNumk=line1.split("  ").map(_.toInt)
    
    val Size=SizeNumk(0)
    val Numk=SizeNumk(1)
    
    val line2=readLine().split(" ").map(_.toInt)
    var Numb= MutableList[Int]() 
    for (i <- line2){
      
      if (i < Numk) {
      Numb += i
      }
    }
    Numb.foreach(println)
    
    

  }
}