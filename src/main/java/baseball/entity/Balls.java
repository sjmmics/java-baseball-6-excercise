package baseball.entity;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Balls {
    private final List<Integer> balls;

    public Balls(String ballsStr) {
        balls = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            balls.add(Character.getNumericValue(ballsStr.charAt(i)));
        }
    }

    public Balls(List<Integer> ballsList) {
        balls = new ArrayList<>();
        balls.addAll(ballsList);
    }

    public static Balls makeComponentBalls() {
        List<Integer> componentBallsList = new ArrayList<>();
        while (componentBallsList.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!componentBallsList.contains(randomNumber)) {
                componentBallsList.add(randomNumber);
            }
        }
        return new Balls(componentBallsList);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Balls balls1 = (Balls) object;
        return Objects.equals(balls, balls1.balls);
    }

    public boolean contains(Integer ball) {
        return this.balls.contains(ball);
    }

    public Integer getBallByIndex(int index) {
        return this.balls.get(index);
    }

}
