package yams

class Roll(private val dice: List<Die>) {

    fun chance(): Int = dice.sum()
    fun ones(): Int = dice.sum(Die.ONE)
    fun twos(): Int = dice.sum(Die.TWO)
    fun threes(): Int = dice.sum(Die.THREE)
    fun fours(): Int = dice.sum(Die.FOUR)
    fun fives(): Int = dice.sum(Die.FIVE)
    fun sixes(): Int = dice.sum(Die.SIX)
    fun pair(): Int = dice.maxPairValue()?.times(2) ?: 0
    fun pairs(): Int = if (dice.numberOfPairs() == 2) dice.pairs().sum().times(2) else 0
    fun threeOfAKind(): Int = dice.threeOfAKind()?.value?.times(3) ?: 0
    fun fourOfAKind(): Int = dice.fourOfAKind()?.value?.times(4) ?: 0

}

private fun List<Die>.sum(): Int {
    return this.map { it.value }.sum()
}

private fun List<Die>.sum(dice: Die): Int {
    return this.filter { it == dice }.sum()
}

private fun List<Die>.maxPairValue(): Int? {
    return this.pairs().maxValue()
}

private fun List<Die>.maxValue(): Int? {
    return this.map { it.value }.max()
}

private fun List<Die>.numberOfPairs(): Int {
    return this.pairs().size
}

private fun List<Die>.pairs(): List<Die> {
    return this.groupingBy { it.value }.eachCount().filter { it.value >= 2 }.keys.map { Die.fromValue(it) }
}

private fun List<Die>.threeOfAKind(): Die? {
    return this.groupingBy { it.value }.eachCount().filter { it.value >= 3 }.keys.map { Die.fromValue(it) }.firstOrNull()
}

private fun List<Die>.fourOfAKind(): Die? {
    return this.groupingBy { it.value }.eachCount().filter { it.value >= 4 }.keys.map { Die.fromValue(it) }.firstOrNull()
}
