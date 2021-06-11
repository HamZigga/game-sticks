package com.company;

public class ArtificalIntelegenceLogic {

    public static int aiTurnAction(int currentNumberOfSticks) {
        final int NUMBER_FOR_STAGE = 4;
        int removedSticksAI = (currentNumberOfSticks - 1) % NUMBER_FOR_STAGE;
        GameConsoleLog.outputRemovedSticksByAI(removedSticksAI);
        return currentNumberOfSticks - removedSticksAI;
    }
}
