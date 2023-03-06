package lab4_2

class BankAccount(private var accountNumber : String ,private var balance : Double) {
    init{
        this.balance=balance;
        this.accountNumber=accountNumber;
    }
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

    override fun toString(): String {
        return "BankAccount(balance=$balance, accountNumber='$accountNumber')"
    }
}
