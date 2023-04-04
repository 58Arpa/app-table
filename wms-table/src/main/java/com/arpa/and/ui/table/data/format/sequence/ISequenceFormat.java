package com.arpa.and.ui.table.data.format.sequence;

import android.graphics.Canvas;
import android.graphics.Rect;

import com.arpa.and.ui.table.core.TableConfig;
import com.arpa.and.ui.table.data.format.IFormat;

/**
 * 序号格式化
 */
public interface ISequenceFormat extends IFormat<Integer> {

    void draw(Canvas canvas, int sequence, Rect rect, TableConfig config);
}
