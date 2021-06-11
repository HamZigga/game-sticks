package com.company;

public class GameConsoleLog {
    static String aiTurnLog = "%nХод Бота%n";
    static String playerTurnLog = "%nХод Игрока. Введите количество палочек: ";
    static String gameBeginLog = "Начало игры";
    static String botWinner = "Победа бота!";
    static String playerWinner = "Победа игрока!";
    static String CurrentSticksLog = "На столе %d палочек на данный момент%n";
    static String removedSticksByAILog = "Бот убирает %d палочки%n";
    static String warningAboutInvalidInput = "Введено неверное количество палочек, введите от 1 до 3";
    static String repeatGameLog = "%nХотите повторить игру? Y - Да, любая другая кнопка - Нет%n";

    public static void outputGameTurn(boolean isPlayerTurn) {
        if (isPlayerTurn) {
            System.out.printf(playerTurnLog);
        } else {
            System.out.printf(aiTurnLog);
        }
    }

    public static void outputGameBegin() {
        System.out.println(gameBeginLog);
    }

    public static void outputCurrentSticks(int currentNumberOfSticks) {
        System.out.printf(CurrentSticksLog, currentNumberOfSticks);
    }

    public static void outputRemovedSticksByAI(int removedSticksAI) {
        System.out.printf(removedSticksByAILog, removedSticksAI);
    }

    public static void outputWarningAboutInvalidInput() {
        System.out.println(warningAboutInvalidInput);
    }

    public static void announcementOfTheWinner(boolean isPlayerTurn) {
        if (isPlayerTurn) {
            System.out.println(botWinner);
        } else {
            System.out.println(playerWinner);
        }
    }

    public static void outputRepeatGameLog() {
        System.out.printf(repeatGameLog);
    }


}
