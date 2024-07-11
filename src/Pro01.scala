object InventoryManagement {
  // Initial inventory
  var itemNames = Array("Apples", "Bananas", "Oranges")
  var itemQuantities = Array(10, 5, 7)

  // Function to display the inventory
  def displayInventory(): Unit = {
    println("Current Inventory:")
    for (i <- itemNames.indices) {
      println(s"${itemNames(i)}: ${itemQuantities(i)}")
    }
  }

  // Function to restock an item
  def restockItem(itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if (index != -1) {
      itemQuantities(index) += quantity
      println(s"Restocked $itemName with $quantity units. New quantity: ${itemQuantities(index)}")
    } else {
      println(s"Item $itemName does not exist in the inventory.")
    }
  }

  // Function to sell an item
  def sellItem(itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if (index != -1) {
      if (itemQuantities(index) >= quantity) {
        itemQuantities(index) -= quantity
        println(s"Sold $quantity units of $itemName. New quantity: ${itemQuantities(index)}")
      } else {
        println(s"Not enough $itemName in stock to sell $quantity units.")
      }
    } else {
      println(s"Item $itemName does not exist in the inventory.")
    }
  }

  // Main function to test the system
  def main(args: Array[String]): Unit = {
    displayInventory()
    restockItem("Apples", 5)
    sellItem("Bananas", 3)
    sellItem("Oranges", 10)
    restockItem("Grapes", 20)
    displayInventory()
  }

}
