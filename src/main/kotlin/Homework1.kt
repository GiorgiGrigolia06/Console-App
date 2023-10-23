import java.lang.NumberFormatException

fun main() {
    var isProgramRunning = true
    var answer: String

    while (isProgramRunning) {
        println("დაწყება")

        print("შეიყვანეთ x ცვლადის მნიშვნელობა: ")
        val x = getValidInput()

        print("შეიყვანეთ y ცვლადის მნიშვნელობა: ")
        val y = getValidInput()

        val z = x + y
        // Here, if the result is a whole number, the program will convert it to an Int, so the unnecessary ".0" will be removed.
        val result = if (z % 1.0 == 0.0) z.toInt() else z
        println("x და y ჯამი არის $result.")

        // This loop will work until the user either inputs "დიახ" or "არა".
        while (true) {
            println("გსურთ პროგრამის ხელახლა დაწყება - დიახ/არა?")
            answer = readln().trim()

            if (answer == "დიახ" || answer == "არა") break
            else print("გთხოვთ შეიყვანოთ \"დიახ\" ან \"არა\". ")
        }

        if (answer == "არა") {
            println("დასასრული")
            isProgramRunning = false
        } else println()
    }
}

/*
 * The function below ensures that the program will proceed only when a user input is a valid number.
 * If number is not provided, it will continue to prompt for one.
 */
private fun getValidInput(): Double {
    var output: Double

    while (true) {
        try {
            output = readln().toDouble()
            break
        } catch (e: NumberFormatException) {
            print("ცვლადის მნიშვნელობა უნდა იყოს რიცხვი. გთხოვთ შეიყვანოთ თავიდან: ")
        }
    }

    return output
}