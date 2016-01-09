
class Greeter(var message: String = "Hello World!"){

  println("Constructor being initialized")

  def sayHi(): String = message

}
//This is how you make class instatiable without using new keyword
object Greeter{
  def apply(message: String = "Hello World!"): Greeter = {
    new Greeter(message)
  }
}

val greeter = new Greeter("Hello Scala")
greeter.message
greeter.sayHi()
val greeter1 = new Greeter()
greeter1.sayHi()

val greeter2 = Greeter()
greeter2.sayHi()


//Auxiliary Constructors

//all auxiliary constructors must first call the primary constructor.
//You can't use val or var
//first line of an auxiliary constructor must be a call to teh primary constructor


class ClothesWasher(var model: String, var capacity: Double){
  def this(model: String) = {
    this(model, 2D)
  }
  def this(capacity: Double) = {
    this("unknown", capacity)
  }
  def this() = {
    this("unknown",2D)
  }
}

val washer1 = new ClothesWasher
washer1.capacity
washer1.model

val washer2 = new ClothesWasher("AllInOne", 5D)
washer2.capacity
washer2.model


//same result can be achieved using named class arguments with default values

class ClothesWasher1(var model: String = "Unknown", var capacity: Double = 2D){

}

val washer3 = new ClothesWasher1
washer3.capacity
washer3.model

val washer4 = new ClothesWasher1("AllInOne", 5D)
washer4.capacity
washer4.model













