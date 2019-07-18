package yams

import org.junit.Test

class PairsTest {

    @Test
    internal fun should_sum_two_highest_matching_dice() {
        pairs_for("⚀ ⚁ ⚂ ⚃ ⚄") should_be_valuated 0
        pairs_for("⚀ ⚄ ⚂ ⚂ ⚄") should_be_valuated 16
        pairs_for("⚀ ⚀ ⚂ ⚂ ⚄") should_be_valuated 8
    }

    private fun pairs_for(s: String): Int {
        return roll(s).pairs()
    }
}
