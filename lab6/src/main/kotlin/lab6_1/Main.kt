package lab6_1

fun main(args: Array<String>) {
    println("Exercise 1.a,b\n")
    val accounts = ArrayList<BankAccount>()

    for (i in 0 until 100) {
        val account = BankAccount()
        accounts.add(account)
        println(account)
    }

    val customers = ArrayList<Customer>()

    val customer1 = Customer("John", "Doe")
    customer1.addAccount(BankAccount())
    customer1.addAccount(BankAccount())

    val customer2 = Customer("Jane", "Smith")
    customer2.addAccount(BankAccount())

    val customer3 = Customer("Bob", "Johnson")
    customer3.addAccount(BankAccount())
    customer3.addAccount(BankAccount())
    customer3.addAccount(BankAccount())

    customers.add(customer1)
    customers.add(customer2)
    customers.add(customer3)

    for (customer in customers) {
        println(customer)
    }
    println("Exercise 1.c\n")

    val otpBank = Bank("OTP")

    otpBank.addCustomer(customer1)
    otpBank.addCustomer(customer2)


    val account1 = BankAccount()
    val account2 = BankAccount()
    customer1.addAccount(account1)
    customer1.addAccount(account2)

    val account3 = BankAccount()
    val account4 = BankAccount()
    customer2.addAccount(account3)
    customer2.addAccount(account4)


    val customer1FromBank = otpBank.getCustomer(0)
    println(customer1FromBank)

    // Deposit some amount of money in each of the accounts
    account1.deposit(50.0)
    account2.deposit(75.0)
    account3.deposit(100.0)
    account4.deposit(125.0)


    val customer2FromBank = otpBank.getCustomer(1)
    println(customer2FromBank)


    otpBank.printCustomersToFile("bank_customers.csv")


}