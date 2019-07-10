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
        paint.setStyle(Paint.Style.FILL);


        paint.setColor(Color.WHITE);
        canvas.drawPaint(paint);


        paint.setAntiAlias(false);
        paint.setColor(Color.BLUE);
        canvas.drawCircle(20, 20, 15, paint);


        paint.setAntiAlias(true);
        paint.setColor(Color.GREEN);
        canvas.drawCircle(60, 20, 15, paint);


        paint.setAntiAlias(false);
        paint.setColor(Color.RED);
        canvas.drawRect(100, 5, 200, 30, paint);


        canvas.rotate(-45);

        paint.setStyle(Paint.Style.FILL);
        canvas.drawText("Graphics Rotation", 40, 180, paint);


        canvas.restore();
    }



    public void DrawSquare(Canvas canvas) {
        paint.setColor(Color.RED);
        paint.setStrokeWidth(3);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(80, 80, 80, 80, paint);
    }


}
