package yams

class Roll(private val dices: List<Dice>) {

    fun chance(): Int = dices.sum()
    fun ones(): Int = dices.sum(Dice.ONE)
    fun twos(): Int = dices.sum(Dice.TWO)
    fun threes(): Int = dices.sum(Dice.THREE)
    fun fours(): Int = dices.sum(Dice.FOUR)
    fun fives(): Int = dices.sum(Dice.FIVE)
    fun sixes(): Int = dices.sum(Dice.SIX)
    fun pair(): Int = dices.maxPairValue()?.times(2) ?: 0

}

private fun List<Dice>.sum(): Int {
    return this.map { it.value }.sum()
}

private fun List<Dice>.sum(dice: Dice): Int {
    return this.filter { it == dice }.sum()
}

private fun List<Dice>.maxPairValue(): Int? {
    return this.pairs().maxValue()
}

private fun List<Dice>.maxValue(): Int? {
    return this.map { it.value }.max()
}

private fun List<Dice>.pairs(): List<Dice> {
    return this.groupingBy { it.value }.eachCount().filter { it.value >= 2 }.keys.map { Dice.fromValue(it) }
}
