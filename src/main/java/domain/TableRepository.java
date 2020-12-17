package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TableRepository {
    private static final List<Table> tables = new ArrayList<>();
    private static final String TABLE_NUMBER_ERROR = "[ERROR] 테이블 번호가 존재하지 않습니다.";


    static {
        tables.add(new Table(1));
        tables.add(new Table(2));
        tables.add(new Table(3));
        tables.add(new Table(5));
        tables.add(new Table(6));
        tables.add(new Table(8));
    }

    public static List<Table> tables() {
        return Collections.unmodifiableList(tables);
    }

    public static int checkTableExist(String tableNumber) {
        for (Table table : tables) {
            if (table.toString().equals(tableNumber)) {
                return Integer.parseInt(tableNumber);
            }
        }
        throw new IllegalArgumentException(TABLE_NUMBER_ERROR);

    }
}
