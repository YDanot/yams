package yams

import org.junit.Test

class FourOfAKindTest {

    @Test
    internal fun should_sum_two_highest_matching_dice() {
        fourOfAKind_for("⚀ ⚁ ⚂ ⚃ ⚄") should_be_valuated 0
        fourOfAKind_for("⚀ ⚄ ⚄ ⚄ ⚄") should_be_valuated 20
        fourOfAKind_for("⚄ ⚄ ⚄ ⚄ ⚄") should_be_valuated 20
    }

    private fun fourOfAKind_for(s: String): Int {
        return roll(s).fourOfAKind()
    }
}
