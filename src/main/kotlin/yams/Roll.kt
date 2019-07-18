package yams

class Roll(private val dices: List<Dice>) {

    fun chance()    : Int = dices.sum()
    fun ones()      : Int = dices.sum(Dice.ONE)
    fun twos()      : Int = dices.sum(Dice.TWO)
    fun threes()    : Int = dices.sum(Dice.THREE)
    fun fours()     : Int = dices.sum(Dice.FOUR)
    fun fives()     : Int = dices.sum(Dice.FIVE)
    fun sixes()     : Int = dices.sum(Dice.SIX)

    fun pair(): Int {
        var save = 0

        dices.sorted().reversed().forEach({
            if (it.value == save) {
                return save * 2
            }
            save = it.value
        })

        return 0
    }
}

private fun List<Dice>.sum(): Int {
    return this.map { it.value }.sum()
}

private fun List<Dice>.sum(dice: Dice): Int {
    return this.filter { it == dice }.sum()
}
