package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        BaseballReferee referee = new BaseballReferee();
        Balls balls = referee.makeComponentBalls();
        System.out.println(balls);



    }
}
