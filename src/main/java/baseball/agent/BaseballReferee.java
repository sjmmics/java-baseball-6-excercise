package baseball.agent;

import baseball.entity.Balls;
import baseball.entity.Hints;
import constant.Constant;

public class BaseballReferee {

    public Hints judgeBallsMakeHints(Balls playerBalls, Balls opponentBalls) {
        int strikeCount = 0;
        int ballCount = 0;
        for (int i = 0; i < Constant.NUMBER_BALL_PLAY; i++) {
            if (opponentBalls.getBallByIndex(i).equals(playerBalls.getBallByIndex(i))) {
                strikeCount++;
            }
            if (!(opponentBalls.getBallByIndex(i).equals(playerBalls.getBallByIndex(i))) &&
                    opponentBalls.contains(playerBalls.getBallByIndex(i))) {
                ballCount++;
            }
        }
        return new Hints(strikeCount, ballCount);
    }

    public boolean judgeClearGame(Hints hints) {
        return hints.isClearGame();
    }
}
