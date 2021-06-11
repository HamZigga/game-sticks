package com.company;

import java.util.Scanner;

public class playerTurnLogic {
    final static int MAX_NUMBER_PER_TURN = 3;
    final static int MIN_NUMBER_PER_TURN = 1;

    public static int playerTurnAction(int numberOfSticks) {
        System.out.println("Ход Игрока");
        Scanner scan = new Scanner(System.in);
        int removedSticks = scan.nextInt();
        while (removedSticks > MAX_NUMBER_PER_TURN || removedSticks < MIN_NUMBER_PER_TURN) {
            System.out.println("Введено неверное количество палочек, введите от 1 до 3");
            removedSticks = scan.nextInt();
        }
        return numberOfSticks - removedSticks;
    }


}
