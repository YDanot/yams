package yams

class Roll(private val dice: List<Die>) {

    fun chance(): Int = dice.sum()
    fun ones(): Int = dice.sum(Die.ONE)
    fun twos(): Int = dice.sum(Die.TWO)
    fun threes(): Int = dice.sum(Die.THREE)
    fun fours(): Int = dice.sum(Die.FOUR)
    fun fives(): Int = dice.sum(Die.FIVE)
    fun sixes(): Int = dice.sum(Die.SIX)
    fun pair(): Int = dice.highestPairValue()?.times(2) ?: 0
    fun pairs(): Int = if (dice.numberOfPairs() == 2) dice.pairs().sum().times(2) else 0
    fun threeOfAKind(): Int = dice.withOccurrence(3)?.value?.times(3) ?: 0
    fun fourOfAKind(): Int = dice.withOccurrence(4)?.value?.times(4) ?: 0
    fun yams(): Int = if (dice.withOccurrence(5).exist()) 50 else 0
    fun smallStraight(): Int = if (dice.sorted().equals(listOf(Die.ONE, Die.TWO, Die.THREE, Die.FOUR, Die.FIVE))) 15 else 0
    fun largeStraight(): Int = if (dice.sorted().equals(listOf(Die.TWO, Die.THREE, Die.FOUR, Die.FIVE, Die.SIX))) 20 else 0
}

private fun List<Die>.sum(): Int {
    return this.map { it.value }.sum()
}

private fun List<Die>.sum(dice: Die): Int {
    return this.filter { it == dice }.sum()
}

private fun List<Die>.highestPairValue(): Int? {
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

private fun List<Die>.withOccurrence(occ: Int): Die? =
    this.groupingBy { it.value }.eachCount().filter { it.value >= occ }.keys.map { Die.fromValue(it) }.firstOrNull()

private fun Die?.exist(): Boolean {
    return this != null
}
