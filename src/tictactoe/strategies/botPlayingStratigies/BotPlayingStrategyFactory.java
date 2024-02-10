package tictactoe.strategies.botPlayingStratigies;

import tictactoe.models.BotDifficultyLevel;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getBotPlayingStrategyforDifficultyLevel(BotDifficultyLevel botDifficultyLevel){
        return new EasyBotPlayingStrategy();
//        if(botDifficultyLevel.equals(BotDifficultyLevel.EASY)) {
//            return new EasyBotPlayingStrategy();
//        }
//        else if(botDifficultyLevel.equals(BotDifficultyLevel.MEDIUM)){
//            return new MediumBotPlayingStrategy();
//        }
//        return new HardBotPlayingStrategy();
    }
}
