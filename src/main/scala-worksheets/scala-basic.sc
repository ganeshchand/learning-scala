import java.util.Calendar

object scala_basic{

  /**
    * A JVM-based object-functional programming language designed by Martin Odersky (University of Lausanne, Switzerland).
    * The Bible of Scala is "Programming in Scala"
    * Scala Prefers immutability, allows mutability
    * Data type comes after the name of the variable
    * Type inference and statically typed language
    * Semicolons are optional
    * String interpolation - using s and """
    * You don't have to use return keyword in function
    */
  println("Welcome to the Scala Worksheet!")

  //Scala prefers immutability - val, allows mutability - var
  val cantChangeMe: String = "Immutable Value"
  var changeMe: String = "Mutable Value"

  //cantChangeMe = "Trying to change" // can't do this
  changeMe = "Changing you"

  // type inference

  val inferMyDataType = 200

  // String interpolation
  println(s"Today's date is: ${Calendar.getInstance().getTime}")

  println(
    """I am a cool string,
      |because  I am allowed to have multiple lines, tabs, line-feeds...
    """.stripMargin)

  // Functions

  def saySomething(name: String): Unit = {
    println(s"Hello $name!")
  }
  saySomething("Scala User")

  def returnGreeting(name: String = "World", greet: String = "Hello") = {
    s"$greet, $name!" // no return keyword
    // return type is inferred. But best practice is to be explicit for code readability
    // and compile-time optimization
  }
  println(returnGreeting()) // default parameter values
  println(returnGreeting(greet="Namaste", name="Sansar")) // named parameters - parameter order is different


  //classes

  case class Person(name: String, age: Int)
  println(Person("Mr. Scala Programmer", 21))
  val p1 = Person("Mr. Scala Programmer", 21)
  println(s"Name: ${p1.name}  Age: ${p1.age}")

  class Book(var publishedDate = )
}


