package yams

import org.assertj.core.api.Assertions

fun roll(s: String) = Roll(s.split(" ").map { dice(it).value })

fun dice(symbol: String): Dice {
    return Dice.values().find { symbol.equals(it.symbol) }!!
}

infix fun Int.should_be_valuated(i: Int) {
    Assertions.assertThat(this).isEqualTo(i)
}
