// Scala has Typer Inference but sometimes you need to be Explicit
// especially with containers and collections

// Return Type is Inferred

def inferred(n1: Int, n2: Int, n3: Int) = Vector(n1,n2,n3)

// Explicit Return Type

def explicit(n1: Int, n2: Int, n3: Int): Vector[Int] = {
  Vector(n1,n2,n3)
}
