package lab6_2

class Matrix {
    private var data: Array<DoubleArray>
    var rows: Int
        private set
    var columns: Int
        private set

    constructor(rowNr: Int, columnNr: Int) {
        rows = rowNr
        columns = columnNr
        data = Array(rowNr) { DoubleArray(columnNr) }
    }

    constructor(m2: Array<DoubleArray>) {
        data = Array(m2.size) { DoubleArray(m2[0].size) }
        rows = m2.size
        columns = m2[0].size
        for (i in m2.indices) {
            for (j in m2[0].indices) {
                data[i][j] = m2[i][j]
            }
        }
    }

    constructor(m: Matrix) {
        rows = m.rows
        columns = m.columns
        data = Array(m.rows) { DoubleArray(m.columns) }
        for (i in 0 until m.rows) {
            for (j in 0 until columns) {
                data[i][j] = m.data[i][j]
            }
        }
    }

    fun printMatrix() {
        for (i in 0 until rows) {
            for (j in 0 until columns) {
                print(data[i][j].toString() + " ")
            }
            print("\n")
        }
    }

    fun fillRandom(min: Double, max: Double) {
        for (i in 0 until rows) {
            for (j in 0 until columns) {
                data[i][j] = Math.random() * (max - min) + min
            }
        }
    }

    companion object {

        fun add(m1: Matrix, m2: Matrix): Matrix {
            if (m1.rows != m2.rows || m1.columns != m2.columns) {
                println("NOT EQUAL SIZED MATRIXES!\n")
            }
            val res = Matrix(m1.rows, m1.columns)
            for (i in 0 until res.rows) {
                for (j in 0 until res.columns) {
                    res.data[i][j] = m1.data[i][j] + m2.data[i][j]
                }
            }
            return res
        }

        fun transpose(m: Matrix): Matrix {
            val res = Matrix(m.columns, m.rows)
            run {
                for (j in 0 until m.columns) {
                    for (i in 0 until m.rows) {
                        res.data[j][i] = m.data[i][j]
                    }
                }
            }
            return res
        }

        fun multiply(m1: Matrix, m2: Matrix): Matrix {
            if (m1.columns != m2.rows) {
                println("Not adequate matrix sizes!\n")
            }
            val res = Matrix(m1.rows, m2.columns)
            for (i in m1.data.indices) {
                for (j in m2.data[0].indices) {
                    for (k in m1.data[0].indices) {
                        res.data[i][j] += m1.data[i][k] * m2.data[k][j]
                    }
                }
            }
            return res
        }
    }
}
