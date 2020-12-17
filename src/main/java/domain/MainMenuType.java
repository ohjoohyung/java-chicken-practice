package domain;

import java.util.Arrays;

public enum MainMenuType {

    ORDER("1"),
    PAYMENT("2"),
    END_PROGRAM("3");

    private static final String MENU_ERROR = "[ERROR] 메뉴를 잘못 입력하셨습니다.\n";
    private String text;

    MainMenuType(String text) {
        this.text = text;
    }

    public static MainMenuType of(String menuInput) {
        return Arrays.stream(MainMenuType.values())
                .filter(menu -> menu.text.equals(menuInput))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(MENU_ERROR));
    }
}
