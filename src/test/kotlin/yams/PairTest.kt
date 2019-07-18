package yams

import org.junit.Test

class PairTest {

    @Test
    internal fun should_sum_two_highest_matching_dices() {
        pair_for("⚀ ⚁ ⚂ ⚃ ⚄") should_be_valuated 0
        pair_for("⚀ ⚁ ⚂ ⚄ ⚄") should_be_valuated 10
        pair_for("⚀ ⚂ ⚂ ⚂ ⚄") should_be_valuated 6
        pair_for("⚀ ⚄ ⚂ ⚂ ⚄") should_be_valuated 10
    }

    private fun pair_for(s: String): Int {
        return roll(s).pair()
    }
}
