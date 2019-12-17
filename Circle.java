package com.example.testing;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Circle {
    float x, y, radius;
    int n, color;

    public Circle (float x, float y, float radius, int n, int color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.n = n;
        this.color = color;
    }

    public void draw(Canvas canvas) {
        Paint p = new Paint();
        p.setColor(color);
        canvas.drawCircle(x, y, radius, p);
//        p.setColor(Color.BLACK);
//        canvas.drawText(Integer.toString(n), x, y, p);
    }

    @Override
    public String toString() {
        return "Circle{" + "x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                ", n=" + n +
                ", color=" + color +
                '}';
    }

    public boolean inCircle(float point_x, float point_y) {
        double distance = Math.hypot(Math.abs(x - point_x), Math.abs(y - point_y));
        return (distance < radius);
    }
}
