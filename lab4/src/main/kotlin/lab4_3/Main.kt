package lab4_3

fun main(args: Array<String>) {

    val a1 = MyArray(10)
    a1.print("a1")
    a1.fillRandom(0.0, 9.0)
    a1.print("a1")
    a1.sort()
    a1.print("a1")
    System.out.printf(
        "\tMean: %10.2f Stddev: %10.2f\n",
        a1.mean(), a1.stddev()
    )
}