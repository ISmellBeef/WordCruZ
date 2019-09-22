package com.kewlKids.word_cruz;
import android.view.*;
import android.graphics.*;
public class CWordCruZDrawLine
{
    View view = new View();
    Paint paint = new Paint();
    public void LineDragPro(Canvas canvas)
    {
        paint.setAntiAlias(true);
        paint.setColor(Color.GREEN);
        canvas.drawLine(0,0,100,100,paint);
    }

}
