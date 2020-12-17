package domain;



import java.util.ArrayList;
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

    public void addOrder(Order order) {
        orders.add(order);
    }

    public boolean isOrdered() {
        return orders.size() >= MIN_ORDER_SIZE;
    }

    @Override
    public String toString() {
        return Integer.toString(number);
    }
}
