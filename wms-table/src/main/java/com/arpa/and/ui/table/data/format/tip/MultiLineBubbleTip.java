package com.arpa.and.ui.table.data.format.tip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

import com.arpa.and.ui.table.data.style.FontStyle;
import com.arpa.and.ui.table.utils.DensityUtils;

/**
 * 气泡提示
 */
public abstract class MultiLineBubbleTip <C> extends BaseBubbleTip<C, String[]> {
    private final int lineSpacing;

    public MultiLineBubbleTip(Context context, int backgroundDrawableID, int triangleDrawableID, FontStyle fontStyle) {
        super(context, backgroundDrawableID, triangleDrawableID, fontStyle);
        lineSpacing = DensityUtils.dp2px(context, 3);
    }

    @Override
    public int getTextHeight(String[] content) {
        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        int textHeight = (int) (fontMetrics.bottom - fontMetrics.top);
        return (textHeight + lineSpacing) * content.length - lineSpacing;
    }

    @Override
    public int getTextWidth(String[] content) {
        int maxLength = 0;
        for (String s : content) {
            int length = (int) getPaint().measureText(s);
            if (length > maxLength) {
                maxLength = length;
            }
        }
        return maxLength;
    }

    @Override
    public void drawText(Canvas canvas, Rect tipRect, String[] content, int textWidth, int textHeight, Paint paint) {
        int lineHeight = textHeight / content.length;
        for (int i = 0; i < content.length; i++) {
            String c = content[i];
            int bottom = tipRect.top + getPadding() + lineHeight + (lineHeight) * i - lineSpacing - deviation / 2;
            int left = tipRect.centerX() - textWidth / 2;
            paint.setTextAlign(Paint.Align.LEFT);
            canvas.drawText(c, left, bottom, paint);
        }
    }
}
