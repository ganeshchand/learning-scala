// Scala Map & Reduce

/**
  * Scala foreach() is useful but it doesn't return anything.
  * map() takes a argument - a function that takes a single argument
  * and produces a result and applies it to each element in the sequence.
  * It's similar to foreach(), but it captures the return values from each
  * call and stores it in a new sequence.

  */

// Increment each element of a Vector by 1

val nums = Vector (1,2,3,4,5)

val newNums = nums.map(x => x + 1)

newNums.foreach(println)

// sum of elements of Vector: using foreach()

var sum = 0 // requires var
nums.foreach(x => sum += x)
println(sum)

//using reduce

var sum1 = nums.reduce((sum,n)=> sum + n) //
println(sum1)

(1 to 100).reduce((sum,n) => sum + n)

Vector("D", "U", "C", "K").reduce((sum, n) => sum + n)


def sumIt(nums: Int*): Int = {
  nums.reduce((sum, n) => sum + n)
}

sumIt(1,2,3)

sumIt(1,2,3,4,0)







