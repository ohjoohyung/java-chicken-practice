package domain;

import exception.PosProgramException;

public class MenuCount {
    private static final int MAX_COUNT = 99;
    private static final int MIN_COUNT = 1;
    private static final String COUNT_RANGE_ERROR = "주문 가능 수량은 1개 ~ 99개입니다.";
    private static final String COUNT_OVER_MAX_COUNT_ERROR = "최대 주문 가능 수량은 99개입니다. 현재 수량: %d개";

    private int menuCount;

    public MenuCount(int menuCount) {
        checkMenuCountRange(menuCount);
        this.menuCount = menuCount;
    }

    public int getMenuCount() {
        return menuCount;
    }

    private void checkMenuCountRange(int menuCount) {
        if (menuCount > MAX_COUNT || menuCount < MIN_COUNT) {
            throw new PosProgramException(COUNT_RANGE_ERROR);
        }
    }

    public void checkOverMaxCountIfAdd(MenuCount newMenuCount) {
        if (menuCount + newMenuCount.menuCount > MAX_COUNT) {
            throw new PosProgramException(String.format(COUNT_OVER_MAX_COUNT_ERROR, menuCount));
        }
    }

    public void sumMenuCount(MenuCount newMenuCount) {
        this.menuCount += newMenuCount.menuCount;
    }
}
