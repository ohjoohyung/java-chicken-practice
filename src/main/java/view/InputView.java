package view;

import domain.ActionType;
import utils.InputValidator;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String MAIN_SCREEN = "## 메인 화면";
    private static final String MAIN_MESSAGE = "1-주문등록\n2-결제하기\n3-프로그램 종료\n";
    private static final String SELECT_MESSAGE = "## 원하는 기능을 선택하세요.";
    private static final String INPUT_TABLE_NUMBER_MESSAGE = "## 주문할 테이블을 선택하세요.";
    private static final String INPUT_MENU_NUMBER_MESSAGE = "## 등록할 메뉴를 선택하세요.";
    private static final String INPUT_MENU_COUNT = "## 메뉴의 수량을 입력하세요.";


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

    public static String inputMenuCount() {
        System.out.println(INPUT_MENU_COUNT);
        return scanner.nextLine();
    }
}
