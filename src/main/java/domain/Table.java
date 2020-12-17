package domain;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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
                order.addNewMenuCount(newOrder);
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

    @Override
    public String toString() {
        return Integer.toString(number);
    }
}
