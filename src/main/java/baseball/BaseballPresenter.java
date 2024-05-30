package baseball;

import baseball.agent.BaseballPlayer;
import baseball.agent.BaseballReferee;
import baseball.agent.OpponentPlayer;
import baseball.configuration.BaseballConfig;
import baseball.entity.Balls;
import baseball.entity.Hints;
import baseball.function.Viewer;
import baseball.function.InteractController;

public class BaseballPresenter {
    private BaseballPlayer player;
    private BaseballReferee referee;
    private InteractController interactController;
    private OpponentPlayer opponentPlayer;

    public void run() {
        setConfig();

        while (true) {
            Viewer.gameStart();
            playBaseball();
            if (!interactController.keepPlayBaseball()) {
                return;
            }
        }
    }

    private void setConfig() {
        BaseballConfig config = new BaseballConfig();
        player = config.baseballPlayer();
        referee = config.baseballReferee();
        interactController = config.interactController();
        opponentPlayer = config.opponentPlayer();
    }

    public void playBaseball() {
        Balls opponentBalls = opponentPlayer.decisionBalls();
        while (true) {
            Viewer.enterUserGuess();
            Balls currentPlayerBalls = player.selectBalls();
            Hints hints = referee.judgeBallsMakeHints(currentPlayerBalls, opponentBalls);
            Viewer.showHints(hints);
            if (referee.judgeClearGame(hints)) {
                Viewer.clearMessage();
                return;
            }
        }
    }



}
