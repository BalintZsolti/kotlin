import lab4_2.BankAccount
import lab4_2.Customer
import java.io.File

fun main(args: Array<String>) {
    val (customers, accounts) = readCustomersFromFile("lab4_2_input.txt")
    for (customer in customers) {
        println("${customer.getFirstName()} ${customer.getLastName()} accounts:")
        for (account in customer.getAccount()) {
            println(account)
        }
    }
}

fun readCustomersFromFile(fileName: String): Pair<List<Customer>, MutableMap<String, BankAccount>> {
    val customers = mutableListOf<Customer>()
    val accounts = mutableMapOf<String, BankAccount>()

    File(fileName).useLines { lines ->
        lines.forEach { line ->
            val items = line.split(", ")
            when (items[0]) {
                "Account" -> {
                    val accountNumber = items[1]
                    val balance = items[2].toDouble()
                    accounts[accountNumber] = BankAccount(accountNumber, balance)
                }
                "Customer" -> {
                    val firstName = items[1]
                    val lastName = items[2]
                    val customer = Customer(firstName, lastName)
                    customers.add(customer)
                    for (i in 3 until items.size) {
                        val accountNumber = items[i]
                        val account = accounts[accountNumber]
                        if (account != null) {
                            customer.addAccount(account)
                        }
                    }
                }
            }
        }
    }
    return Pair(customers, accounts)
}
