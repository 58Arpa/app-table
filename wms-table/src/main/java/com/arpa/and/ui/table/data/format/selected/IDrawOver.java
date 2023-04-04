package com.arpa.and.ui.table.data.format.selected;

import android.graphics.Canvas;
import android.graphics.Rect;

import com.arpa.and.ui.table.core.TableConfig;

public interface IDrawOver {

    void draw(Canvas canvas, Rect scaleRect, Rect showRect, TableConfig config);
}
