package com.arpa.and.ui.table.data.format.grid;

import com.arpa.and.ui.table.data.CellInfo;

/**
 * 通用绘制网格格式化抽象类
 */
public class BaseGridFormat extends BaseAbstractGridFormat {

    @Override
    protected boolean isShowVerticalLine(int col, int row, CellInfo cellInfo) {
        return true;
    }

    @Override
    protected boolean isShowHorizontalLine(int col, int row, CellInfo cellInfo) {
        return true;
    }
}
