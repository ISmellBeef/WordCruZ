package com.kewlKids.word_cruz;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

import java.util.ArrayList;
import java.util.Iterator;
public class LetterSquareList {
    private ArrayList<LetterSquare> SquareList = new ArrayList<LetterSquare>();
    private String Word;
    public ArrayList<LetterSquare> getLetterButtArrayList(){
        return SquareList;
    }
    public void AddSquareButton(String w,Rect r) {

        Word = w;
        for(int index = 0; index < Word.length();index++) {
            Rect curRect = new Rect();
            //Set Rect of
            SquareList.add(new LetterSquare(curRect, ' '));
        }
    }
    public String GetWord(){
        return Word;
    }
    public void OnAnswerCorrect(){
        int  index = 0;
        Iterator<LetterSquare> iter = SquareList.iterator();
        while(iter.hasNext()){
            LetterSquare button = iter.next();
            button.setLetter(Word.charAt(index));
            index++;
        }
    }

    public void DrawMe(Paint paint, Canvas canvas){
        Iterator<LetterSquare> iter = SquareList.iterator();
        while(iter.hasNext()){
            LetterSquare button = iter.next();
            button.DrawMe(paint,canvas);
        }
    }
}
