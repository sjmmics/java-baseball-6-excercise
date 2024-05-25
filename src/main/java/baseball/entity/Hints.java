package baseball.entity;

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
            return "낫싱";
        }
        if (countStrike != 0 & countBall != 0) {
            return countBall + "볼 " + countStrike + "스트라이크";
        }
        if (countStrike == 0) {
            return countBall + "볼";
        }
        return countStrike + "스트라이크";
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Hints hints = (Hints) object;
        return countStrike == hints.countStrike && countBall == hints.countBall;
    }

    public boolean isClearGame() {
        return this.equals(new Hints(3, 0));
    }

}
