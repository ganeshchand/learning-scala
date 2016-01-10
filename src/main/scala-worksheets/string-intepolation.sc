import java.util.{Calendar, Date}

// String Interpolation

/**
  * With string interpolation, you create strings containing formatted values.
  * You put an ‘s’ in front of the string, and a ‘$’ before the
  * identifier you want Scala to interpolate:
  */

s"This is a simple String"

val date = Calendar.getInstance().getTime

s"Today's date is $date"

//Interpolation with expression
val num1 = 1
val num2 = 2
s"Adding $num1 and $num2: {$num1 + $num2}"

//Interpolation with method
def addTwo(n: Int): Int = n +2
s"addTwo(5) = ${addTwo(5)}"

//Interpolation with class
case class Sky(color: String)
s"""Sky is ${Sky("blue").color}:""" // use triple quote to allow quote on arguments












