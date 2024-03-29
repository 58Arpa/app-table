package com.arpa.and.ui.table.data.column;

import java.util.ArrayList;
import java.util.List;

public class ColumnNode {
    private final List<ColumnNode> children;
    private String name;
    private ArrayColumn arrayColumn;
    private ColumnNode parent;

    public ColumnNode(String name, ColumnNode parent, ArrayColumn arrayColumn) {
        this(name, parent);
        this.arrayColumn = arrayColumn;
    }

    public ColumnNode(String name, ColumnNode parent) {
        this.name = name;
        this.parent = parent;
        this.children = new ArrayList<>();
    }

    public static int getLevel(ColumnNode node, int level) {
        if (node.arrayColumn != null && !node.arrayColumn.isThoroughArray()) {
            level++;
        }
        if (node.getParent() != null) {
            if (node.getParent().arrayColumn == null) {
                level++;
            }
            return getLevel(node.getParent(), level);
        }
        return level - 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ColumnNode> getChildren() {
        return children;
    }

    public ArrayColumn getArrayColumn() {
        return arrayColumn;
    }

    public void setArrayColumn(ArrayColumn arrayColumn) {
        this.arrayColumn = arrayColumn;
    }

    public ColumnNode getParent() {
        return parent;
    }

    public void setParent(ColumnNode parent) {
        this.parent = parent;
    }
}
