package service;

import domain.Menu;
import domain.MenuRepository;
import domain.Table;
import domain.TableRepository;
import view.InputView;
import view.OutputView;

import java.util.List;

public class OrderService {

    public void order() {
        try {
            final List<Table> tables = TableRepository.tables();
            OutputView.printTables(tables);
            final int tableNumber = InputView.inputTableNumber();
            Table table = TableRepository.getTableByTableNumber(tableNumber);
            final List<Menu> menus = MenuRepository.menus();
            OutputView.printMenus(menus);
            final int menuNumber = InputView.inputMenuNumber();
            Menu menu = MenuRepository.getMenuByMenuNumber(menuNumber);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
