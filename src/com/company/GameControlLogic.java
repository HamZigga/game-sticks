package com.company;

import java.util.Scanner;

public class GameControlLogic {
    private static boolean isPlayerTurn = false;
    private static final int MAX_NUMBER_OF_STICKS = 20;
    private static int currentNumberOfSticks = MAX_NUMBER_OF_STICKS;

    public static void main(String[] args) {
        gameControl();
        repeatGame();
    }

    private static void gameControl() {
        GameConsoleLog.outputGameBegin();

        while (currentNumberOfSticks > 1) {
            GameConsoleLog.outputGameTurn(isPlayerTurn);
            currentNumberOfSticks = choiceOfParticipant(isPlayerTurn);
            GameConsoleLog.outputCurrentSticks(currentNumberOfSticks);
            isPlayerTurn = changePlayerTurn(isPlayerTurn);
        }

        GameConsoleLog.announcementOfTheWinner(isPlayerTurn);
    }

    private static int choiceOfParticipant(boolean isPlayerTurn) {
        if (isPlayerTurn) {
            return playerTurnLogic.playerTurnAction(currentNumberOfSticks);
        } else {
            return ArtificalIntelegenceLogic.aiTurnAction(currentNumberOfSticks);
        }
    }

    private static boolean changePlayerTurn(boolean isPlayerTurn) {
        return !isPlayerTurn;
    }

    private static void repeatGame() {
        GameConsoleLog.outputRepeatGameLog();
        Scanner scan = new Scanner(System.in);
        String repeatGameAnswer = scan.nextLine().toLowerCase();

        if (repeatGameAnswer.equals("y")) {
            isPlayerTurn = false;
            currentNumberOfSticks = MAX_NUMBER_OF_STICKS;
            gameControl();
            repeatGame();
        }

    }


}
