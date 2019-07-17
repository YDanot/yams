package yams

import org.assertj.core.api.Assertions

fun roll(s: String) = Roll(s.split(" ").map { Integer.valueOf(it) })

infix fun Int.should_be_valuated(i: Int) {
    Assertions.assertThat(this).isEqualTo(i)
}
