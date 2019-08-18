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


    Paint paint = new Paint();

    CWordCruZSquareBuilder(Context c) {
        super(c);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        //white circle
        super.onDraw(canvas);
        paint.setAntiAlias(true);
        paint.setColor(Color.RED);
        canvas.drawCircle(400, 400, 200, paint);
    }

}






