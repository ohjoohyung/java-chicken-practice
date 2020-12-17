package view;

import domain.ActionType;
import domain.MenuCount;
import domain.PayType;
import utils.InputValidator;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String MAIN_SCREEN = "\n## 메인 화면";
    private static final String MAIN_MESSAGE = "1-주문등록\n2-결제하기\n3-프로그램 종료\n";
    private static final String SELECT_MESSAGE = "## 원하는 기능을 선택하세요.";
    private static final String INPUT_TABLE_NUMBER_MESSAGE = "## 테이블을 선택하세요.";
    private static final String INPUT_MENU_NUMBER_MESSAGE = "## 등록할 메뉴를 선택하세요.";
    private static final String INPUT_MENU_COUNT = "\n## 메뉴의 수량을 입력하세요.";
    private static final String PAY_TYPE_MESSAGE = "\n## 신용 카드는 1번, 현금은 2번";


    private InputView() {

    }

    public static ActionType inputMainMenu() {
        try {
            System.out.println(MAIN_SCREEN);
            System.out.println(MAIN_MESSAGE);
            System.out.println(SELECT_MESSAGE);
            return ActionType.of(scanner.nextLine());
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return inputMainMenu();
        }
    }

    public static int inputTableNumber() {
        System.out.println(INPUT_TABLE_NUMBER_MESSAGE);
        return InputValidator.checkInteger(scanner.nextLine());
    }

    public static int inputMenuNumber() {
        System.out.println(INPUT_MENU_NUMBER_MESSAGE);
        return InputValidator.checkInteger(scanner.nextLine());
    }

    public static MenuCount inputMenuCount() {
        System.out.println(INPUT_MENU_COUNT);
        return new MenuCount(InputValidator.checkInteger(scanner.nextLine()));
    }

    public static PayType inputPayType() {
        System.out.println(PAY_TYPE_MESSAGE);
        return PayType.of(scanner.nextLine());
    }


}
