package com.arpa.and.ui.table.data.format.sequence;

import com.arpa.and.ui.table.utils.LetterUtils;

public class LetterSequenceFormat extends BaseSequenceFormat {

    @Override
    public String format(Integer position) {
        return LetterUtils.ToNumberSystem26(position);
    }
}
