package yams

import org.junit.Test

class TwosTest {

    @Test
    internal fun ones_should_sum_dices_with_value_1() {
        ones_for("1 2 3 4 5") should_be_valuated 2
        ones_for("1 1 3 4 5") should_be_valuated 0
        ones_for("2 2 2 4 5") should_be_valuated 6
    }

    private fun ones_for(s: String): Int {
        return roll(s).twos()
    }
}
