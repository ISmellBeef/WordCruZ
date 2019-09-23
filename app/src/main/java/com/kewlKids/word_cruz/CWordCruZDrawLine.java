package com.kewlKids.word_cruz;
import android.view.*;
import android.graphics.*;
public class CWordCruZDrawLine
{
    private Paint paint = new Paint();
    private CWordCruZInputLtrCrcl ParentView = null;

    public boolean OnTouchMe(MotionEvent ev)
    {
        return true;
    }
    public void SetParent(CWordCruZInputLtrCrcl v){
        ParentView = v;
    }
    public void onDrawMe(Canvas canvas) {
        paint.setAntiAlias(true);
        paint.setColor(Color.GREEN);
        canvas.drawLine(0,0,100,100,paint);
    }

}
