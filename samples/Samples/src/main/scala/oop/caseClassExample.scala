package oop

object caseClassExample extends App {
  val alice = Person("Alice", 25)
  val rabbit = Person("Bugs",  50)
  val duck = Person("Donald",  21)

  for(person <- List(alice, rabbit, duck)) {
    person match {
      case Person("Alice", 25) => println("Hi Allice")
      case Person("Bugs",  50) => println("Hi Buggy")
      case Person("Donald",  21) => println("Hi Dummy")
    }
  }
 
}
case class Person(fName:String, age:Int) 