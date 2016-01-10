/**
  * With case classes, unlike regular classes, we don’t have to use the new keyword when creating an object
  * A case class automatically creates all the class arguments as vals
  *
  */

case class Dog(name: String, breed: String)

val dogs = Vector(
Dog("Fido", "Golden Lab"),
  Dog("Ruff", "Alaskan Malamute")
)

dogs(0).name
dogs.foreach(x => println(x.name))





