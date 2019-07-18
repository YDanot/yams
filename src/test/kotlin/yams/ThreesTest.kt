package yams

import org.junit.Test

class ThreesTest {

    @Test
    internal fun threes_should_sum_dice_with_value_3() {
        threes_for("⚀ ⚁ ⚂ ⚃ ⚄") should_be_valuated 3
        threes_for("⚀ ⚁ ⚁ ⚃ ⚄") should_be_valuated 0
        threes_for("⚂ ⚂ ⚂ ⚃ ⚄") should_be_valuated 9
    }

    private fun threes_for(s: String): Int {
        return roll(s).threes()
    }
}
