package service;

import domain.PayType;
import domain.Table;
import domain.TableRepository;
import view.InputView;
import view.OutputView;
import view.Screen;

public class PayService {

    public void pay() {
        try {
            Screen.visualizeTables();
            final int tableNumber = InputView.inputTableNumberToPay();
            Table table = TableRepository.getTableByTableNumber(tableNumber);
            OutputView.printOrders(table);
            OutputView.printPaymentMessage(tableNumber);
            PayType payType = InputView.inputPayType();
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
