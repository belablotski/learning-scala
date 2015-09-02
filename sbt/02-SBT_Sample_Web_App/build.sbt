name := "SBT_Sample_Web_App"

organization := "com.beloblotskiy"

version := "1.0"

scalaVersion := "2.11.7"

seq(webSettings :_*)

libraryDependencies += "org.mortbay.jetty" % "jetty" % "6.1.26" % "container"

libraryDependencies += "javax.servlet" % "servlet-api" % "2.5" % "provided"

libraryDependencies += "org.scala-lang" % "scala-xml" % "2.11.0-M4"

