package com.kewlKids.word_cruz;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;



public class CWordCruZInputLtrCrcl extends View {
    private CWordCruZManager workmanager = null;
    private CWordCruZDrawLine  WordCruZDrawLine = new CWordCruZDrawLine();
    CWordCruZInputLtrCrcl(Context c) {
        super(c);
        WordCruZDrawLine.SetParent(this);
    }
    public void SetManager(CWordCruZManager v)
    {
        workmanager = v;
    }
    public boolean OnTouchEvent(MotionEvent ev){


        return WordCruZDrawLine.OnTouchMe(ev);
    }

    Paint paint = new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        //white circle
        super.onDraw(canvas);
        //paint.setAntiAlias(true);
        //paint.setColor(Color.WHITE);
        //paint.setStrokeWidth(5);
        //canvas.drawCircle(450, 450, 450, paint);

        //white circle
        int x = getWidth();
        int y = getHeight();
        int radius = 580;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#ffffff"));
        canvas.drawCircle(725, 1620, radius, paint);

        //black border
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);
        paint.setColor(Color.BLACK);

        WordCruZDrawLine.onDrawMe(canvas);
    }

    //protected void onCreate(Bundle savedInstanceState){
    //super.onCreate(savedInstanceState);

    //}
}
