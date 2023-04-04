package com.arpa.and.ui.table.data.format.title;

import android.graphics.Canvas;
import android.graphics.Rect;

import com.arpa.and.ui.table.core.TableConfig;
import com.arpa.and.ui.table.data.column.Column;

public interface ITitleDrawFormat {

    /**
     * 测量宽
     */
    int measureWidth(Column column, TableConfig config);

    /**
     * 测量高
     */
    int measureHeight(TableConfig config);

    /**
     * 绘制
     *
     * @param c 画笔
     * @param column 列信息
     */
    void draw(Canvas c, Column column, Rect rect, TableConfig config);
}
