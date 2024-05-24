package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class Balls {
    private final int firstBall;
    private final int secondBall;
    private final int thirdBall;

    public Balls(String numbersStr) {
        this.firstBall = Character.getNumericValue(numbersStr.charAt(0));
        this.secondBall = Character.getNumericValue(numbersStr.charAt(1));
        this.thirdBall = Character.getNumericValue(numbersStr.charAt(2));
    }

    public Balls(int number) {
        this(Integer.toString(number));
    }

    public Balls(List<Integer> numbersList) {
        this.firstBall = numbersList.get(0);
        this.secondBall = numbersList.get(1);
        this.thirdBall = numbersList.get(2);
    }

    public int getBalls() {
        return firstBall * 100 + secondBall * 10 + thirdBall;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Balls balls = (Balls) o;
        return firstBall == balls.firstBall &&
                secondBall == balls.secondBall &&
                thirdBall == balls.thirdBall;
    }

    @Override
    public String toString() {
        return Integer.toString(firstBall) + Integer.toString(secondBall) +
                Integer.toString(thirdBall);
    }
}
