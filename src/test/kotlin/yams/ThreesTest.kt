package yams

import org.junit.Test

class ThreesTest {

    @Test
    internal fun threes_should_sum_dices_with_value_3() {
        ones_for("1 2 3 4 5") should_be_valuated 3
        ones_for("1 1 2 4 5") should_be_valuated 0
        ones_for("3 3 3 4 5") should_be_valuated 9
    }

    private fun ones_for(s: String): Int {
        return roll(s).threes()
    }
}
