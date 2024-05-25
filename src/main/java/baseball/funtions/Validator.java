package baseball.funtions;

public class Validator {

    public void checkBallsInput(Object obj) throws IllegalArgumentException {
        String inputString = (String) obj;
        if (inputString.length() != 3) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < inputString.length(); i++) {
            if (!Character.isDigit(inputString.charAt(i))) {
                throw new IllegalArgumentException();
            }
        }
        if (inputString.charAt(0) == inputString.charAt(1) ||
                inputString.charAt(1) == inputString.charAt(2) ||
                inputString.charAt(2) == inputString.charAt(0)) {
            throw new IllegalArgumentException();
        }
    }

    public void checkKeepPlayInput(Object obj) throws IllegalArgumentException {
        String keepPlayInput = (String) obj;
        if (keepPlayInput.length() != 1) {
            throw new IllegalArgumentException();
        }
        if (!keepPlayInput.equals("1") && !keepPlayInput.equals("2")) {
            throw new IllegalArgumentException();
        }
    }

}
