package yams

import org.junit.Test

class LargeStraightTest {

    @Test
    internal fun fives_should_sum_dice_with_value_6() {
        small_straight_for("⚁ ⚂ ⚃ ⚄ ⚅") should_be_valuated 20
        small_straight_for("⚂ ⚅ ⚃ ⚄ ⚁") should_be_valuated 20
        small_straight_for("⚀ ⚁ ⚂ ⚃ ⚃") should_be_valuated 0
    }

    private fun small_straight_for(s: String): Int {
        return roll(s).largeStraight()
    }
}
