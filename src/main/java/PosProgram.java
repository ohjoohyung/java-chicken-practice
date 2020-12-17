import domain.MainMenuType;
import view.InputView;

public class PosProgram {

    public void run() {
        MainMenuType mainMenuType;
        do {
            mainMenuType = InputView.inputMainMenu();
        }while (!MainMenuType.END_PROGRAM.equals(mainMenuType));
    }
}
