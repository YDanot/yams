package yams

import org.junit.Test

class FullHouseTest {

    @Test
    internal fun should_sum_three_matching_dice() {
        fullHouse_for("⚀ ⚁ ⚂ ⚃ ⚄") should_be_valuated 0
        fullHouse_for("⚄ ⚄ ⚄ ⚄ ⚄") should_be_valuated 0
        fullHouse_for("⚂ ⚄ ⚂ ⚄ ⚄") should_be_valuated 21
        fullHouse_for("⚁ ⚄ ⚁ ⚄ ⚄") should_be_valuated 19
    }

    private fun fullHouse_for(s: String): Int {
        return roll(s).fullHouse()
    }
}
