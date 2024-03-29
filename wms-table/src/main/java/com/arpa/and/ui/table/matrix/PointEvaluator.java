package com.arpa.and.ui.table.matrix;

import android.animation.TypeEvaluator;
import android.graphics.Point;

public class PointEvaluator implements TypeEvaluator {
    private final Point point = new Point();

    @Override
    public Object evaluate(float fraction, Object startValue, Object endValue) {
        Point startPoint = (Point) startValue;
        Point endPoint = (Point) endValue;
        int x = (int) (startPoint.x + fraction * (endPoint.x - startPoint.x));
        int y = (int) (startPoint.y + fraction * (endPoint.y - startPoint.y));
        point.set(x, y);
        return point;
    }
}
