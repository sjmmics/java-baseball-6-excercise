package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class BaseballReferee {

    public Balls makeComponentBalls() {
        List<Integer> randomNumbers = Randoms.pickUniqueNumbersInRange(1, 9, 3);
        return new Balls(randomNumbers);
    }
}
