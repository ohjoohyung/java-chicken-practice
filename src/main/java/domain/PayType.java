package domain;

import java.util.Arrays;

public enum PayType {

    CARD("1"),
    CASH("2");

    private String text;
    private static final String MENU_ERROR = "[ERROR] 잘못 입력하셨습니다.\n";
    PayType(String text) {
        this.text = text;
    }

    public static PayType of(String input) {
        return Arrays.stream(PayType.values())
                .filter(pay -> pay.text.equals(input))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(MENU_ERROR));
    }
}
