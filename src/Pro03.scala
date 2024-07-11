object Pro03 {

  def toUpper(s: String): String = s.toUpperCase

  def toLower(s: String): String = s.toLowerCase

  def formatNames(name: String)(formatFunction: String => String): String = {
    formatFunction(name)
  }

  def main(args: Array[String]): Unit = {
    val benny = formatNames("Benny")(toUpper)
    val niroshan = formatNames("Niroshan")(name => name.take(2).toUpperCase + name.drop(2))
    val saman = formatNames("Saman")(toLower)
    val kumara = formatNames("Kumara")(name => name.take(name.length - 1) + name.last.toUpper)

    println(benny)
    println(niroshan)
    println(saman)
    println(kumara)     // Output: KumarA
  }
}
