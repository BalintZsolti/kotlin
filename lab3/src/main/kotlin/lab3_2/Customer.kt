package lab3_2

import lab3_1.BankAccount

class Customer(firstName : String , lastName : String ) {
    private var firstName : String
    private var lastName : String
    private var account : BankAccount = BankAccount("",0.0);
    // constant
    companion object {
        const val MAX_ACCOUNTS = 10
    }
    private var numAccounts = 0
    private val accounts = Array<BankAccount?>(MAX_ACCOUNTS) { null }

    init{
        this.firstName=firstName;
        this.lastName=lastName;
    }

    fun getAccount(): BankAccount {
        return account;
    }
    fun addAccount(account: BankAccount) {
        if (numAccounts < MAX_ACCOUNTS) {
            accounts[numAccounts] = account
            numAccounts++
            println("Account ${account.getAccountNumber()} has been added.")
        } else {
            println("Error: Maximum number of accounts reached.")
        }
    }

    fun getNumAccounts(): Int {
        return numAccounts
    }

    fun getAccount(accountNumber: String): BankAccount? {
        for (i in 0 until numAccounts) {
            if (accounts[i]?.getAccountNumber().equals(accountNumber)) {
                return accounts[i]
            }
        }
        return null
    }

    fun setAccount( pAccount : BankAccount)  {
        account = pAccount;
    }

    fun getFirstName(): String {
        return firstName;
    }
    fun getLastName(): String {
        return lastName;
    }
    fun setFirstName(firstName: String) {
        this.firstName = firstName
    }

    fun setLastName(lastName: String) {
        this.lastName = lastName
    }

    override fun toString(): String {
        val result = StringBuffer()
        result.append("$firstName $lastName accounts:\n")
        for (i in 0 until numAccounts) {
            result.append("\t" + accounts[i] + "\n")
        }
        return result.toString()
    }
    fun closeAccount(){
        account=BankAccount("",0.0)
    }

}