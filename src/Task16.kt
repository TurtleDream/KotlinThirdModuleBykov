// Задание 16: Корень числа
// Напишите функцию для переменных типа Double, возвращающую корень числа
fun main(){
    println(6.25.sqrt())
}

fun Double.sqrt() : Double {
    return kotlin.math.sqrt(this)
}