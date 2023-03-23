package lab4_3

import java.util.*


class MyArray(private var length : Int) {
    private var elements: DoubleArray
    init{
        this.length=length
        elements = DoubleArray(length)
    }

    fun fillRandom(min: Double, max: Double) {
        for (i in 0 until length) {
            elements[i] = (Math.random() * (max - min)).toInt() + min
        }
    }

    fun mean(): Double {
        var s = 0.0
        for (i in 0 until length) {
            s += elements[i]
        }
        return s / length
    }

    fun sort() {
        Arrays.sort(elements)
    }

    fun stddev(): Double {
        var standardDeviation = 0.0
        val mean = mean()
        for (num in elements) {
            standardDeviation += Math.pow(num - mean, 2.0)
        }
        return Math.sqrt(standardDeviation / length)
    }

    fun print(s: String) {
        kotlin.io.print("$s:")
        for (d in elements) {
            kotlin.io.print("$d ")
        }
        println("\n")
    }
}
