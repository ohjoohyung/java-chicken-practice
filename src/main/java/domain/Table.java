package domain;

public class Table {
    private final int number;
    private Order order;

    public Table(final int number) {
        this.number = number;
    }

    public boolean isTableNumber(int tableNumber) {
        return number == tableNumber;
    }

    @Override
    public String toString() {
        return Integer.toString(number);
    }
}
