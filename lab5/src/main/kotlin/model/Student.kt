package model

class Student(private val ID : String , private val firstName : String , private val lastName : String) {

    fun getFirstName(): String {
        return firstName
    }

    fun getLastName(): String {
        return lastName
    }
    fun getID(): String {
        return ID
    }

    override fun toString(): String {
        return "Student(ID='$ID', firstName='$firstName', lastName='$lastName')"
    }


}