// Transform Collection into Map

case class Purse(var amount: Double, val currency: String)

val myBag = List(Purse(10, "USD"), Purse(15, "EUR"), Purse(20, "CAD"), Purse(5, "USD"), Purse(7, "CAD"))
println(myBag)

val myBalance = myBag groupBy (_.currency)
println(myBalance)						// Map(CAD -> List(Purse(20.0,CAD), Purse(7.0,CAD)), EUR -> List(Purse(15.0,EUR)), USD -> List(Purse(10.0,USD), Purse(5.0,USD)))
myBalance map (x => println(x._1))
myBalance map (x => println(x._2 map (y => y.amount)))
myBalance map (x => println(x._2 map (y => y.amount) reduce ((z1, z2) => z1 + z2)))

/*
(CAD,27.0)
(EUR,15.0)
(USD,15.0)
*/
myBalance map (x => println(x._1, x._2 map (y => y.amount) reduce ((z1, z2) => z1 + z2)))

/*
Currency:CAD, Amount:27.0
Currency:EUR, Amount:15.0
Currency:USD, Amount:15.0
*/
println(myBalance map (x => s"Currency:${x._1}, Amount:${(x._2 map (y => y.amount) reduce ((z1, z2) => z1 + z2)  )}") reduce ((s1, s2) => s1 + "\n" + s2))