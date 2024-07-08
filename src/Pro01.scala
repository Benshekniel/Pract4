import scala.io.StdIn
object Pro01 {
  val item = Array("soap", "fruit juice", "books", "pen", "pencil", "eraser")
  val quantity = Array(6, 4, 10, 20, 30, 40)

  def displayinventory(): Unit = {


    println("list of the inventory items names and quantity ")
    for(i <- item.indices)
    {
      println(item(i) +" " + quantity(i) + "\n")

    }

  }

  def restockitem(name: String , quant: Int): Unit = {
    var count=0
    for(i<- item.indices)
    {
      if(item(i) == name)
      {
        quantity(i) = quantity(i) + quant
        count=count+1
      }
    }

    if(count<1)
    {
      println("your item is not sale or restore in our store")
    }

    println("now available items and quantity are : ")
    for(i <- item.indices)
    {
      println(item(i) + " " + quantity(i) + "\n")
    }


  }

  def sellitem(name: String, quant: Int): Unit = {
    var count = 0
    for (i <- item.indices)
    {
      if (item(i) == name) {
        quantity(i) = quantity(i) - quant
        count = count - 1
      }
    }

    if (count < 1)
    {
      println("your item is not sale or restore in our store")
    }

    println("now available items and quantity are : ")
    for (i <- item.indices) {
      println(item(i) + " " + quantity(i) + "\n")
    }


  }


  def main(args: Array[String]) : Unit = {

    displayinventory()
    println("how many items do you want to buy \n ")
    var result1= StdIn.readLine().toInt


    for(j <-0 until result1 )
    {
      println("enter the item which you want to buy : ")
      var result2= StdIn.readLine().toString

      println("enter the quantity this item which you want to buy : ")
      var result3=StdIn.readLine().toInt
      restockitem(result2,result3)


    }

    for (j <- 0 until result1) {
      println("enter the item which you want to add : ")
      var result4 = StdIn.readLine().toString

      println("enter the quantity this item which you want to add : ")
      var result5 = StdIn.readLine().toInt
      sellitem(result4, result5)


    }


  }

}
