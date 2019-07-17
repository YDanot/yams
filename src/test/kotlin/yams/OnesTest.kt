package yams

import org.junit.Test

class OnesTest {

    @Test
    internal fun ones_should_sum_dices_with_value_1() {
        ones_for("⚀ ⚁ ⚂ ⚃ ⚄") should_be_valuated 1
        ones_for("⚀ ⚀ ⚂ ⚃ ⚄") should_be_valuated 2
        ones_for("⚀ ⚀ ⚀ ⚃ ⚄") should_be_valuated 3
    }

    private fun ones_for(s: String): Int {
        return roll(s).ones()
    }
}
