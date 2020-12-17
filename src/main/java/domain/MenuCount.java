package domain;

public class MenuCount {
    private static final int MAX_COUNT = 99;
    private static final int MIN_COUNT = 1;
    private static final String COUNT_RANGE_ERROR = "[ERROR] 주문 가능 수량은 1개 ~ 99개입니다.";
    private static final String COUNT_OVER_MAX_COUNT_ERROR = "[ERROR] 최대 주문 가능 수량은 99개입니다.";


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
            throw new IllegalArgumentException(COUNT_RANGE_ERROR);
        }
    }

    public void checkOverMaxCountIfAdd(MenuCount newMenuCount) {
        if (menuCount + newMenuCount.menuCount > MAX_COUNT) {
            throw new IllegalArgumentException(COUNT_OVER_MAX_COUNT_ERROR);
        }
    }

    public void addNewMenuCount(MenuCount newMenuCount) {
        this.menuCount += newMenuCount.menuCount;
    }


}
