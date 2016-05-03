" scala is wonderful ".trim.split(" ").map(_.toLowerCase().capitalize).mkString(" ")

def toCamelcase = (text: String)  => {
  text
    .trim
    .split(" ")
    .map(_.toLowerCase.capitalize)
    .mkString(" ")
}

toCamelcase("scala is wonderful")


// just a function
def test(s:Int):String = s.toString
test(1)

// anonymous function
def test1 = (aNumber: Int) => aNumber.toString
test1(123)








