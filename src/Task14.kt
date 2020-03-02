// Задание 14: Инфо сотрудника
// Напишите функцию, которая выводит в консоль информацию сотрудника (ФИО, Возраст, Должность и Семейное положение). С помощью перезагрузки функции, сделайте варианты, когда известны только:
// - ФИО и Должность
// - ФИО, Возраст и Должность
// - ФИО, Семейное положение и Должность
// - ФИО, Возраст, Семейное положение и Должность
var employers: List<Employer> = arrayListOf(
    Employer("Иван","Иванович","Иванов",30,"Плотник по сухожилиям", MartialStatus.Married),
    Employer("Петр","Петрович","Петров",40,"Столяр по части мук", MartialStatus.Single),
    Employer("Полиграф","Полиграфович","Шариков",18,"Принимающий на сердце", MartialStatus.Other),
    Employer("Иван","Иванович","Иванов",25,"Принимающий на грудь", MartialStatus.Single))

fun main(){
    getEmployerInfo("Иванов Иван Иванович", "Плотник по сухожилиям")
    getEmployerInfo("Петров Петр Петрович", 40,"Столяр по части мук")
    getEmployerInfo("Шариков Полиграф Полиграфович", MartialStatus.Other ,"Принимающий на сердце")
    getEmployerInfo("Иванов Иван Иванович", 25, MartialStatus.Single ,"Принимающий на грудь")
}

// - ФИО и Должность
fun getEmployerInfo(fio: String, position: String){
    println(employers.find { employer -> (employer.fio == fio) and (employer.position == position) }!!.info + "\n")
}

// - ФИО, Возраст и Должность
fun getEmployerInfo(fio: String, age: Short, position: String){
    println(employers.find { employer -> (employer.fio == fio) and (employer.age == age) and (employer.position == position) }!!.info + "\n")
}

// - ФИО, Семейное положение и Должность
fun getEmployerInfo(fio: String, martialStatus: MartialStatus, position: String){
    println(employers.find { employer -> (employer.fio == fio) and (employer.martialStatus == martialStatus) and (employer.position == position) }!!.info + "\n")
}

// - ФИО, Возраст, Семейное положение и Должность
fun getEmployerInfo(fio: String, age: Short, martialStatus: MartialStatus, position: String){
    println(employers.find { employer -> (employer.fio == fio) and (employer.age == age) and (employer.martialStatus == martialStatus) and (employer.position == position) }!!.info + "\n")
}

enum class MartialStatus{
    Single,
    Married,
    Other
}

class Employer constructor(firstName: String, middleName: String, lastName: String, age: Short, position: String, martialStatus: MartialStatus){
    var firstName: String = firstName
    var middleName: String = middleName
    var lastName: String = lastName
    var age: Short = age
    var position: String = position
    var martialStatus : MartialStatus = martialStatus

    val fio = "$lastName $firstName $middleName"

    val info : String
        get() = """
            |ФИО - '$fio'
            |Возраст - $age лет
            |Должность - '$position'
            |Семейное положение - '${when(martialStatus){ MartialStatus.Married -> {"Женат/Замужем"} MartialStatus.Single -> {"Не женат/Не замужем"} MartialStatus.Other -> {"Другое"}}}'
        """.trimMargin()
}
