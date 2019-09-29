package com.kewlKids.word_cruz;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;


public class CWordCruZInputLtrCrcl extends View{
    private CWordCruZManager workmanager = null;
    private CWordCruZDrawLine  WordCruZDrawLine = new CWordCruZDrawLine();
    private LetterButtonManager ButtonManager = new LetterButtonManager();
    Paint paint = new Paint();

    CWordCruZInputLtrCrcl(Context c) {
        super(c);
        WordCruZDrawLine.SetParent(this);
    }

    public void SetManager(CWordCruZManager v)
    {
        workmanager = v;
    }
    public boolean OnTouch(MotionEvent ev){

       if(ev.getAction() == MotionEvent.ACTION_DOWN)
       {
           int selX = (int)ev.getX();
           int selY = (int)ev.getY();
       }
        return WordCruZDrawLine.OnTouchMe(ev);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        //white circle
        super.onDraw(canvas);
        ButtonManager.DrawMe(paint,canvas);
        WordCruZDrawLine.onDrawMe(canvas);
    }

    public boolean GoodAnswer(String word){
        return workmanager.GoodAnswer(word);
    }
    //protected void onCreate(Bundle savedInstanceState){
    //super.onCreate(savedInstanceState);

    //}
}
