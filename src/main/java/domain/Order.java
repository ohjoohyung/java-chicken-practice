package domain;

public class Order {
    private static final String SPACE = " ";
    private Menu menu;
    private MenuCount menuCount;

    public Order(Menu menu, MenuCount menuCount) {
        this.menu = menu;
        this.menuCount = menuCount;
    }

    public boolean isSameMenu(Order order) {
        return menu.getName().equals(order.menu.getName());
    }

    public void addSameMenu(Order newOrder) {
        menuCount.checkOverMaxCountIfAdd(newOrder.menuCount);
        menuCount.sumMenuCount(newOrder.menuCount);
    }

    public boolean isMenuChicken() {
        return menu.isChicken();
    }

    public int sumChickenCount(int chickenCount) {
        return chickenCount + menuCount.getMenuCount();
    }

    public int calculateMenuPrice() {
        return menu.getPrice() * menuCount.getMenuCount();
    }

    @Override
    public String toString() {
        return menu.getName() + SPACE + menuCount.getMenuCount() + SPACE + menu.getPrice();
    }
}
