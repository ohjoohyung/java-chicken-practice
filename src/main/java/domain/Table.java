package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Table {
    private static final int MIN_ORDER_SIZE = 1;
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

    public int calculateChickenOrder() {
        int chickenCount = 0;
        int chickenPrice = 0;
        for (Order order : orders) {
            if (order.isChickenOrdered()) {
                chickenCount = order.sumChickenCount(chickenCount);
                chickenPrice += order.calculateMenuPrice();
            }
        }
        chickenPrice -= (chickenCount / 10) * 10000;
        return chickenPrice;
    }

    public int calculateOtherOrder() {
        int otherPrice = 0;
        for (Order order : orders) {
            if (!order.isChickenOrdered()) {
                otherPrice = order.calculateMenuPrice();
            }
        }
        return otherPrice;
    }



    @Override
    public String toString() {
        return Integer.toString(number);
    }
}
