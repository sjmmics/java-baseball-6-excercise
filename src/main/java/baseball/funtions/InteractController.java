package baseball.funtions;

import camp.nextstep.edu.missionutils.Console;

public class InteractController {
    private final InputValidator validator;

    public InteractController(InputValidator validator) {
        this.validator = validator;
    }

    public boolean keepPlayBaseball() {
        BaseballViewer.continueGame();
        String keepPlayInput = Console.readLine();
        validator.checkKeepPlayInput(keepPlayInput);
        return keepPlayInput.equals("1");
    }
}
