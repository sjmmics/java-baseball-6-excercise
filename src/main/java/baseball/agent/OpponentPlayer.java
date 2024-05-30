package baseball.agent;

import baseball.entity.Balls;
import camp.nextstep.edu.missionutils.Randoms;
import constant.Constant;

import java.util.ArrayList;
import java.util.List;

public class OpponentPlayer {
    
    public Balls decisionBalls() {
        List<Integer> opponentBallsList = new ArrayList<>();
        while (opponentBallsList.size() < Constant.NUMBER_BALL_PLAY) {
            int randomNumber = Randoms.pickNumberInRange(Constant.MIN_BALL_NUMBER,
                                                         Constant.MAX_BALL_NUMBER);
            if (!opponentBallsList.contains(randomNumber)) {
                opponentBallsList.add(randomNumber);
            }
        }
        return new Balls(opponentBallsList);
    }
}
