package change.engine

object OkHttp {
  
  def getUrlContent(url:String):String = {
    scala.io.Source.fromURL(url).mkString
  }

  
  
}