package domain;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private static final String SPACE = " ";
    private Menu menu;
    private MenuCount menuCount;
    private Map<Menu, MenuCount> orderMenus;

    public Order(Menu menu, MenuCount menuCount) {
        orderMenus = new HashMap<>();
        orderMenus.put(menu, menuCount);
        this.menu = menu;
        this.menuCount = menuCount;
    }

    public boolean isSameMenu(Order order) {
        return menu.getName().equals(order.menu.getName());
    }

    public void addNewMenuCount(Order newOrder) {
        menuCount.checkOverMaxCountIfAdd(newOrder.menuCount);
        menuCount.addNewMenuCount(newOrder.menuCount);
    }

    @Override
    public String toString() {
        return menu.getName() + SPACE + menuCount.getMenuCount() + SPACE + menu.getPrice();
    }
}
