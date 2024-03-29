package com.arpa.and.ui.table.data.format.bg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/**
 * 绘制格子背景格式化
 */
public interface ICellBackgroundFormat <T> {
    /**
     * 绘制背景
     */
    void drawBackground(Canvas canvas, Rect rect, T t, Paint paint);

    /**
     * 当背景颜色改变字体也需要跟随变化
     */
    int getTextColor(T t);
}
