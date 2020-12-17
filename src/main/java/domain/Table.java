package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Table {
    private static final int MIN_ORDER_SIZE = 1;
    private static final int CHICKEN_COUNT_FOR_DISCOUNT = 10;
    private static final int PER_DISCOUNT_MONEY = 10000;

    private final int number;
    private List<Order> orders = new ArrayList<>();

    public Table(final int number) {
        this.number = number;
    }

    public boolean isTableNumber(int tableNumber) {
        return number == tableNumber;
    }

    public void addOrder(Order newOrder) {
        for (Order order : orders) {
            if (order.isSameMenu(newOrder)) {
                order.addSameMenu(newOrder);
                return;
            }
        }
        orders.add(newOrder);
    }

    public boolean isOrdered() {
        return orders.size() >= MIN_ORDER_SIZE;
    }

    public List<Order> getOrders() {
        return Collections.unmodifiableList(orders);
    }

    public int getTotalPrice() {
        int totalPrice = calculateChickenOrder() + calculateOtherOrder();
        return totalPrice;
    }

    private int calculateChickenOrder() {
        int chickenCount = 0;
        int chickenPrice = 0;
        for (Order order : orders) {
            if (order.isMenuChicken()) {
                chickenCount = order.sumChickenCount(chickenCount);
                chickenPrice += order.calculateMenuPrice();
            }
        }
        chickenPrice -= (chickenCount / CHICKEN_COUNT_FOR_DISCOUNT) * PER_DISCOUNT_MONEY;
        return chickenPrice;
    }

    private int calculateOtherOrder() {
        int otherPrice = 0;
        for (Order order : orders) {
            if (!order.isMenuChicken()) {
                otherPrice = order.calculateMenuPrice();
            }
        }
        return otherPrice;
    }

    public void orderClear() {
        orders.clear();
    }

    @Override
    public String toString() {
        return Integer.toString(number);
    }
}
