package lab3_1

fun main(args: Array<String>) {
    var customer1 = Customer("John","Black")
    println( customer1.toString())
    val account1 = BankAccount("OTP00001", 1000.0)
    customer1.setAccount(account1)
    customer1.getAccount().deposit(1000.0)
    println( customer1.toString())
    customer1.getAccount().withdraw(250.0)
    println( customer1.toString())

    var customer2 = Customer("Mary","White")
    val account2 = BankAccount("OTP00002", 4000.0)
    customer2.setAccount(account2)
    customer2.getAccount().deposit(1000.0)
    println( customer2.toString())
    customer2.getAccount().withdraw(250.0)
    println( customer2.toString())
    customer2.closeAccount()
}