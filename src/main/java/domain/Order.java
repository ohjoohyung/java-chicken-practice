package domain;

import java.util.HashMap;
import java.util.Map;

public class Order {

    private Map<Menu, MenuCount> orderMenus;

    public Order(Menu menu, MenuCount count) {
        orderMenus = new HashMap<>();
        orderMenus.put(menu, count);
    }


}
