// Задание 12: Високосный год
// Напишите функцию, которая получает в параметры какой-либо год, проверяет високосный ли это год и возвращает результат проверки.
fun main(){
    println("Введите год:")

    val year = readLine().toString().toInt()

    println("$year год ${if(!leapYearCheck(year)) "не " else "" }високосный.")
}

fun leapYearCheck (year: Int): Boolean {
    // год, номер которого кратен 400, — високосный;
    // остальные годы, номер которых кратен 100, — невисокосные;
    // остальные годы, номер которых кратен 4, — високосные.
    return ((year % 400) == 0) or (((year % 4) == 0) and ((year % 100) != 0))
}