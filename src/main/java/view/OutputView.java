package view;

import domain.Menu;
import domain.Order;
import domain.Table;

import java.util.List;

public class OutputView {
    private static final String TOP_LINE = "┌ ─ ┐";
    private static final String TABLE_FORMAT = "| %s |";
    private static final String BOTTOM_LINE = "└ %s ┘";
    private static final String TABLE_LIST_SCREEN = "## 테이블 목록";
    private static final String ORDER_SCREEN = "\n## 주문 내역";
    private static final String MENU_COUNT_PRICE_SCREEN = "메뉴 수량 금액";
    private static final String PAYMENT_MESSAGE = "\n## %d번 테이블의 결제를 진행합니다.\n";
    private static final String TOTAL_PRICE_SCREEN = "\n## 최종 결제할 금액";
    private static final String TOTAL_PRICE_MESSAGE = "%d원\n";
    private OutputView() {

    }

    public static void printTables(final List<Table> tables) {
        System.out.println(TABLE_LIST_SCREEN);
        final int size = tables.size();
        printLine(TOP_LINE, size);
        printTableNumbers(tables);
        printLine(BOTTOM_LINE, size, tables);
    }

    public static void printMenus(final List<Menu> menus) {
        for (final Menu menu : menus) {
            System.out.println(menu);
        }
    }

    private static void printLine(final String line, final int count) {
        for (int index = 0; index < count; index++) {
            System.out.print(line);
        }
        System.out.println();
    }


    private static void printLine(final String line, final int count, List<Table> tables) {
        for (int index = 0; index < count; index++) {
            if (tables.get(index).isOrdered()) {
                System.out.printf(line, "|");
                continue;
            }
            System.out.printf(line, "─");
        }
        System.out.println();
    }

    private static void printTableNumbers(final List<Table> tables) {
        for (final Table table : tables) {
            System.out.printf(TABLE_FORMAT, table);
        }
        System.out.println();
    }

    public static void printOrders(Table table) {
        System.out.println(ORDER_SCREEN);
        System.out.println(MENU_COUNT_PRICE_SCREEN);
        table.getOrders().stream()
                .forEach(order -> System.out.println(order));
    }

    public static void printPaymentMessage(int tableNumber) {
        System.out.printf(PAYMENT_MESSAGE, tableNumber);
    }

    public static void printTotalPrice(int totalPrice) {
        System.out.println(TOTAL_PRICE_SCREEN);
        System.out.printf(TOTAL_PRICE_MESSAGE, totalPrice);
    }
}
