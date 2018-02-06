var x = 10
while(x >= 0) {
  println(x)
  x -= 1
}

println("End")

for(x <- 10 to 0 by -1) {
  println(x)
}

for(x <- 0 to 10) {
  println(x)
}

//For comprehensive loop
var l = for(x <- 0 to 10) yield x + 1

//For loop with collection
var word = "Sunday"
for(x <- 0 until word.length ) {
  println(word(x))
}