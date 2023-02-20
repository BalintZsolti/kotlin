class BankAccount(accountNumber : String , balance : Double) {
   private var balance: Double = balance
   private val accountNumber: String = accountNumber


    constructor(accountNumber: String) : this(accountNumber, 0.0)
    fun getAccountNumber(): String {
        return accountNumber
    }

    fun getBalance(): Double {
        return balance
    }

    fun deposit(amount: Double) {
        require(amount >= 0.0) { "Deposit amount must be non-negative" }
        balance += amount
    }

    fun withdraw(amount: Double) {
        require(amount >= 0.0) { "Withdrawal amount must be non-negative" }
        require(balance - amount >= 0.0) { "Insufficient funds" }
        balance -= amount
    }
}
