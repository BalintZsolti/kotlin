package lab3_1

class Customer(firstName : String , lastName : String ) {
    private var firstName : String
    private var lastName : String
    private var account : BankAccount = BankAccount("",0.0);

    init{
        this.firstName=firstName;
        this.lastName=lastName;
    }

    fun getAccount(): BankAccount {
        return account;
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
        return "Customer(firstName='$firstName', lastName='$lastName', account=$account)"
    }
    fun closeAccount(){
        account=BankAccount("",0.0)
    }

}