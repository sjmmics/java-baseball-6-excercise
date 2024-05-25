package baseball.agent;

import baseball.funtions.BaseballViewer;
import baseball.funtions.Validator;
import baseball.entity.Balls;
import camp.nextstep.edu.missionutils.Console;

public class BaseballPlayer {
    private final Validator validator;

    public BaseballPlayer(Validator validator) {
        this.validator = validator;
    }

    public Balls selectBalls() {
        BaseballViewer.enterUserGuess();
        String playerBallsString = Console.readLine();
        validator.checkBallsInput(playerBallsString);
        return new Balls(playerBallsString);
    }
}