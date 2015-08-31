val lst = List(1, 2, 3, 4, 5)

println(lst.foldLeft(0) {(total, x) => total + x})		// sum: 15
println(lst.foldLeft(0) {(count, x) => count+1})		// count: 5
