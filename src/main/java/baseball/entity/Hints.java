package baseball.entity;

import constant.Constant;

public class Hints {
    private final int countStrike;
    private final int countBall;

    public Hints(int countStrike, int countBall) {
        this.countStrike = countStrike;
        this.countBall = countBall;
    }

    @Override
    public String toString() {
        if (countStrike == 0 & countBall == 0) {
            return Constant.NO_MATCH_HINT_NAME;
        }
        if (countStrike != 0 & countBall != 0) {
            return countBall + Constant.MATCH_VALUE_NO_POSITION +
                    " " + countStrike + Constant.MATCH_VALUE_POSITION;
        }
        if (countStrike == 0) {
            return countBall + Constant.MATCH_VALUE_NO_POSITION;
        }
        return countStrike + Constant.MATCH_VALUE_POSITION;
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Hints hints = (Hints) object;
        return countStrike == hints.countStrike && countBall == hints.countBall;
    }

    public boolean isClearGame() {
        return this.equals(new Hints(Constant.NUMBER_BALL_PLAY, 0));
    }

}
