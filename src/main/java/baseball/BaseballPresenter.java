package baseball;

import baseball.agent.BaseballPlayer;
import baseball.agent.BaseballReferee;
import baseball.entity.Balls;
import baseball.funtions.BaseballViewer;
import baseball.funtions.Validator;
import camp.nextstep.edu.missionutils.Console;

public class BaseballPresenter {
    public void run() {

        BaseballViewer.gameStart();
        while (true) {
            playBaseball();
            if (!keepPlayBaseball()) {
                return;
            }
        }
    }

    public void playBaseball() {
        BaseballReferee referee = new BaseballReferee();
        Balls componetBalls = Balls.makeComponentBalls();
        BaseballPlayer player = new BaseballPlayer(new Validator());
        while (true) {
            Balls currentPlayerBalls = player.selectBalls();
            boolean clearGameBool =
                    referee.judgeKindOfBalls(currentPlayerBalls, componetBalls);
            if (clearGameBool) {
                return;
            }
        }
    }

    public boolean keepPlayBaseball() {
        BaseballViewer.continueGame();
        String keepPlayInput = Console.readLine();
        Validator validator = new Validator();
        validator.checkKeepPlayInput(keepPlayInput);
        return keepPlayInput.equals("1");
    }

}
