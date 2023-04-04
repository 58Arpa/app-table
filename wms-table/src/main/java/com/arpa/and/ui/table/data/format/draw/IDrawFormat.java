package com.arpa.and.ui.table.data.format.draw;

import android.graphics.Canvas;
import android.graphics.Rect;

import com.arpa.and.ui.table.core.TableConfig;
import com.arpa.and.ui.table.data.CellInfo;
import com.arpa.and.ui.table.data.column.Column;

/**
 * 绘制格式化
 */
public interface IDrawFormat <T> {

    /**
     * 测量宽
     */
    int measureWidth(Column<T> column, int position, TableConfig config);

    /**
     * 测量高
     */
    int measureHeight(Column<T> column, int position, TableConfig config);

    void draw(Canvas c, Rect rect, CellInfo<T> cellInfo, TableConfig config);
}
