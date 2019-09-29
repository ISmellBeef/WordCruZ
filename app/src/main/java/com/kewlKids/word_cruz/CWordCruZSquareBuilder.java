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
    //making the paint and rect
    Paint rect_def = new Paint();

    CWordCruZSquareBuilder(Context c) {
        super(c);
    }

    
    public void onDraw(Canvas canvas) {

        super.onDraw(canvas);
        Rect rect = new Rect();
        //defining the rectangle
       rect_def.setAntiAlias(true);
       rect_def.setColor(Color.RED);
       rect_def.setStyle(Paint.Style.STROKE);
       rect_def.setStrokeWidth(3);
       rect.set(10,10,40,40);
       canvas.drawRect(rect, rect_def);

    }


}





