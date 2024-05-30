package baseball.function;

import baseball.entity.Hints;
import constant.Constant;

public class Viewer {

    public static void gameStart() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public static void enterUserGuess() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public static void showHints(Hints hints) {
        System.out.println(hints);
    }

    public static void clearMessage() {
        System.out.println(Constant.NUMBER_BALL_PLAY +
                "개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public static void continueGame() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}
