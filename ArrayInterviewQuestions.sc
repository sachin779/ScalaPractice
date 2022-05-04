object ArrayInterviewQuestions {
 //Question1. Write a Scala program to sum values of an given array.
 
 val a=Array(1,2,3)                               //> a  : Array[Int] = Array(1, 2, 3)
 
 a.sum                                            //> res0: Int = 6
 a.head                                           //> res1: Int = 1
 //by using for loop
 var total = 0.0;                                 //> total  : Double = 0.0
      for ( i <- 0 to a.length - 1) {
         total += a(i);
      }
      println(s"Result: ${total}");               //> Result: 6.0
  
 
//Question2.Write a Scala program to check if a given number is present in first or last position of a given array of length 1 or more.
 
 val givenNum=3                                   //> givenNum  : Int = 3
 
def test(x:Int,y:Array[Int])={

if (y.length==1) {
y.head==x
}
else {
y.head==x || y.tail==x
}
}                                                 //> test: (x: Int, y: Array[Int])Boolean

val b=test(givenNum,a)                            //> b  : Boolean = false

println(b)                                        //> false
println("s")                                      //> s
 


//Question3.Write a Scala program to calculate the average value of an array of element.

val c=Array(1,2,3,4,4,5,6,7)                      //> c  : Array[Int] = Array(1, 2, 3, 4, 4, 5, 6, 7)

val Avg=c.sum/c.length                            //> Avg  : Int = 4


//Question4.Write a Scala program to check if the value of the first or last element of a given array ( length 1 or more) are same or not.


val d=Array(1)                                    //> d  : Array[Int] = Array(1)
d.head                                            //> res2: Int = 1
def checkFirstLast(x:Array[Int]):Boolean={
 if (d.head ==d.last) {
 
 return true
 }
 else {
 return false
 }
 
}                                                 //> checkFirstLast: (x: Array[Int])Boolean
 
 println(checkFirstLast(d))                       //> true
 
 
 //Qustion6.Write a Scala program to find the index of an element in a given Array.
 
 val f=Array("sachin","hitesh","mihir","karan")   //> f  : Array[String] = Array(sachin, hitesh, mihir, karan)
 
 val index=f.indexOf("mihir")                     //> index  : Int = 2
 f.filter(_!="sachin")                            //> res3: Array[String] = Array(hitesh, mihir, karan)
 //Question7. Write a Scala program to check whether the value of the fast or last element of two given array ( length 1 or more) of integers are same or not.
 
 val g=Array(1,2,3)                               //> g  : Array[Int] = Array(1, 2, 3)
 val h=Array(3,2,1)                               //> h  : Array[Int] = Array(3, 2, 1)

 if(g.head==h.last) true                          //> res4: AnyVal = true
 //most important below---how to drop a element from array or list based on the index
 
 h.zipWithIndex.filter(_._2!=2).map(_._1)         //> res5: Array[Int] = Array(3, 2)
 
 
//Question8.Write a Scala program to remove a specific element from an given array.

def remove(x:Array[Int],y:Int)={

val i=x.drop(y)

i
}                                                 //> remove: (x: Array[Int], y: Int)Array[Int]
 val j=remove(g,1)                                //> j  : Array[Int] = Array(2, 3)
 
//Question 9.Write a Scala program to rotate one element left of an given array (length 1 or more) of integers.
 
 var k=Array(1,2,3,4)                             //> k  : Array[Int] = Array(1, 2, 3, 4)
 
 def rotate_left(arr: Array[Int]) = {
 
    if (arr.length < 1) false
     arr.tail :+ arr.head
   }                                              //> rotate_left: (arr: Array[Int])Array[Int]
   
   
 val q=3                                          //> q  : Int = 3
// var ka:Array[Int]=Array()
for(i<-0 to q){
    k= rotate_left(k)
    println(k.toList)
 }                                                //> List(2, 3, 4, 1)
                                                  //| List(3, 4, 1, 2)
                                                  //| List(4, 1, 2, 3)
                                                  //| List(1, 2, 3, 4)
    k.toList                                      //> res6: List[Int] = List(1, 2, 3, 4)
 //val l=rotate_left(k)
   
//Question 10.Write a Scala program to find the maximum and minimum value of an array of integers.

k.max                                             //> res7: Int = 4
k.min                                             //> res8: Int = 1

//Question 11.Write a Scala program to calculate the sum of the last 3 elements of an array of integers.
//If the array length is less than 3 then return the sum of the array. Return 0 if the array is empty.

def sumLastThreeElement(x:Array[Int]):Int={

if(x.length==0){
return 0
}
else if(x.length ==3){

return x.sum
}
else {

 val z=List(x(x.length-3),x(x.length-2),x(x.length-1))
 z.sum
}
}                                                 //> sumLastThreeElement: (x: Array[Int])Int

 val m=Array(1,2,3,1,1,1)                         //> m  : Array[Int] = Array(1, 2, 3, 1, 1, 1)
 
  //Or simple solution using takeRight on array
 
 def sum_last_3(arr: Array[Int]): Int = {
     if (arr.length < 1) 0
     else if (arr.length > 0  && arr.length < 3) arr.takeRight(2).sum
     else arr.takeRight(3).sum
  }                                               //> sum_last_3: (arr: Array[Int])Int
 
 val getnum=sum_last_3(m)                         //> getnum  : Int = 3
   println(getnum)                                //> 3



//Question 12.Write a Scala program to create a new array taking the middle element from three arrays of length 5.

val ab=Array(1,2,3,4,5)                           //> ab  : Array[Int] = Array(1, 2, 3, 4, 5)
val ac=Array(1,2,3,4,5)                           //> ac  : Array[Int] = Array(1, 2, 3, 4, 5)
val ad=Array(1,2,3,4,5)                           //> ad  : Array[Int] = Array(1, 2, 3, 4, 5)

var ae:Array[Int]=Array()                         //> ae  : Array[Int] = Array()

val af=ab(2)                                      //> af  : Int = 3
val ag=ac(2)                                      //> ag  : Int = 3
val ah=ad(2)                                      //> ah  : Int = 3

ae =ae :+ af
ae =ae :+ ag
ae =ae :+ ah
//just to print the values of array using toList
ae.toList                                         //> res9: List[Int] = List(3, 3, 3)

//another simple solution

if (ab.length!=5 || ac.length!=5 || ad.length!=5) throw new IllegalArgumentException("illegal aruguements")
else Array(ab(2),ac(2),ad(2))                     //> res10: Array[Int] = Array(3, 3, 3)

//Question 13.Write a Scala program to reverse an array of integer values.


var ai=Array(1,2,3,4)                             //> ai  : Array[Int] = Array(1, 2, 3, 4)

ai.reverse                                        //> res11: Array[Int] = Array(4, 3, 2, 1)

//another solution

def test1(nums: Array[Int]): Array[Int] = {
    var temp1 = 0
    var temp2 = 0
    var index_position = 0
    var index_last_pos = nums.length - 1
    //var newArray:Array[Int]=Array()
    while (index_position < index_last_pos) { //1 . 0<3 // 2. 1<2
    temp1 = nums(index_position)     //1. 1 //2.2
    temp2 = nums(index_last_pos)     //1. 4 //2.3
    nums(index_position) = temp2     //1. 4 //2.3
    nums(index_last_pos) = temp1     //1. 1 //2.2
    index_position += 1
    index_last_pos -= 1
     }
    nums
  }                                               //> test1: (nums: Array[Int])Array[Int]
  
  
println(test1(ai).toList)                         //> List(4, 3, 2, 1)

    
//Question14.Write a Scala program to check two numbers, 4 or 7 present in a given array of integers.
 
 val aj=4                                         //> aj  : Int = 4
 val ak=7                                         //> ak  : Int = 7
 val al=Array(1,2,3,4,5,7)                        //> al  : Array[Int] = Array(1, 2, 3, 4, 5, 7)
 
 if (al.contains(aj) || al.contains(ak)){
 true
 }
 else {
 false
 }                                                //> res12: Boolean = true
    
    
//Question15. Write a Scala program to find the maximum value from first, middle and last values of a given array of integers.
// Array length should be 1 and more and odd.
  
  val am=Array(1,2,3,4,5,6,9)                     //> am  : Array[Int] = Array(1, 2, 3, 4, 5, 6, 9)
  
  if (am.length%2!=0 && am.length==1) false
  else {
  val middle=am.length/2.round
  val an=Array(am.head,am.last,am(middle))
  an.max
  }                                               //> res13: AnyVal = 9
  
  
//Question16.Write a Scala program to find the common elements between two arrays of integers.

val ao=Array(1,2,4)                               //> ao  : Array[Int] = Array(1, 2, 4)
val ap=Array(2,1,9)                               //> ap  : Array[Int] = Array(2, 1, 9)

var aq:Array[Int]=Array()                         //> aq  : Array[Int] = Array()

for(i<- ao ;j<- ap){
if(i==j){
aq=aq:+ i
}
}

aq.toList                                         //> res14: List[Int] = List(1, 2)
  
  
//Question17.Write a Scala program to find the common elements between two arrays of strings

val ar=Array("Sachin","Hitesh","Mihir")           //> ar  : Array[String] = Array(Sachin, Hitesh, Mihir)
val as=Array("Sachin","Yogesh","Tawdya")          //> as  : Array[String] = Array(Sachin, Yogesh, Tawdya)
var at:Array[String]=Array()                      //> at  : Array[String] = Array()
for(i<- ar ;j<- as){
if(i==j){
at=at:+ i
}

at
}

at.toList                                         //> res15: List[String] = List(Sachin)
  
//Question18.Write a Scala program to remove duplicate elements from an array of strings.

val au=Array("Sachin","Hitesh","Mihir","Hitesh")  //> au  : Array[String] = Array(Sachin, Hitesh, Mihir, Hitesh)



var av =0                                         //> av  : Int = 0
        for (i <- 0 to au.length-1)
         {
           var aw = av+1;
           for (j <- aw to au.length-1)
            {
                if(au(av) == au(aw) && (av != aw) )
                {
                    println("\nDuplicate Element: "+au(aw));
                }
              aw=aw+1;
            }
           av=av+1;
        }                                         //> 
                                                  //| Duplicate Element: Hitesh
  
 
 
 
 //Question19.Write a Scala program to remove duplicate elements from an array of integers.
 
 val ax=Array(1,2,2,1)                            //> ax  : Array[Int] = Array(1, 2, 2, 1)
 ax.toSet.toArray                                 //> res16: Array[Int] = Array(1, 2)
 def dropdups(x:Array[Int]):Array[Int]={
 var kl:Array[Int]=Array()
 var ay=0
 for (i<- 0 to x.length-1){
 
 var az=ay+1

 for (j<- az to x.length-1){
 
 if(x(ay)==x(az) && ay!=az) println("duplicate ingeter is : " + ax(az))
 kl:+x.drop(az)
 az+=1


 }
 ay+=1

 }
  kl
 }                                                //> dropdups: (x: Array[Int])Array[Int]
 dropdups(ax)                                     //> duplicate ingeter is : 1
                                                  //| duplicate ingeter is : 2
                                                  //| res17: Array[Int] = Array()
 

 
 
 
 //Question20.Write a Scala program to find the second smallest element from a given array of integers.
 
 val ba=Array(1,3,4,5)                            //> ba  : Array[Int] = Array(1, 3, 4, 5)
 
 val bb=ba.sorted                                 //> bb  : Array[Int] = Array(1, 3, 4, 5)
 
 println(bb(1))                                   //> 3


//Question21.Write a Scala program to test the equality of two arrays.

  val bc=Array(1,2,3,4,5)                         //> bc  : Array[Int] = Array(1, 2, 3, 4, 5)
  val bd=Array(1,2,3,4,5)                         //> bd  : Array[Int] = Array(1, 2, 3, 4, 5)
 
if (bc.length==bd.length){
var be:Boolean=true
for(i<-0 to bc.length-1){

if (bc(i)!=bd(i)){
be=false
}
else {
be=true
}

}
println(be)
}                                                 //> true


//Question22.Write a Scala program to find the number of even and odd integers in a given array of integers.


                                       
val bf=Array(1,2,3,4,5,6)                         //> bf  : Array[Int] = Array(1, 2, 3, 4, 5, 6)

var even=0                                        //> even  : Int = 0
var odd=0                                         //> odd  : Int = 0
for(i<-bf){
if (i%2==0) {
even +=1
}
else {
odd+=1
}
}
println(even)                                     //> 3
println(odd)                                      //> 3








}