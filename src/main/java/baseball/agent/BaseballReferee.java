package baseball.agent;

import baseball.funtions.BaseballViewer;
import baseball.entity.Balls;
import baseball.entity.Hints;

public class BaseballReferee {

    public boolean judgeKindOfBalls(Balls currentPlayerBalls, Balls componetBalls) {
        Hints hints = Hints.getHints(currentPlayerBalls, componetBalls);
        BaseballViewer.showHints(hints);
        if (hints.equals(new Hints(3, 0))) {
            BaseballViewer.clearMessage();
            return true;
        }
        return false;
    }
}
