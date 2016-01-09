
// add even numbers from 0 to 10
var sum = 0
for(i <- 0 to 10){
  if(i % 2 ==0) sum += i
}
println(sum)


var v1 = Vector(1,2,3,4,5)
for(i <- v1) println(i)

var v2 = Vector(1,"test")

var v3 = Vector(v1, v2)
for(v <- v3){
  println(v)
}



var string = "The dog visited the firehouse"
string.split(" ").foreach(println)


var strVector = Vector("The", "dog", "visited", "the", "firehouse")
println(strVector)
for(s <- strVector){
  if(s == strVector.last){
    print(s"$s") // remove space at the end
  }else
  print(s"$s ")
}

// print each word reversed

for(s <- strVector){
  println(s.reverse)
}

// print words in reverse order

for(s <- strVector.reverse){
  println(s)
}






