import scala.annotation.switch

val i = 1
val j = 1
val x = (i: @switch) match {
  case `j` => "First"
  case 2 => "Second"
  case 3 => "Third"
  case _ => "Other"
}

println(x)


/* Output:

10-@switch_v2.scala:5: warning: could not emit switch for @switch annotated match
val x = (i: @switch) match {
             ^
one warning found
First
*/