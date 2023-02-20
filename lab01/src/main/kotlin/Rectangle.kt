class Rectangle(length: Double , width :Double) {

    private var length: Double = length
    private var width: Double = width

    fun area(): Double {
        return length * width
    }

    fun perimeter() : Double{
        return 2*length + 2* width
    }

    fun getLength() : Double
    {
        return length
    }

    fun getWidth() : Double {
        return width
    }


}