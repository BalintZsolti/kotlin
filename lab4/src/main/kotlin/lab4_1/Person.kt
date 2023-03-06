package lab4_1

class Person(private var firstName : String,private var lastName : String,private var birthYear : Int) {

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

    fun getBirthYear(): Int {
        return birthYear;
    }

    override fun toString(): String {
        return "Person(firstName='$firstName', lastName='$lastName', birthYear=$birthYear)"
    }

}