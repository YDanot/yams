package yams

import org.junit.Test

class SixesTest {

    @Test
    internal fun fives_should_sum_dices_with_value_6() {
        fives_for("1 2 3 4 6") should_be_valuated 6
        fives_for("1 1 2 3 4") should_be_valuated 0
        fives_for("3 4 6 6 6") should_be_valuated 18
    }

    private fun fives_for(s: String): Int {
        return roll(s).sixes()
    }
}
