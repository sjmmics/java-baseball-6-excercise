package baseball.configuration;


import baseball.agent.BaseballPlayer;
import baseball.agent.BaseballReferee;
import baseball.agent.OpponentPlayer;
import baseball.function.InputValidator;
import baseball.function.InteractController;

public class BaseballConfig {

    public BaseballPlayer baseballPlayer() {
        return new BaseballPlayer(inputValidator());
    }

    public InputValidator inputValidator() {
        return new InputValidator();
    }

    public BaseballReferee baseballReferee() {
        return new BaseballReferee();
    }

    public InteractController interactController() {
        return new InteractController(inputValidator());
    }

    public OpponentPlayer opponentPlayer() {
        return new OpponentPlayer();
    }
}
