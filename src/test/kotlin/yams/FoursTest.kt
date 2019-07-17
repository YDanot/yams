package yams

import org.junit.Test

class FoursTest {

    @Test
    internal fun fours_should_sum_dices_with_value_4() {
        fours_for("1 2 3 4 5") should_be_valuated 4
        fours_for("1 1 2 3 5") should_be_valuated 0
        fours_for("3 4 4 4 5") should_be_valuated 12
    }

    private fun fours_for(s: String): Int {
        return roll(s).fours()
    }
}
