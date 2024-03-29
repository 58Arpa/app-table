package com.arpa.and.ui.table.annotation;

public enum ColumnType {
    /**
     * 查询当前字段
     */
    Own,
    /**
     * 查询字段内部
     */
    Child,
    /**
     * 查询当前数组或List对象
     */
    ArrayOwn,
    /**
     * 查询当前数组或List对象内部
     */
    ArrayChild
}
