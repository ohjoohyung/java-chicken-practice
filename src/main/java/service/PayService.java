package service;

import domain.PayType;
import domain.Table;
import domain.TableRepository;
import view.InputView;
import view.OutputView;
import view.Screen;

public class PayService {
    private static final double CASH_DISCOUNT_RATIO = 0.95;

    public void pay() {
        try {
            Screen.visualizeTables();
            final int tableNumber = InputView.inputTableNumber();
            Table table = TableRepository.getTableByTableNumber(tableNumber);
            OutputView.printOrders(table);
            OutputView.printPaymentMessage(tableNumber);
            PayType payType = InputView.inputPayType();
            selectPayType(payType, table);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private void selectPayType(PayType payType, Table table) {
        int totalPrice = table.getTotalPrice();
        if (PayType.CARD.equals(payType)) {
            OutputView.printTotalPrice(totalPrice);
            return;
        }
        if (PayType.CASH.equals(payType)) {
            OutputView.printTotalPrice((int)(totalPrice * CASH_DISCOUNT_RATIO));
        }
    }
}
