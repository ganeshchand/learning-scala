//Scala pattern matching

//1. Pattern Matching with Values

def matchColor(color: String): String = {
  color match {
    case "red" => "RED"
    case "blue" => "BLUE"
    case "green" => "GREEN"
    case _ => "UNKNOWN COLOR: "+color
  }
}

matchColor("yellow")
matchColor("blue")


def oneOrTheOther(exp: Boolean): String = {
  exp match {
    case true => "It's true"
    case _ =>"It's false"
  }
}
val v1 = Vector(1)
val v2 = Vector(3,4)

oneOrTheOther(v1 == v1.reverse)
oneOrTheOther(v2 == v2.reverse)


def checkTruth(exp1: Boolean, exp2: Boolean): String = {
  (exp1, exp2) match {
    case (true,true) => "Both are true"
    case (true,false) => "First: true, second: false"
    case (false, true) => "First false, second: true"
    case _ => "Both are false"
  }
}

checkTruth(true || false, 1 ==2)
checkTruth(true, true)
checkTruth(1 > 0 && -1 < 0, 1 == 2)
checkTruth(true && false, false && true)


def forecast(n: Int): String = {
  n match {
    case 100 => "Sunny"
    case 80 => "Mostly Sunny"
    case 50 => "Partly Sunny"
    case 20 => "Mostly Cloudy"
    case 0 => "Cloudy"
    case _ => "Unknown"
  }
}

forecast(100)

val sunnyData = Vector(100, 80, 50, 20, 0, 15)

for(i <- sunnyData){
  println(forecast(i))
}

// 2. Pattern Matching with Types
case class Person(name: String)
def functionWithAnyType(value: Any): String = {
  value match {
    case value: Int => s"$value if of type Int"
    case value: String => s"$value if of type String"
    case value: Person  => s"value if os type Person"
  }
}

functionWithAnyType("Scala")


// 3. Pattern Matching with Case Class

case class Passenger(first: String, last: String)
case class Train(travellers: Vector[Passenger], line: String)
case class Bus(passengers: Vector[Passenger], capacity: Int)


def travel(transportMode: Any): String = {
  transportMode match {
    case Train(travellers, line) =>
      s"Train line $line $travellers"

    case Bus(travellers, seats) =>
      s"Bus size $seats $travellers"

    case Passenger => "Walking along"

    case _ => s"Unknown mode $transportMode"
  }
}

val travellers = Vector(
Passenger("Harvey", "Rabbit"),
Passenger("Dorothy", "Gale")
)

val trip = Vector(
Train(travellers, "London"),
Bus(travellers, 100)
)

travel(trip(0))