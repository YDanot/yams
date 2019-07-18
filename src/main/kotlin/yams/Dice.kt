package yams

enum class Dice(val symbol: String, val value: Int) {
    ONE("⚀", 1),
    TWO("⚁", 2),
    THREE("⚂", 3),
    FOUR("⚃", 4),
    FIVE("⚄", 5),
    SIX("⚅", 6);


    companion object {
        fun fromValue(value: Int): Dice {
            return values().first { it.value == value }
        }
    }
}