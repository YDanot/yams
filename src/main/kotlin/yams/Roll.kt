package yams

class Roll(val dices: List<Int>) {

    fun chance(): Int = dices.sum()
    fun ones(): Int {

        return dices.filter { it == 1 }.sum()
    }
}