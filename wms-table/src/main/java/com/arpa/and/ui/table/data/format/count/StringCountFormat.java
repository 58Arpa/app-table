package com.arpa.and.ui.table.data.format.count;

import com.arpa.and.ui.table.data.column.Column;

import java.util.HashSet;
import java.util.Set;

public class StringCountFormat <T> implements ICountFormat<T, Integer> {
    private final Set<String> valueSet;
    private final Column<T> column;
    private int count;

    public StringCountFormat(Column<T> column) {
        this.column = column;
        this.valueSet = new HashSet<>();
    }

    @Override
    public void count(T t) {
        String value;
        if (column.getFormat() != null) {
            value = column.getFormat().format(t);
        } else {
            value = t == null ? "" : t.toString();
        }
        if (value != null && !valueSet.contains(value) && !"".equals(value)) {
            count++;
            valueSet.add(value);
        }
    }

    @Override
    public Integer getCount() {
        return count;
    }

    @Override
    public String getCountString() {
        return String.valueOf(count);
    }

    @Override
    public void clearCount() {
        valueSet.clear();
        count = 0;
    }
}
