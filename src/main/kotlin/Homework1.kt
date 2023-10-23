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
        val result = if (z % 1.0 == 0.0) z.toInt() else z
        println("x და y ჯამი არის $result.")

        while (true) {
            println("გსურთ პროგრამის ხელახლა დაწყება - დიახ/არა?")
            answer = readln()

            if (answer == "დიახ" || answer == "არა") break
            else print("გთხოვთ შეიყვანოთ \"დიახ\" ან \"არა\". ")
        }

        if (answer == "არა") {
            println("დასასრული")
            isProgramRunning = false
        } else println()
    }
}

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