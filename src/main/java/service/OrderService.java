package service;

import domain.*;
import view.InputView;
import view.OutputView;

import java.util.List;

public class OrderService {

    public void order() {
        try {
            visualizeTables();
            final int tableNumber = InputView.inputTableNumber();
            Table table = TableRepository.getTableByTableNumber(tableNumber);
            visualizeMenus();
            final int menuNumber = InputView.inputMenuNumber();
            Menu menu = MenuRepository.getMenuByMenuNumber(menuNumber);
            MenuCount menuCount = InputView.inputMenuCount();
            table.addOrder(new Order(menu, menuCount));
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void visualizeTables() {
        final List<Table> tables = TableRepository.tables();
        OutputView.printTables(tables);
    }

    public void visualizeMenus() {
        final List<Menu> menus = MenuRepository.menus();
        OutputView.printMenus(menus);
    }
}
