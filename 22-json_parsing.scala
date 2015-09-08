import scala.util.parsing.json._

val r = JSON.parseFull("""
{
	"database": {
		"name": "Purchase system DB",
		"tables": [{
				"name": "Orders",
				"volume": 100
			},
			{
				"name": "DimDate",
				"volume": 1
			}
		]
	}
}
""")


println(r)		// Some(Map(database -> Map(name -> Purchase system DB, tables -> List(Map(name -> Orders, volume -> 100.0), Map(name -> DimDate, volume -> 1.0)))))


// Or use http://json2caseclass.cleverapps.io to prepare Scala case classes