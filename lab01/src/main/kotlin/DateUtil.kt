class DateUtil {
    companion object {
        fun leapYear(year: Int): Boolean {
            return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)
        }

        fun isValidDate(year: Int, month: Int, day: Int): Boolean {
            if (month < 1 || month > 12) {
                return false
            }
            val lastDayOfMonth = when (month) {
                2 -> if (leapYear(year)) 29 else 28  //February
                4, 6, 9, 11 -> 30
                else -> 31
            }
            return (day in 1..lastDayOfMonth)
        }
    }
}
