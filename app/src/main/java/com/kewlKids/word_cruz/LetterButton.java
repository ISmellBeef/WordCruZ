package com.kewlKids.word_cruz;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

public class LetterButton {
    private Rect Area;
    private char  Letter;
    public LetterButton(Rect r,char l){
        Area = r;
        Letter = l;
    }
    public char getLetter(){
        return Letter;
    }
    public boolean isSelected(int x, int y){
        return false;
    }
    public void DrawMe(Paint paint,Canvas canvas) {
        //white circle
        //paint.setAntiAlias(true);
        //paint.setColor(Color.WHITE);
        //paint.setStrokeWidth(5);
        //canvas.drawCircle(450, 450, 450, paint);

        //white circle
        int x = Area.width();
        int y = Area.height();
        int radius = 580;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#ffffff"));
        //canvas.drawCircle(725, 1620, radius, paint);

        //black border
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);
        paint.setColor(Color.BLACK);
    }
}
