package lab4_1

import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val fileName = "lab4_1_input.txt"
    val file = File(fileName)

    var lineNumber = 1
    file.forEachLine {
        println("$lineNumber $it")
        lineNumber++
    }
    //readFilePrintItsLineNumbered(fileName)

    val persons = readFromCSVFile("lab4_1_input.csv")
    for (person in persons) {
        println("${person.getFirstName()} ${person.getLastName()} (${person.getBirthYear()})")
    }
}

fun readFilePrintItsLineNumbered(fileName: String) {
    try {
        val scanner = Scanner(File(fileName))
        var lineNumber = 1
        while (scanner.hasNextLine()) {
            val line = scanner.nextLine()
            println("$lineNumber $line")
            lineNumber++
        }
        scanner.close()
    } catch (e: FileNotFoundException) {
        e.printStackTrace()
    }
}

fun readFromCSVFile(fileName: String): ArrayList<Person> {
    val persons = ArrayList<Person>()
    var reader: BufferedReader? = null
    try {
        reader = BufferedReader(FileReader(File(fileName)))
        var line: String? = reader.readLine()
        while (line != null) {
            if (line.isNotEmpty()) {
                val items = line.split(",")
                val firstName = items[0].trim()
                val lastName = items[1].trim()
                val birthYear = items[2].trim().toInt()
                persons.add(Person(firstName, lastName, birthYear))
            }
            line = reader.readLine()
        }
    } catch (e: IOException) {
        e.printStackTrace()
    } finally {
        reader?.close()
    }
    return persons
}



