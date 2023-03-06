package lab4_2


class Customer(private var firstName : String ,private var lastName : String ) {
    private var account : BankAccount = BankAccount("",0.0);
    private val accounts = ArrayList<BankAccount>()


    init{
        this.firstName=firstName;
        this.lastName=lastName;
    }

    fun getAccount(): List<BankAccount> {
        return accounts;
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


    fun closeAccount(){
        account=BankAccount("",0.0)
    }

    override fun toString(): String {
        return "Customer(firstName='$firstName', lastName='$lastName', account=$account)"
    }

}