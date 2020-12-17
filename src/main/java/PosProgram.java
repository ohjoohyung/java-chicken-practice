import domain.ActionType;
import service.OrderService;
import view.InputView;

public class PosProgram {

    private OrderService orderService;

    public PosProgram() {
        orderService = new OrderService();
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
        }
    }



}
