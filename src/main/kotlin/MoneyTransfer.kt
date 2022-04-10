const val COMMISSION: Double = 0.75
const val COMMISSION_MIN: UInt = 3500U

fun main() {
    print("Введите сумму перевода в рублях: ")
    val amount = readLine()?.toDouble()?.times(100)?.toUInt() ?: return

    var commission: UInt = (amount.toDouble() * COMMISSION / 100).toUInt()
    if (commission < COMMISSION_MIN) commission = COMMISSION_MIN

    println("Ваша комиссия составляет ${commission.toDouble() / 100} рублей")
}