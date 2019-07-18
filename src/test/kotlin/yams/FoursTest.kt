package yams

import org.junit.Test

class FoursTest {

    @Test
    internal fun fours_should_sum_dice_with_value_4() {
        fours_for("⚀ ⚁ ⚂ ⚃ ⚄") should_be_valuated 4
        fours_for("⚀ ⚁ ⚂ ⚂ ⚄") should_be_valuated 0
        fours_for("⚀ ⚃ ⚃ ⚃ ⚄") should_be_valuated 12
    }

    private fun fours_for(s: String): Int {
        return roll(s).fours()
    }
}
