object ObjectOrientedScala3 {
 
 abstract class Animal {
 
 def sleep =println("Animal sleep a lot")
 val creatureType:String
 def eat
 }
 
 class dog extends Animal{
 
 val creatureType="canine"
 def eat:Unit=println("chicken")
  
 }
 
 val p=new dog
 
 p.creatureType
 p.sleep


///traits


trait carniovre{


def anything:Unit=println("I eat a lot")

}

trait coldblooded


class crocodile extends Animal with carniovre with coldblooded{

val creaturetype:String="Sea Animal"
def eat:Unit=println("I eat fish")

}


val crock =new crocodile

crock.creaturetype
crock.eat
crock.anything
}