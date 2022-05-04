object ObjectOrientedScala2 {
 
 class Animal {
  def eat= println("Animal eat a lot") //If we set this method private it cannot be called in child class or its instance.
  //if we set this method protected it we will just able to call it in child class but not in its instance
  //By default its in no modifire that means its set to public.

 }
 
 class Cat extends Animal {

 def preferedaMeal=println("Milk")

 }

val cat=new Cat                                   //> cat  : ObjectOrientedScala2.Cat = ObjectOrientedScala2$Cat@5ce65a89

cat.eat                                           //> Animal eat a lot

cat.preferedaMeal                                 //> Milk
 
}