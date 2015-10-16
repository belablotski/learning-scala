// Scala doesn't have break and continue keywords -- for such functionality use scala.util.control.Breaks

import util.control.Breaks._

/*
1
2
3
4
5
6
scala.util.control.BreakControl   --- execution will be stopped here
*/
/*
for (i <- 1 to 10) {
  println(i)
  if (i > 5) break
}
*/  

println("break...")

/*
1
2
3
4
5
6
*/
breakable {
  for (i <- 1 to 10) {
    println(i)
    if (i > 5) break
  }
}

println("continue...")

/*
There is no continue statement at all. So for emulating loop with continue, we can use breakable...

for (i <- 1 to 10) {
  if (i <= 5) continue
  println(i)  
}
*/

for (i <- 1 to 10) {
  breakable {
    if (i <= 5) break
    println(i)
  }	
}