package com.kewlKids.word_cruz;
import android.graphics.Rect;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
public class CWordCruZSquareBuilder extends View{
    CWordCruZManager workmanager = null;
    Paint rect_def = new Paint();
    CWordCruZSquareBuilder(Context c) {
        super(c);
    }
    public void SetManager(CWordCruZManager v)
    {
        workmanager = v;
    }
    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);
        rect_def.setAntiAlias(true);
        rect_def.setColor(Color.RED);
        rect_def.setStyle( Paint.Style.STROKE );
        rect_def.setStrokeWidth( 15 );
        canvas.drawRect(70, 70, 230, 230, rect_def);
    }

}





