package baseball.function;

import constant.Constant;

import java.util.HashSet;

public class InputValidator {

    public void validateBallsInput(Object obj) {
        String inputString = (String) obj;
        validateNumberBalls(inputString);
        validateDigit(inputString);
        validateDuplicateNumber(inputString);
    }

    private void validateDigit(String inputString) {
        for (int i = 0; i < inputString.length(); i++) {
            if (!Character.isDigit(inputString.charAt(i))) {
                throw new IllegalArgumentException();
            }
        }
    }

    private void validateNumberBalls(String inputString) {
        if (inputString.length() != Constant.NUMBER_BALL_PLAY) {
            throw new IllegalArgumentException();
        }
    }

    private void validateDuplicateNumber(String inputString) {
        HashSet<Integer> inputStringSet = new HashSet<>();
        for (int i = 0; i < inputString.length(); i++) {
            inputStringSet.add(Character.getNumericValue(inputString.charAt(i)));
        }
        if (inputStringSet.size() != inputString.length()) {
            throw new IllegalArgumentException();
        }
    }

    public void checkKeepPlayInput(Object obj) throws IllegalArgumentException {
        String keepPlayInput = (String) obj;
        if (keepPlayInput.length() != Constant.KEEP_PLAYING_FLAG.length() &&
                keepPlayInput.length() != Constant.NOT_KEEP_PLAYING_FLAG.length()) {
            throw new IllegalArgumentException();
        }
        if (!keepPlayInput.equals(Constant.KEEP_PLAYING_FLAG) &&
                !keepPlayInput.equals(Constant.NOT_KEEP_PLAYING_FLAG)) {
            throw new IllegalArgumentException();
        }
    }
}
