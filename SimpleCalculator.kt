
import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("Enter two numbers: ")

    val num1 = reader.nextDouble()
    val num2 = reader.nextDouble()

    print("Enter an operator (+, -, *, /): ")
    val operator = reader.next()[0]

    val result: Double = when (operator) {
        '+' -> num1 + num2
        '-' -> num1 - num2
        '*' -> num1 * num2
        '/' -> if (num2 != 0.0) num1 / num2 else IllegalArgumentException("Division by zero").printStackTrace()
        else -> throw IllegalArgumentException("Invalid operator")
    }

    println("$num1 $operator $num2 = $result")
}