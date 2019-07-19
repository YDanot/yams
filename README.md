## Yahtzee

This problem is based on Ruby Quiz #19 ( http://rubyquiz.com/quiz19.html ). The kata takes about 20 minutes with practice and 2 hours in a dojo setting.

### Problem Description

The game of yahtzee is a simple dice game. Each round, each player rolls five six sided dice. The player may choose to reroll some or all of the dice up to three times (including the original roll). The player then places the roll at a category, such as ones, twos, sixes, pair, two pairs etc. If the roll is compatible with the score, the player gets a score for this roll according to the rules. If the roll is not compatible, the player gets a score of zero for this roll.

The kata consists of creating the rules to score a roll in any of a predefined category. Given a roll and a category, the final solution should output the score for this roll placed in this category.

Yahtzee rules description and suggested test cases

#### The following categories exists:

* __Ones, Twos, Threes, Fours, Fives, Sixes__: The player scores the sum of the dice that reads one, two, three, four, five or six, respectively. For example, 1, 1, 2, 4, 4 placed on “fours” gives 8 points.
* __Pair__: The player scores the sum of the two highest matching dice. For example, 3, 3, 3, 4, 4 placed on “pair” gives 8.
* __Two pairs__: If there are two pairs of dice with the same number, the player scores the sum of these dice. If not, the player scores 0. For example, 1, 1, 2, 3, 3 placed on “two pairs” gives 8.
* __Three of a kind__: If there are three dice with the same number, the player scores the sum of these dice. Otherwise, the player scores 0. For example, 3, 3, 3, 4, 5 places on “three of a kind” gives 9.
* __Four of a kind__: If there are four dice with the same number, the player scores the sum of these dice. Otherwise, the player scores 0. For example, 2, 2, 2, 2, 5 places on “four of a kind” gives 8.
* __Small straight__: If the dice read 1,2,3,4,5, the player scores 15 (the sum of all the dice), otherwise 0.
* __Large straight__: If the dice read 2,3,4,5,6, the player scores 20 (the sum of all the dice), otherwise 0.
* __Full house__: If the dice are two of a kind and three of a kind, the player scores the sum of all the dice. For example, 1,1,2,2,2 placed on “full house” gives 8. 4,4,4,4,4 is not “full house”.
* __Yahtzee__: If all dice are the have the same number, the player scores 50 points, otherwise 0.
* __Chance__: The player gets the sum of all dice, no matter what they read.

The practitioner can feel free to create new categories as well.
