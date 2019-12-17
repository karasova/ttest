package com.example.testing;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Rect {
    float left, right, top, bottom;
    int color;

    public Rect(float left, float right, float top, float bottom, int color) {
        this.left = left;
        this.right = right;
        this.top = top;
        this.bottom = bottom;
        this.color = color;
    }

    public void draw(Canvas canvas) {
        Paint p = new Paint();
        p.setColor(color);
        canvas.drawRect(left, top, right, bottom, p);
    }

    public boolean inRect(float point_x, float point_y) {
        if (point_x <= right && point_x >= left && point_y >= top && point_y <= bottom) {
            return true;
        }
        return false;
    }


}
