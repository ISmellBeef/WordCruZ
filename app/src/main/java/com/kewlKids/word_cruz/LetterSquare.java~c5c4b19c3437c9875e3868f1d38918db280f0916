package com.kewlKids.word_cruz;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

public class LetterSquare {
    private Rect Area;
    private char  Letter;
    public LetterSquare(Rect r,char l){
        Area = r;
        Letter = l;
    }
    public char getLetter(){
        return Letter;
    }
    public void setLetter(char c){
        Letter = c;
    }
    public Rect getRect(){
        return Area;
    }
    public void DrawMe(Paint paint, Canvas canvas) {
        paint.setAntiAlias(true);
        paint.setColor(Color.RED);
        paint.setStyle( Paint.Style.STROKE );
        paint.setStrokeWidth( 15 );
        canvas.drawRect(70, 70, 230, 230, paint);
    }
}
