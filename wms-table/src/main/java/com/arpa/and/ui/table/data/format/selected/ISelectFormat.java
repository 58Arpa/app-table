package com.arpa.and.ui.table.data.format.selected;

import android.graphics.Canvas;
import android.graphics.Rect;

import com.arpa.and.ui.table.core.TableConfig;

/**
 * 选中操作格式化
 */
public interface ISelectFormat {

    void draw(Canvas canvas, Rect rect, Rect showRect, TableConfig config);
}
