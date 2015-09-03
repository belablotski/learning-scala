// XML from http://www.w3schools.com/xml/simple.xml (reduced)

import scala.xml._

val xmlStr = """<breakfast_menu>
<food>
<name>Belgian Waffles</name>
<price>$5.95</price>
<description>
Two of our famous Belgian Waffles with plenty of real maple syrup
</description>
<calories>650</calories>
</food>
<food>
<name>Strawberry Belgian Waffles</name>
<price>$7.95</price>
<description>
Light Belgian waffles covered with strawberries and whipped cream
</description>
<calories>900</calories>
</food>
</breakfast_menu>"""

val xml = XML.loadString(xmlStr)

// Another way to specify XML in Scala source code:
// val xml = <a><b></b><b></b><b></b></a>

// Format XML
def formatXml(xml: scala.xml.Node): Unit = {
	def printer = new scala.xml.PrettyPrinter(80, 2)
	println(printer.format(xml))
	println("----------------------------------------------------------------------------------")
}

formatXml(xml)

println("==================================================================================")

for {
	n <- xml \\ "food"						// XPath returns scala.xml.NodeSeq
} yield n map ( formatXml(_) )

println("==================================================================================")

for {
	n <- xml \\ "food" \ "price"				// XPath returns scala.xml.NodeSeq
} yield n map ( formatXml(_) )