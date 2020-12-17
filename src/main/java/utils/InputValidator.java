package utils;

import exception.PosProgramException;

public class InputValidator {

    private static final String INCORRECT_NUMBER_ERROR = "숫자를 입력해주세요.";

    private InputValidator() {

    }

    public static int checkInteger(String number) {
        try {
            return Integer.parseInt(number);
        }catch (IllegalArgumentException e) {
            throw new PosProgramException(INCORRECT_NUMBER_ERROR);
        }
    }
}
