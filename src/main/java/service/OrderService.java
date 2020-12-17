package service;

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
            final int tableNumber = TableRepository.checkTableExist(InputView.inputTableNumber());
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
