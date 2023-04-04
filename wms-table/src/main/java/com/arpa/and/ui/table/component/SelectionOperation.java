package com.arpa.and.ui.table.component;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;

import com.arpa.and.ui.table.core.TableConfig;
import com.arpa.and.ui.table.data.format.selected.ISelectFormat;
import com.arpa.and.ui.table.matrix.MatrixHelper;

/**
 * 选中操作<br/>
 * 这个类用于处理选中操作<br/>
 * 暂时只做比较简单点击效果
 */
public class SelectionOperation implements MatrixHelper.OnInterceptListener {
    /**
     * 选中区域
     */
    private static final int INVALID = -1; //无效坐标
    private final Rect selectionRect;
    private ISelectFormat selectFormat;
    private int selectRow = INVALID;
    private int selectColumn = INVALID;
    private boolean isShow;

    SelectionOperation() {
        this.selectionRect = new Rect();
    }

    void reset() {
        isShow = false;
    }

    void setSelectionRect(int selectColumn, int selectRow, Rect rect) {
        this.selectRow = selectRow;
        this.selectColumn = selectColumn;
        selectionRect.set(rect);
        isShow = true;
    }

    void checkSelectedPoint(int selectColumn, int selectRow, Rect rect) {
        if (isSelectedPoint(selectColumn, selectRow)) {
            selectionRect.set(rect);
            isShow = true;
        }
    }

    boolean isSelectedPoint(int selectColumn, int selectRow) {
        return selectRow == this.selectRow && selectColumn == this.selectColumn;
    }

    public void draw(Canvas canvas, Rect showRect, TableConfig config) {
        if (selectFormat != null && isShow) {
            selectFormat.draw(canvas, selectionRect, showRect, config);
        }
    }

    public ISelectFormat getSelectFormat() {
        return selectFormat;
    }

    void setSelectFormat(ISelectFormat selectFormat) {
        this.selectFormat = selectFormat;
    }

    @Override
    public boolean isIntercept(MotionEvent e1, float distanceX, float distanceY) {
        return false;
    }
}
