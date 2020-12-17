package domain;

import exception.PosProgramException;

import java.util.Arrays;

public enum ActionType {

    ORDER("1"),
    PAYMENT("2"),
    END_PROGRAM("3");

    private static final String INPUT_ERROR = "잘못 입력하셨습니다.";
    private String text;

    ActionType(String text) {
        this.text = text;
    }

    public static ActionType of(String menuInput) {
        return Arrays.stream(ActionType.values())
                .filter(menu -> menu.text.equals(menuInput))
                .findFirst()
                .orElseThrow(() -> new PosProgramException(INPUT_ERROR));
    }
}
