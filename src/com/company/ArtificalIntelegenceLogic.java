package com.company;

public class ArtificalIntelegenceLogic {

    public static int AI(int numberOfSticks){
        int removedSticksAI = (numberOfSticks-1) % 4;
        System.out.println("Ход Бота");
        switch (removedSticksAI){
            case (1):
                System.out.println("Бот убирает 1");
                return numberOfSticks - 1;
            case (2):
                System.out.println("Бот убирает 2");
                return numberOfSticks - 2;
            case (3):
                System.out.println("Бот убирает 3");
                return numberOfSticks - 3;
        }
        return numberOfSticks;
    }
}
