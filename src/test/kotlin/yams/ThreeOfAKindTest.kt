package yams

import org.junit.Test

class ThreeOfAKindTest {

    @Test
    internal fun should_sum_three_matching_dice() {
        threeOfAKind_for("⚀ ⚁ ⚂ ⚃ ⚄") should_be_valuated 0
        threeOfAKind_for("⚀ ⚄ ⚂ ⚄ ⚄") should_be_valuated 15
        threeOfAKind_for("⚁ ⚄ ⚁ ⚄ ⚄") should_be_valuated 15
    }

    private fun threeOfAKind_for(s: String): Int {
        return roll(s).threeOfAKind()
    }
}
