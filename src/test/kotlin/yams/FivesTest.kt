package yams

import org.junit.Test

class FivesTest {

    @Test
    internal fun fives_should_sum_dices_with_value_5() {
        fives_for("⚀ ⚁ ⚂ ⚃ ⚄") should_be_valuated 5
        fives_for("⚀ ⚁ ⚂ ⚃ ⚃") should_be_valuated 0
        fives_for("⚀ ⚁ ⚄ ⚄ ⚄") should_be_valuated 15
    }

    private fun fives_for(s: String): Int {
        return roll(s).fives()
    }
}
