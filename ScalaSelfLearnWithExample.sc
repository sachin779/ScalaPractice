object ScalaSelfLearnWithExample {

//Question.1 Write a Scala program to get the absolute difference between n and 51. If n is greater than 51 return triple the absolute difference.
 def AbsDeff(x:Int) : Int =
    {
    val abs_Diff = Math.abs(x - 51)
    if (x > 51) 3 * abs_Diff else abs_Diff
    }
     
     println(AbsDeff(60))


//Question.2 Write a Scala program to check two given integers, and return true if one of them is 30 or if their sum is 30.

 def QuestionTwo(a:Int,b:Int) :Boolean ={

if (a==30 || a+b==30 || b==30) return true
else false
 

}

println(QuestionTwo(30,30))


//Question.3 Write a Scala program to check a given integer and return true if it is within 20 of 100 or 300.

 def QuestionThree(x:Int) : Boolean  =
    {
     Math.abs(100 - x) <= 20 || Math.abs(300 - x) <= 20
    }
    
    println(QuestionThree(20))
    
   
//Question.4 Write a Scala program to create a new string where 'if' is added to the front of a given string.
// If the string already begins with 'if', return the string unchanged.

def QuestionFour(x:String): String =
{
if (x.startsWith("if")) x

else "if"+x




}

println(QuestionFour("game"))


//Question.5 Write a Scala program to remove the character in a given position of a given string.
//The given position will be in the range 0...string length -1 inclusive.

def QuestionFive(x:String,i:Int):String=
{

x.take(i) + x.drop(i + 2)


}

println(QuestionFive("Hello",1))



    println(flat_List(list2))




//var a=list1.head

//println(flatten(a::list1.tail))



}