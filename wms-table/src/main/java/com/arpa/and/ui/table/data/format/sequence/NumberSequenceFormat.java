package com.arpa.and.ui.table.data.format.sequence;

public class NumberSequenceFormat extends BaseSequenceFormat {

    @Override
    public String format(Integer position) {
        return String.valueOf(position);
    }
}
