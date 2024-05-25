package baseball.agent;

import baseball.entity.Balls;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class OpponentPlayer {
    
    public Balls decisionBalls() {
        List<Integer> opponentBallsList = new ArrayList<>();
        while (opponentBallsList.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!opponentBallsList.contains(randomNumber)) {
                opponentBallsList.add(randomNumber);
            }
        }
        return new Balls(opponentBallsList);
    }
}
