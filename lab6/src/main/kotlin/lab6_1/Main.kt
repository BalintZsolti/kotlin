package lab6_1

fun main(args: Array<String>) {

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



}