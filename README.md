## 치킨집 포스 프로그램
우아한 테크코스 이전 기수 오프라인 코딩테스트인 [치킨집 포스 프로그램](https://github.com/woowacourse/java-chicken-2019) 을
 연습해보는 저장소입니다.
 
### 구현할 기능 목록

- 메인 메뉴에서 1(주문등록), 2(결제하기), 3(프로그램 종료)를 입력한다.
    - 예외)
    - 1, 2, 3이 아닌 문자를 입력했을 경우
   
#### 1(주문등록)을 눌렀을 때

- 테이블 목록이 출력된다.
- 이미 주문등록이 된 테이블은 표시를 해준다.
- 원하는 테이블을 선택할 수 있다.
    - 예외)
    - 존재하는 테이블 번호가 아닐 경우

- 메뉴를 선택할 수 있다.
    - 예외)
    - 존재하는 메뉴 번호가 아닐 경우

- 메뉴 수량을 입력할 수 있다.
    - 예외)
    - 숫자가 아닌 문자일 경우
    - 자연수가 아닌 경우
    - 총 수량이 99를 넘었을 경우

#### 2(결제하기)를 눌렀을 때

- 결제할 테이블을 선택할 수 있다.
    - 예외)
    - 결제 가능 테이블이 아닌 경우

- 결제하는 테이블의 주문 내역을 출력한다.

- 결제타입인 1(신용카드), 2(현금)을 입력할 수 있다.
    - 예외)
    - 1, 2가 아닌 문자를 입력했을 경우
    
- 치킨 종류 메뉴의 수량 합이 10개가 넘는 경우 10000원씩 할인 된다. (10개 10000원, 20개 20000원 ...)

- 현금 결제는 5%가 할인된다. (할인된 금액에서 한 번 더 할인 가능)

- 최종 결제 금액이 출력된다.

#### 3(프로그램 종료)를 눌렀을 때

- 프로그램이 종료된다.