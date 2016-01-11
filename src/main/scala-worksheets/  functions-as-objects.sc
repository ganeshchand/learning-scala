// passing functions as objects

/**
  * Methods are attached to class
  * Function is its own objects. When we pass function, Scala
  * converts it to a function object. This is called Lifting.
  * Single Argument: Type is inferred and argument is optional
  * Multiple Argument: Must use Parenthesis

  */

def show(n: Int): Unit = println(n)

val v = Vector(1,2,3,4)

v.foreach(show)

// Function Literal or Anonymous Function

// It is defined using => symbol, often called "rocket"

v.foreach(n => println(n))
v.foreach(println) // works because there is a single argument

val strVector = "Anonymous functions are useful".toVector // Vector[Char]

strVector.foreach(println)

//test

val scala = "Scala".toVector
var s = ""
scala.foreach(char => s += char)
println(s)
assert(s == "Scala")


// multiple arguments
val numVect = Vector(19,1,7,3,2,14)
numVect.sorted.foreach(println)

numVect.sortWith((i, j) => j > i).foreach(println)



// no arguments

def test(f: () => Unit): Unit = f

test(() => println("no argument anonymous function"))

//assigning to to a var or val
var simplePrint = () => println("Hi")

simplePrint








