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


    Paint square_def = new Paint();
    public  CWordCruZSquareBuilder(Context context){
        super(context);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Rect My_Square = new Rect();
        My_Square.set(80, 80, 80, 80);

        square_def.setColor(Color.RED);
        square_def.setStrokeWidth(3);
        square_def.setStyle(Paint.Style.STROKE);

        canvas.drawRect(My_Square, square_def);


    }
}






