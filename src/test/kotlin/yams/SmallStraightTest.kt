package yams

import org.junit.Test

class SmallStraightTest {

    @Test
    internal fun fives_should_sum_dice_with_value_6() {
        small_straight_for("⚀ ⚁ ⚂ ⚃ ⚄") should_be_valuated 15
        small_straight_for("⚀ ⚁ ⚄ ⚂ ⚃") should_be_valuated 15
        small_straight_for("⚀ ⚁ ⚂ ⚃ ⚃") should_be_valuated 0
    }

    private fun small_straight_for(s: String): Int {
        return roll(s).smallStraight()
    }
}
