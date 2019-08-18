package com.kewlKids.word_cruz;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class CWordCruZInputLtrCrcl extends View {

    Paint paint = new Paint();

    CWordCruZInputLtrCrcl(Context c) {
        super(c);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        //white circle
        super.onDraw(canvas);
        paint.setAntiAlias(true);
        paint.setColor(Color.WHITE);
        canvas.drawCircle(250, 250, 250, paint);
    }

    //protected void onCreate(Bundle savedInstanceState){
    //super.onCreate(savedInstanceState);

    //}
}
