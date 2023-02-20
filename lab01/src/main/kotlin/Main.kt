import java.util.*

fun main(args: Array<String>) {

    val account1 = BankAccount("OTP00001", 1000.0)

    println("Account Number: ${account1.getAccountNumber()}")
    println("Balance: ${account1.getBalance()}")

    account1.deposit(1000.0)
    println("New Balance after deposit: ${account1.getBalance()}")

    account1.withdraw(500.0)
    println("New Balance after withdrawal: ${account1.getBalance()}")

    account1.withdraw(1500.0)
    println("New Balance after withdrawal: ${account1.getBalance()}")

    val account2 = BankAccount("OTP00002")
    println("Account Number: ${account2.getAccountNumber()}")
    println("Balance: ${account2.getBalance()}")

    val rectangles = mutableListOf<Rectangle>()
// initialize the list with some default values
    for (i in 0..9) {
        rectangles.add(Rectangle(0.0, 0.0))
    }

    for (i in rectangles.indices) {
        val rand = Random()
        val length: Double = 1 + rand.nextDouble(10.0)
        val width: Double = 1 + rand.nextDouble(10.0)
        rectangles[i] = Rectangle(length, width)
    }

    //Get the information about the rectangles
    var totalArea=0.0
    for (i in rectangles.indices){

        println("Length: ${rectangles[i].getLength()}")
        println("Width: ${rectangles[i].getWidth()}")
        println("Area: ${rectangles[i].area()}")
        println("Perimeter: ${rectangles[i].perimeter()}\n\n")
        totalArea+=rectangles[i].area()
    }

    println("Total area of the rectangles: $totalArea")

}