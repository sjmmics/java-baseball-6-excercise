package baseball;

import baseball.agent.BaseballPlayer;
import baseball.agent.BaseballReferee;
import baseball.agent.OpponentPlayer;
import baseball.configuration.BaseballConfig;
import baseball.entity.Balls;
import baseball.funtions.BaseballViewer;
import baseball.funtions.InteractController;

public class BaseballPresenter {
    private BaseballPlayer player;
    private BaseballReferee referee;
    private InteractController interactController;
    private OpponentPlayer opponentPlayer;

    public void run() {
        setConfig();
        BaseballViewer.gameStart();
        while (true) {
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
            Balls currentPlayerBalls = player.selectBalls();
            boolean clearGameBool =
                    referee.judgeKindOfBalls(currentPlayerBalls, opponentBalls);
            if (clearGameBool) {
                return;
            }
        }
    }



}
