package com.company;

public class GameControlLogic {
    static boolean isPlayerTurn = false;
    final static int MAX_NUMBER_OF_STICKS = 20;
    static int currentNumberOfSticks = MAX_NUMBER_OF_STICKS;

    public static void main(String[] args) {
        gameControl();
    }

    private static void gameControl() {
        while (currentNumberOfSticks > 1) {
            if (isPlayerTurn) {
                currentNumberOfSticks = playerTurnLogic.playerTurnAction(currentNumberOfSticks);
                System.out.println(currentNumberOfSticks);
            } else {
                currentNumberOfSticks = ArtificalIntelegenceLogic.AI(currentNumberOfSticks);
                System.out.println(currentNumberOfSticks);
            }
            isPlayerTurn = changePlayerTurn(isPlayerTurn);
        }
        announcementOfTheWinner(isPlayerTurn);
    }


    private static boolean changePlayerTurn(boolean isPlayerTurn) {
        return !isPlayerTurn;
    }

    private static void announcementOfTheWinner(boolean isPlayerTurn) {
        if (isPlayerTurn) {
            System.out.println("Победа бота");
        } else {
            System.out.println("Победа игрока");
        }
    }
}
