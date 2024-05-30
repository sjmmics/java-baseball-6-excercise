package baseball.function;

import camp.nextstep.edu.missionutils.Console;
import constant.Constant;

public class InteractController {
    private final InputValidator validator;

    public InteractController(InputValidator validator) {
        this.validator = validator;
    }

    public boolean keepPlayBaseball() {
        Viewer.continueGame();
        String keepPlayInput = Console.readLine();
        validator.checkKeepPlayInput(keepPlayInput);
        return keepPlayInput.equals(Constant.KEEP_PLAYING_FLAG);
    }
}
