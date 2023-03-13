package model

class Course(private val name : String, private val description : String, private val numHours : Int) {

    fun getName(): String {
        return name
    }
    fun getDescription(): String {
        return description
    }
    fun getNumHours(): Int {
        return numHours
    }

    override fun toString(): String {
        return "Course(name='$name', description='$description', numHours=$numHours)"
    }
}