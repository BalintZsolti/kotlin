package lab6_1

import java.io.File

class Bank(private var name: String) {
    private val customers = ArrayList<Customer>()

    fun getCustomer(index: Int): Customer {
        return customers[index]
    }

    fun addCustomer(customer: Customer) {
        customers.add(customer)
    }

    fun numCustomers(): Int {
        return customers.size
    }

    fun printCustomersToFile(fileName: String) {
        val file = File(fileName)
        file.printWriter().use { out ->
            customers.forEach {
                out.println(it.toString())
            }
        }
    }

    fun printCustomersToStandardOutput() {
        customers.forEach {
            println(it.toString())
        }
    }
}
