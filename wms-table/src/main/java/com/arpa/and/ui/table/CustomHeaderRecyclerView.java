package com.arpa.and.ui.table;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by Jonney on 2016/10/12.
 */
public class CustomHeaderRecyclerView extends RecyclerView {
    public CustomHeaderRecyclerView(Context context) {
        super(context);
    }

    public CustomHeaderRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomHeaderRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public boolean onTouchEvent(MotionEvent e) {
        Log.w("touch", "touchEvent");
        return super.onTouchEvent(e);

    }
}
