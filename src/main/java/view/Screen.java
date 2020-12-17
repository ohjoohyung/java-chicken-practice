package view;

import domain.Menu;
import domain.MenuRepository;
import domain.Table;
import domain.TableRepository;

import java.util.List;
import java.util.Scanner;

public class Screen {

    private Screen() {

    }

    public static void visualizeTables() {
        final List<Table> tables = TableRepository.tables();
        OutputView.printTables(tables);
    }

    public static void visualizeMenus() {
        final List<Menu> menus = MenuRepository.menus();
        OutputView.printMenus(menus);
    }
}
