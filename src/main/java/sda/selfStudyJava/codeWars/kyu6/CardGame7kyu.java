package sda.selfStudyJava.codeWars.kyu6;

import java.lang.reflect.Array;
import java.util.Arrays;
public class CardGame7kyu {
        public static void main(String[] args) {


            //It must be random cards:
            int[] frank = new int[]{3, 1, 0, 11};
            int[] tom = new int[]{10, 4, 8, 2};
            int[] sam = new int[]{5, 9, 6, 7};

            byte opportunityFrankWinRound = 0;
            boolean frankWinGame = false;

    /*With the condition that opponents can make DUMB moves,
    it is enough to check if Frank has two cards that have the most points
    than the two smallest pairs of his opponents.*/


            // Sorting arrays:
            Arrays.sort(frank);
            Arrays.sort(tom);
            Arrays.sort(sam);

            // Verification:
            for (int i = 0; i < 4; i++) {
                if (opportunityFrankWinRound > 0 && frank[i] > tom[1] && frank[i] > sam[1]) {
                    frankWinGame = true; //There is the second card matches conditions -> WIN
                }
                if (frank[i] > tom[0] && frank[i] > sam[0]) {
                    opportunityFrankWinRound++; //There is one card matches conditions
                }
            }

            System.out.println("(Frank) Is there opportunity to win: " + frankWinGame);


        }

    }



        /*Twelve cards with grades from 0 to 11 randomly divided among 3 players: Frank, Sam, and Tom, 4 cards each. The game consists of 4 rounds. The goal of the round is to move by the card with the most points.
In round 1, the first player who has a card with 0 points, takes the first turn, and he starts with that card. Then the second player (queue - Frank -> Sam -> Tom -> Frank, etc.) can move with any of his cards (each card is used only once per game, and there are no rules that require players to make only the best moves). The third player makes his move after the second player, and he sees the previous moves.
The winner of the previous round then makes the first move in the next round with any remaining card.
The player who wins 2 rounds first, wins the game.

Task
Return true if Frank has a chance of winning the game.
Return false if Frank has no chance.

Input
3 arrays of 4 unique numbers in each (numbers in array are sorted in ascending order). Input is always valid, no need to check.

Example
Round 1: Frank 2 5 8 11, Sam 1 4 7 10, Tom 0 3 6 9. Tom has to start from 0. Frank is risking nothing and goes 2. Sam gets lucky and wins round by throwing 4.

Round 2: Frank 5 8 11, Sam 1 7 10, Tom 3 6 9. Sam starts from 1. Tom goes 3, Frank wins with 5.

Round 3: Frank 8 11, Sam 7 10, Tom 6 9. Frank starts from 11 and wins the round either way.

Frank is the first to win 2 rounds and therefore wins the game, the answer is true.

One more example
Frank 0 1 2 3, Sam 6 7 8 11, Tom 4 5 9 10.
With these cards Frank has no chance, the answer is false.

Tip
Players can actually play DUMB moves, especially Sam and Tom.*/

