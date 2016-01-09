//Scala Test Assertions

import org.scalatest.Assertions._
val left = 2
val right = 2
assert(left == right)
val attempted = 2
assert(attempted == 2,
s"Execution was attempted $left times instead of 1 time")
assertResult(0){
  left - right
}






