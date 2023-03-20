package lab6_1

class BankAccount( ) {
    private var balance : Double = 0.0
    private var accountNumber : String
    init{
        numAccounts++
        this.balance=balance;
        this.accountNumber=generateAccountNumber(numAccounts)
    }
    fun getAccountNumber(): String {
        return accountNumber
    }

    fun getBalance(): Double {
        return balance
    }
    private fun generateAccountNumber(numAccounts: Int): String {
        val accountNumberStr = numAccounts.toString().padStart(ACCOUNT_NUMBER_LENGTH - PREFIX.length, '0')
        return PREFIX + accountNumberStr
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
            return "Account $accountNumber, balance: $balance"
        }

    companion object {
        private var numAccounts : Int = 0
        const val PREFIX : String = "OTP"
        const val ACCOUNT_NUMBER_LENGTH : Int = 10
    }

}

