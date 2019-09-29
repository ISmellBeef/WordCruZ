package com.kewlKids.word_cruz;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

import java.util.ArrayList;
import java.util.Iterator;

public class LetterSquareList {
    private ArrayList<LetterSquare> SquareList = new ArrayList<LetterSquare>();

    public ArrayList<LetterSquare> getLetterButtArrayList(){
        return SquareList;
    }
    public void AddSquareButton(Rect r, char l) {
        SquareList.add(new LetterSquare(r,l));
    }
    public void DrawMe(Paint paint, Canvas canvas){
        Iterator<LetterSquare> iter = SquareList.iterator();
        while(iter.hasNext()){
            LetterSquare button = iter.next();
            button.DrawMe(paint,canvas);
        }
    }
}
