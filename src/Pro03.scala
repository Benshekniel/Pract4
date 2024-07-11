object format_string {

  def toUpper(s: String): String = s.toUpperCase

  def toLower(s: String): String = s.toLowerCase

  def formatNames(name: String)(formatFunction: String => String): String = {
    formatFunction(name)
  }

  def main(args: Array[String]): Unit = {

    println(formatNames("Benny")(toUpper))
    println(formatNames("Niroshan")(name => formatNames(name.take(2))(toUpper)+ name.drop(2)))
    println(formatNames("Saman")(toLower))
    println(formatNames("Kumara")(name => name.take(name.length - 1) + name.last.toUpper))

  }
}