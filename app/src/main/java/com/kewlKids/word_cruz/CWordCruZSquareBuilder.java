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

import java.util.ArrayList;
import java.util.Iterator;



public class CWordCruZSquareBuilder extends View{
    CWordCruZManager workmanager = null;
    ArrayList<LetterSquareList>  LetterSquareListArray = new   ArrayList<LetterSquareList>();
    Paint rect_def = new Paint();
    CWordCruZSquareBuilder(Context c) {
        super(c);
    }
    public void SetManager(CWordCruZManager v)
    {
        workmanager = v;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Iterator<LetterSquareList> iter = LetterSquareListArray.iterator();
        while(iter.hasNext()){
            LetterSquareList l = iter.next();
            l.DrawMe(rect_def,canvas);
        }
    }
    boolean GoodAnswer(String word){
        Iterator<LetterSquareList> iter = LetterSquareListArray.iterator();
        while(iter.hasNext()) {
            LetterSquareList l = iter.next();
            if (l.GetWord().equals(word)) {
                l.OnAnswerCorrect();
                return true;
            }
        }
        return false;
    }

}





