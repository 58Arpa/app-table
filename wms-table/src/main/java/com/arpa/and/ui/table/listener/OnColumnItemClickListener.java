package com.arpa.and.ui.table.listener;

import com.arpa.and.ui.table.data.column.Column;

public interface OnColumnItemClickListener <T> {

    void onClick(Column<T> column, String value, T t, int position);
}
