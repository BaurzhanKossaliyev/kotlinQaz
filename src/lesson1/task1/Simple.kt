@file:Suppress("UNUSED_PARAMETER")

package lesson1.task1

import kotlin.math.sqrt



/**
Бүтін санның квадратын табу
 */
fun sqr(number: Int): Long {
    val result = number.toLong() * number
    return result

}

/**
Бүтін емес санның квадратын табу
 */
fun sqr(x: Double): Double {
    return x * x
}

/**
Дискриминант шығару
 */
fun discriminant(a: Double, b: Double, c: Double): Double {
    return sqr(b) - 4 * a * c
}

/**
Квадраттық теңдеудің бір жауабын табу
 */
fun quadraticEquationRoot(a: Double, b: Double, c: Double): Double {
    val discr = discriminant(a, b, c)
    val tubirasty = sqrt(discr)
    return (-1 * b - tubirasty) / 2 * a
}

/**
Квадраттық теңдеудің екі жауабының көбейтіндісін табу
 */
fun quadraticRootProduct(a: Double, b: Double, c: Double): Double {
    TODO()
}

/**
Негізгі функция
 */

fun main() {
    val hours = 8
    val minutes = 20
    val second = 35
    println("Жауабы тең: ${seconds(hours, minutes, second)}")
}


/**
 * Оңай
 *
 * Инпут сағат және минутпен беріледі, мысалы(8:20:35)
 * Қанша секунд екенін шығару(мына мысалда 30035).
 */
fun seconds(hours: Int, minutes: Int, seconds: Int): Int {
    val secondsinhour = hours * 3600
    val secondsinminutes = minutes * 60
    return secondsinhour + secondsinminutes + seconds
}


/**
 * Оңай
 *
 * Инпут бұрыштың градусы бүтін сандармен беріледі (мысалы, 36 градус 14 минут 35 секунд).
 * Радианмен шығарып беру (мысалы, 0.63256).
 */
fun angleInRadian(deg: Int, min: Int, sec: Int): Double {
    TODO()
}

/**
 * Оңай
 *
 * Екі нүктенің координадатасы берілген, ара қашықтығын табыңыз (x1, y1) және (x2, y2).
 * Мысалы, (3, 0) және (0, 4) нүктесінің арасы 5-ке тең
 */
fun trackLength(x1: Double, y1: Double, x2: Double, y2: Double): Double = TODO()

/**
 * Орташа
 *
 * Инпут 100-ден үлкен кез-келген сан (мысалы, 3801).
 * Соңынан санағанда үшінші санды табу (мына мысалда 8).
 */
fun thirdDigit(number: Int): Int {
    TODO()
}

/**
 * Орташа
 *
 * Поезд h1 сағат m1 минутта А қаласынан шықты (мысалы в 9:25) және
 * Б қаласына тура сол күннің h2 сағат m2 минутында келді (мысалы в 13:01).
 * Қанша уақыт жүргенін минуттап есептеңіз (мына мысалда 216).
 */
fun travelMinutes(hoursDepart: Int, minutesDepart: Int, hoursArrive: Int, minutesArrive: Int): Int = TODO()


/**
 * Орташа
 *
 * Инпут үш таңбалы бүтін сан (мысалы, 478).
 * Керісінше етіп қайтару керек (мысалы, 874).
 */
fun numberRevert(number: Int): Int {
    TODO()
}
