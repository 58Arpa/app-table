package com.arpa.and.ui.table.data.format.bg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

public interface IBackgroundFormat {

    /**
     * 绘制背景
     */
    void drawBackground(Canvas canvas, Rect rect, Paint paint);
}
