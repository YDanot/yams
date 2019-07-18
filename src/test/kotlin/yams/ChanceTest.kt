package yams

import org.junit.Test

class ChanceTest {

    @Test
    internal fun chance_should_sum_dice_value() {
        chance_for("⚀ ⚀ ⚀ ⚀ ⚀") should_be_valuated 5
        chance_for("⚀ ⚀ ⚀ ⚀ ⚃") should_be_valuated 8
        chance_for("⚀ ⚀ ⚀ ⚀ ⚄") should_be_valuated 9
    }

    private fun chance_for(s: String): Int {
        return roll(s).chance()
    }
}
