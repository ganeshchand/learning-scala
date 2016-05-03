
val capitals =      Map("France" -> "Paris",
      "Japan" -> "Tokyo",
      "Nepal" -> "Kathmandu")

println(s"${capitals.get("France")}") // returns Some(Paris)

println(s"${capitals.get("USA")}") // returns None



// using pattern matching

def displayCapital(x: Option[String]) = x match {
  case Some(s) => s  // returns a string
  case None => "Undefined"
}

displayCapital(capitals.get("Nepal"))
displayCapital(capitals.get("Canada"))


// Using getOrElse() to access a value or a default value

capitals.getOrElse("France","Capital not defined")
capitals.getOrElse("Canada","Capital not defined")


