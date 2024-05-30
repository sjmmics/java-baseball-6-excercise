package baseball.agent;

import baseball.entity.Balls;
import baseball.function.InputValidator;
import camp.nextstep.edu.missionutils.Console;

public class BaseballPlayer {
    private final InputValidator validator;

    public BaseballPlayer(InputValidator validator) {
        this.validator = validator;
    }

    public Balls selectBalls() {
        String playerBallsString = Console.readLine();
        validator.validateBallsInput(playerBallsString);
        return new Balls(playerBallsString);
    }
}