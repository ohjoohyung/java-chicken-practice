import domain.MainMenuType;
import domain.Table;
import domain.TableRepository;
import service.OrderService;
import view.InputView;
import view.OutputView;

import java.util.List;

public class PosProgram {

    private OrderService orderService;

    public PosProgram() {
        orderService = new OrderService();
    }

    public void run() {
        MainMenuType mainMenuType;
        do {
            mainMenuType = InputView.inputMainMenu();
            selectMenu(mainMenuType);
        }while (!MainMenuType.END_PROGRAM.equals(mainMenuType));
    }

    private void selectMenu(MainMenuType mainMenuType) {
        if (MainMenuType.ORDER.equals(mainMenuType)) {
            orderService.order();
        }
    }



}
