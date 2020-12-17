import domain.ActionType;
import service.OrderService;
import service.PayService;
import view.InputView;

public class PosProgram {

    private final OrderService orderService;
    private final PayService payService;

    public PosProgram() {
        orderService = new OrderService();
        payService = new PayService();
    }

    public void run() {
        ActionType actionType;
        do {
            actionType = InputView.inputMainMenu();
            selectMenu(actionType);
        }while (!ActionType.END_PROGRAM.equals(actionType));
    }

    private void selectMenu(ActionType actionType) {
        if (ActionType.ORDER.equals(actionType)) {
            orderService.order();
            return;
        }
        if (ActionType.PAYMENT.equals(actionType)) {
            payService.pay();
        }
    }

}
