package yams

import org.junit.Test

class YamsTest {

    @Test
    internal fun should_count_50_for_all_dice_with_same_value() {
        yams_for("⚀ ⚁ ⚂ ⚃ ⚄") should_be_valuated 0
        yams_for("⚄ ⚄ ⚄ ⚄ ⚄") should_be_valuated 50
    }

    private fun yams_for(s: String): Int {
        return roll(s).yams()
    }
}
