package com.kewlKids.word_cruz;
        import android.os.Bundle;
        import android.app.Activity;
        import android.view.Menu;
        import android.content.Context;
        import android.graphics.Canvas;
        import android.graphics.Color;
        import android.graphics.Paint;
        import android.view.View;
public class CWordCruZSquareBuilder extends View{


    Paint paint = new Paint();
    public  CWordCruZSquareBuilder(Context context){
        super(context);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(Color.RED);
        paint.setStrokeWidth(3);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(80, 80, 80, 80, paint);
    }
}






