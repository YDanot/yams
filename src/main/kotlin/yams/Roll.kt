package yams

class Roll(val dices: List<Int>) {

    fun chance(): Int = dices.sum()
    fun ones(): Int = dices.filter { it == 1 }.sum()
    fun twos(): Int = dices.filter { it == 2 }.sum()
    fun threes(): Int = dices.filter { it == 3 }.sum()
    fun fours(): Int = dices.filter { it == 4 }.sum()
    fun fives(): Int = dices.filter { it == 5 }.sum()
}