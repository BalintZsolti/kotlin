package lab3_2

import lab3_1.BankAccount
import lab3_2.Customer

fun main(args: Array<String>) {

    var customer1 = Customer("John","Black")
    var customer2= Customer("Mary","White")

    println( customer1.toString())
    val account1 = BankAccount("OTP00001", 1000.0)
    val account2 = BankAccount("OTP00002", 20.0)
    val account3 = BankAccount("OTP00003", 200.0)
    val account4 = BankAccount("OTP00004", 4550.0)
    val account5 = BankAccount("OTP00005", 12000.0)

    val account6 = BankAccount("OTP00006", 200.0)
    val account7 = BankAccount("OTP00007", 4550.0)
    val account8 = BankAccount("OTP00008", 12000.0)
    val account9 = BankAccount("OTP00009", 4550.0)
    val account10 = BankAccount("OTP00010", 12000.0)
    val account11 = BankAccount("OTP00011", 4550.0)
    val account12 = BankAccount("OTP00012", 12000.0)
    val account13 = BankAccount("OTP00013", 4550.0)
    val account14 = BankAccount("OTP00014", 12000.0)

    customer1.addAccount(account1)
    customer1.addAccount(account2)
    customer1.addAccount(account3)
    customer1.addAccount(account4)
    customer1.addAccount(account5)

    customer2.addAccount(account6)
    customer2.addAccount(account7)
    customer2.addAccount(account8)
    customer2.addAccount(account9)
    customer2.addAccount(account10)
    customer2.addAccount(account11)
    customer2.addAccount(account12)
    customer2.addAccount(account13)
    customer2.addAccount(account14)

    customer1.getAccount("OTP00001")?.deposit(1234.0)
    customer2.getAccount("OTP00009")?.deposit(1234.0)

    var searchedAccount = customer1.getAccount("OTP00001")
    println("The account you are looking for: " +searchedAccount.toString())
    var numAcc=customer1.getNumAccounts()
    println(customer1.toString())
    println(customer2.toString())
}