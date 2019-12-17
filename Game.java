package com.example.testing;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import java.util.ArrayList;

public class Game extends View {
    MainActivity activity;
    int num_circ, width, height;
    boolean visited;
    ArrayList<Circle> circles = new ArrayList<>();
    Rect rect;

    public Game(Context context) {
        super(context);
        activity = (MainActivity) context;
        this.width = getWidth();
        this.height = getHeight();
        visited = false;
        begin();
    }

    public void begin() {
        float x = 100;
        float y = 100;
        int color = Color.BLUE;
        float rad = 45;
        int n = 1;
        Circle new_circ = new Circle(x, y, rad, n, color);
        circles.add(1, new_circ);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int p = Color.BLACK;
        rect = new Rect(100, 100, 100, 100, p);
    }
}
