package baseball.entity;

import constant.Constant;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Balls {
    private final List<Integer> ballList;

    public Balls(String ballsStr) {
        ballList = new ArrayList<>();
        for (int i = 0; i < Constant.NUMBER_BALL_PLAY; i++) {
            ballList.add(Character.getNumericValue(ballsStr.charAt(i)));
        }
    }

    public Balls(List<Integer> ballsList) {
        ballList = new ArrayList<>();
        ballList.addAll(ballsList);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Balls balls = (Balls) object;
        return Objects.equals(this.ballList, balls.ballList);
    }

    public boolean contains(Integer ball) {
        return this.ballList.contains(ball);
    }

    public Integer getBallByIndex(int index) {
        return this.ballList.get(index);
    }

}
