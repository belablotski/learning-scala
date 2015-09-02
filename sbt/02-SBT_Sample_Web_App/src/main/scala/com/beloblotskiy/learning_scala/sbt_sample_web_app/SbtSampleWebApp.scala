package com.beloblotskiy.learning_scala.sbt_sample_web_app

import javax.servlet.http._
import scala.xml.NodeSeq

/**
 * @author abelablotski
 */
class SbtSampleWebApp extends HttpServlet {
  override def doGet(request: HttpServletRequest, response:HttpServletResponse) {
    response.setContentType("text/html")
    response.setCharacterEncoding("UTF-8")
    val responseBody: NodeSeq =
      <html><body><p>Scala "Hello World" web app</p></body></html>
    response.getWriter.write(responseBody.toString)
  }
}