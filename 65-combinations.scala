// Generate all combinations.
// Elements order is important.

val lst = List(1, 2, 3)
val cmb= lst.combinations(2)
cmb.foreach(println)

println

val cmbRev= lst.reverse.combinations(2)
cmbRev.foreach(println)
