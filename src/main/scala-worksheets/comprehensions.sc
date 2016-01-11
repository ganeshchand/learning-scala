//Comprehensions (or for comprehensions)

//combination of for and if called for comprehensions

/**
  * In Scala, comprehensions combine:
  * generators, filters and definitions
  *
  */

def evenGT5(v: Vector[Int]): Vector[Int] = {
  var resultVector = Vector[Int]() // empty vector
  for {
    n <- v
    if (n > 5) // filter
    if (n % 2 == 0) // filter
  } resultVector = resultVector :+ n // :+ is a method provided by Vector to append
  resultVector // return
}
// :+ produces a new Vector by appending n to the old one
evenGT5(Vector(1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 11, 13)).foreach(println) // 6,8
// using val
// uses for comprehension and yield

def evenGT51(v: Vector[Int]): Vector[Int] = {
  val result = for {
    n <- v
    if (n > 5) // filter
    if (n % 2 == 0) // filter
  } yield n // "yields up" the value n to become part of the result
  result // result type is inferred
}

evenGT5(Vector(6, 7, 8, 10, 11)).foreach(println)


/**
  * This method used for comprehension and yield.
  * You don't use val or var when you declare variables inside the comprehensions.
  * They change each time through the loop, but you can't modify them manually.
  * Instead, you reply on Scala to do it. They are just like temp variables.
  * This implementation doesn't require intermediate results (vector)
  *
  * @param v vector of Integers
  * @return vector containing even numbers greater than 5
  */
def evenGT52(v: Vector[Int]): Vector[Int] = {
  for {
    n <- v
    if n > 5
    isEven = (n % 2 == 0) // assignment
    if (isEven)
  } yield n
}

// Yield expression can by compounded too

for {
  n <- 1 to 10
  if n > 5
  if n % 2 == 0
} yield {
  val u = n * 10
  u + 2
}


// you can only have one yield inside the comprehension
// You cannot place yields in the body of the comprehension
// However, you can nest comprehensions


// Exercise:

case class Activity(date: String, activity: String)

def getDates(myActivity: String, activities: Vector[Activity]): Vector[String] = {
  for {
    a <- activities
    if (a.activity.equalsIgnoreCase(myActivity))
  } yield a.date

}

val activities = Vector(
  Activity("01-01", "Run"),
  Activity("01-03", "Ski"),
  Activity("01-04", "Run"),
  Activity("01-10", "Swim")
)

getDates("Run", activities)
