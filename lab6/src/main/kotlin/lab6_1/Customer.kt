package lab6_1

class Customer(private var firstName: String, private var lastName: String) {
    private var account: BankAccount = BankAccount()
    private val accounts = ArrayList<BankAccount>()
    private val id: Int

    companion object {
        private var idCounter = 1
    }

    init {
        this.firstName = firstName
        this.lastName = lastName
        this.id = idCounter++
    }

    fun getAccount(): List<BankAccount> {
        return accounts
    }

    fun addAccount(account: BankAccount) {
        accounts.add(account)
    }

    fun getAccount(accountNumber: String): BankAccount? {
        for (account in accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account
            }
        }
        return null
    }

    fun setAccount(pAccount: BankAccount) {
        account = pAccount
    }

    fun getFirstName(): String {
        return firstName
    }

    fun getId(): Int {
        return id
    }

    fun getLastName(): String {
        return lastName
    }

    fun setFirstName(firstName: String) {
        this.firstName = firstName
    }

    fun setLastName(lastName: String) {
        this.lastName = lastName
    }

    fun closeAccount() {
        account = BankAccount()
    }
    fun getAccountNumbers(): List<String> {
        return accounts.map { it.getAccountNumber() }
    }


    override fun toString(): String {
        return "Customer[id=$id, firstName='$firstName', lastName='$lastName', accounts=${accounts.joinToString { it.getAccountNumber() }}]"
    }

}
