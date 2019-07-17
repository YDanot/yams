package yams

import org.junit.Test

class ChanceTest {

    @Test
    internal fun chance_should_sum_dices_value() {
        chance_for("1 1 1 1 1") should_be_valuated 5
        chance_for("1 1 1 1 2") should_be_valuated 6
        chance_for("1 1 1 1 3") should_be_valuated 7
    }

    private fun chance_for(s: String): Int {
        return roll(s).chance()
    }
}
