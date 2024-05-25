package baseball.agent;

import baseball.entity.Balls;
import baseball.funtions.InputValidator;
import camp.nextstep.edu.missionutils.Console;

public class BaseballPlayer {
    private final InputValidator validator;

    public BaseballPlayer(InputValidator validator) {
        this.validator = validator;
    }

    public Balls selectBalls() {
        String playerBallsString = Console.readLine();
        validator.checkBallsInput(playerBallsString);
        return new Balls(playerBallsString);
    }
}