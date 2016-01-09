// class arguments are typically used to initialize
// class objects with some values

// variable arguments
class Family(members: String*){
  def familySize(): Int = {
    members.size
  }
}

val family1 = new Family("Mom", "Dad", "Sally", "Dick")
family1.familySize()

class FlexibleFamily(dad: String, mom: String, children: String*){
  def familySize(): Int = {
    children.size + 2
  }
}

val family2 = new FlexibleFamily("Mom", "Dad", "Sally")
family2.familySize()

val familyWithNoKids = new FlexibleFamily("Mom", "Dad")
familyWithNoKids.familySize()


/*
 // produces error: variable argument list must always be the last parameter
class SuperFlexibleFamily(parents: String*, children: String*) {

}
*/
// if class argument doesn't have val or var, it cannot be
// accessed outside the class
class Cup2(var percentFull: Int){
  val max = 100
  def add(poursAndSpills: Int*): Int = {
    for(i <- poursAndSpills) {
      percentFull += i
    }
    if(percentFull > max) 100
    else percentFull
  }
}

val cup2 = new Cup2(0)
cup2.add(45)
cup2.add(-15)

cup2.percentFull
cup2.percentFull = 0

val cup3 = new Cup2(0)
cup3.add(20,30,50,20,10,-10,-40,10,50)


def squareThem(nums: Int*): Int = {
  var sum = 0
  for(i <- nums){
    sum += i * i
  }
  sum
}

squareThem(2)
squareThem(2,4)
squareThem(1,2,4)

/**
  * “Ordinarily, named arguments allow us to change the order of the parents, so we can specify first dad, then mom.
  * When you add a variable argument list, however, you can no longer reorder arguments by naming them.
  * So, AVOID using named arguments with variable argument lists.
  */

class SimpleTime(var hours: Int, var minutes: Int = 0){

}
val t = new SimpleTime(hours = 5, minutes = 30)
t.hours
t.minutes

val t2 = new SimpleTime(10)
t2.hours
t2.minutes //default value

val t3 = new SimpleTime(hours = 2)
t2.hours
t2.minutes // default value



class Planet(val name: String, val description: String, moons: Int = 1){
def hasMoon(): Boolean = {
  moons match {
    case 0 => false
    case _ => true
  }
}
}

val p1 = new Planet(name = "Mercury",
description = "small and hot planet",
moons = 2
)
p1.hasMoon()











