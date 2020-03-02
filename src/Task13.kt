// Задание 13: Количество сотрудников
// Напишите функцию, принимающую на вход имена сотрудников и возвращающую их количество. Используйте для этого vararg, из предыдущей темы.
fun main(){
    val employerNames = arrayOf("Геркулес", "Эдип", "Герадот", "Гепатит", "Дедал")

    println("Количество сотрудников: ${calculateEmployersCount(*employerNames)}")
}

fun calculateEmployersCount (vararg employerNames: String): Int {
    return employerNames.count()
}