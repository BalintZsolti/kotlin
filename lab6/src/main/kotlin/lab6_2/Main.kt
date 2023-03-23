package lab6_2

fun main(args: Array<String>) {

    val d = arrayOf(doubleArrayOf(1.0, 2.0, 3.0), doubleArrayOf(4.0, 5.0, 6.0), doubleArrayOf(9.0, 1.0, 3.0))
    val m0 = Matrix(d)
    println("m0 rows: " + m0.rows + ", cols: " + m0.columns)
    println("m0: ")
    m0.printMatrix()
    println()
    val m00 = Matrix(m0)
    println("m00 is a copy of m0: ")
    m00.printMatrix()
    println("************************")
    val m1 = Matrix(2, 3)
    m1.fillRandom(1.0, 2.0)
    println("m1: ")
    m1.printMatrix()
    println()
    val m2 = Matrix(2, 3)
    m2.fillRandom(1.0, 2.0)
    println("m2: ")
    m2.printMatrix()
    println("Sum: m1 + m2")

    val m3 = Matrix(3, 4)
    m3.fillRandom(0.0, 1.0)
    println("m3: ")
    m3.printMatrix()
    println("Product: m1 * m3")


    println("Transpose(m3)")
    Matrix.transpose(m3).printMatrix()
}