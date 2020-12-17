package service;

import domain.*;
import view.InputView;
import view.Screen;

public class OrderService {

    public void order() {
        try {
            Screen.visualizeTables();
            final int tableNumber = InputView.inputTableNumber();
            Table table = TableRepository.getTableByTableNumber(tableNumber);
            Screen.visualizeMenus();
            final int menuNumber = InputView.inputMenuNumber();
            Menu menu = MenuRepository.getMenuByMenuNumber(menuNumber);
            MenuCount menuCount = InputView.inputMenuCount();
            table.addOrder(new Order(menu, menuCount));
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
