package yams

class Roll(val dices:List<Int>) {

    fun chance() = dices.sum()
}