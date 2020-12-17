package view;

import domain.Menu;
import domain.MenuRepository;
import domain.Table;
import domain.TableRepository;

import java.util.List;

public class Screen {

    private Screen() {
    }

    public static void visualizeTables() {
        final List<Table> tables = TableRepository.tables();
        System.out.println();
        OutputView.printTables(tables);
        System.out.println();
    }

    public static void visualizeMenus() {
        final List<Menu> menus = MenuRepository.menus();
        System.out.println();
        OutputView.printMenus(menus);
        System.out.println();
    }
}
