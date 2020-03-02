// Задание 15: Лямбда
// Создайте переменную, которая содержит лямбда выражение для вывода в консоль данных массива типа String.
fun main(){
    val array = arrayOf("Здесь", "могла", "быть", "ваша", "реклама")
    val printer = {message: Array<String> -> println(message.joinToString(" "))}

    printer(array)
}