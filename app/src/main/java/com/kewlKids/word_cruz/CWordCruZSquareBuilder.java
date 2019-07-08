package com.kewlKids.word_cruz;
        import android.os.Bundle;
        import android.app.Activity;
        import android.view.Menu;
        import android.content.Context;
        import android.graphics.Canvas;
        import android.graphics.Color;
        import android.graphics.Paint;
        import android.view.View;
public class CWordCruZSquareBuilder {


    Paint paint = new Paint();


    public void onDraw(Canvas canvas) {
        paint.setColor(Color.RED);
        paint.setStrokeWidth(3);
        canvas.drawRect(30, 30, 80, 80, paint);
    }
}
