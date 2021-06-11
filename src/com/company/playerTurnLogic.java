package com.company;

import java.util.Scanner;

public class playerTurnLogic {
    private static final int MAX_NUMBER_PER_TURN = 3;
    private static final int MIN_NUMBER_PER_TURN = 1;

    public static int playerTurnAction(int numberOfSticks) {
        Scanner scan = new Scanner(System.in);
        int removedSticksByPlayer = scan.nextInt();

        while (removedSticksByPlayer > MAX_NUMBER_PER_TURN || removedSticksByPlayer < MIN_NUMBER_PER_TURN) {
            GameConsoleLog.outputWarningAboutInvalidInput();
            removedSticksByPlayer = scan.nextInt();
        }
        return numberOfSticks - removedSticksByPlayer;
    }

}
