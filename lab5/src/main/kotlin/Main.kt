import model.Course
import model.Student
import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main(args: Array<String>) {
    val courses = readCourses("courses.csv")
    for (course in courses) {
        println(course)
    }
    println()
    val students = readStudents("students.csv")
    students.forEach { println(it) }
}
fun readCourses(filename: String): ArrayList<Course> {
    val courses = ArrayList<Course>()
    val reader = BufferedReader(FileReader(filename))
    var line: String?
    while (reader.readLine().also { line = it } != null) {
        val data = line!!.split(",").toTypedArray()
        val course = Course(data[0], data[1], data[2].trim().toInt())
        courses.add(course)
    }
    reader.close()
    return courses
}
private fun readStudents(filename: String): ArrayList<Student> {
    val students = ArrayList<Student>()
    val reader = File(filename).bufferedReader()

    reader.useLines { lines ->
        lines.forEach { line ->
            val parts = line.split(",")
            if (parts.size == 3) { // Check that the line has the expected number of fields
                val student = Student(parts[0].trim(), parts[1].trim(), parts[2].trim())
                students.add(student)
            } else {
                println("Invalid line: $line")
            }
        }
    }

    return students
}



