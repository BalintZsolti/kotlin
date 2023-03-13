package model

class Training(private var course: Course, private var startDate : MyDate, private var endDate : MyDate, private var pricePerStudent : Double) {
    private val enrolledStudents = ArrayList<Student>()

    fun getCourse() : Course {
        return course
    }

    fun numEnrolled() : Int{
        return enrolledStudents.size
    }

    fun findStudentById(id : String) : Student{

        for (student in enrolledStudents)
        {
            if(student.getID()==id)
            {
                return  student
            }
        }
        println("Nincs tanulo ilyen azonositoval: ${id}")
        return Student("0","","")
    }
}