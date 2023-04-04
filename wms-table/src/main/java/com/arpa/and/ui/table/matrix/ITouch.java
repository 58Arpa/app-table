package com.arpa.and.ui.table.matrix;

import android.view.MotionEvent;
import android.view.View;

public interface ITouch {
    /**
     * 用于判断是否请求不拦截事件
     * 解决手势冲突问题
     */
    void onDisallowInterceptEvent(View view, MotionEvent event);

    /**
     * 处理touchEvent
     */
    boolean handlerTouchEvent(MotionEvent event);
}
