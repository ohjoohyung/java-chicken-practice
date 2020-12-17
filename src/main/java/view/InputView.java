package view;

import domain.MainMenuType;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String MAIN_MENU_SCREEN = "## 메인 화면";
    private static final String MAIN_MENU_MESSAGE = "1-주문등록\n2-결제하기\n3-프로그램 종료\n";
    private static final String MENU_SELECT_MESSAGE = "## 원하는 기능을 선택하세요.";


    private InputView() {

    }

    public static MainMenuType inputMainMenu() {
        try {
            System.out.println(MAIN_MENU_SCREEN);
            System.out.println(MAIN_MENU_MESSAGE);
            System.out.println(MENU_SELECT_MESSAGE);
            return MainMenuType.of(scanner.nextLine());
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return inputMainMenu();
        }
    }


    public static int inputTableNumber() {
        System.out.println("## 주문할 테이블을 선택하세요.");
        return scanner.nextInt();
    }
}
