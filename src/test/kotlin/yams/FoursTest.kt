package yams

import org.junit.Test

class FoursTest {

    @Test
    internal fun fours_should_sum_dices_with_value_4() {
        ones_for("1 2 3 4 5") should_be_valuated 4
        ones_for("1 1 2 3 5") should_be_valuated 0
        ones_for("3 4 4 4 5") should_be_valuated 12
    }

    private fun ones_for(s: String): Int {
        return roll(s).fours()
    }
}
