package domain;

import exception.PosProgramException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TableRepository {
    private static final List<Table> tables = new ArrayList<>();
    private static final String TABLE_NUMBER_ERROR = "테이블 번호가 존재하지 않습니다.";


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

    public static Table getTableByTableNumber(int tableNumber) {
        return tables.stream()
                .filter(table -> table.isTableNumber(tableNumber))
                .findFirst()
                .orElseThrow(() -> new PosProgramException(TABLE_NUMBER_ERROR));
    }
}
