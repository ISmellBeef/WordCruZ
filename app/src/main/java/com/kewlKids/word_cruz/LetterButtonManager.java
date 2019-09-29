package com.kewlKids.word_cruz;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

import java.util.ArrayList;
import java.util.Iterator;
public class LetterButtonManager {
    private ArrayList<LetterButton> LetterButtonList = new ArrayList<LetterButton>();

    public ArrayList<LetterButton> getLetterButtArrayList(){
        return LetterButtonList;
    }
    public void AddLetterButton(Rect r, char l) {
        LetterButtonList.add(new LetterButton(r,l));
    }
    public void DrawMe(Paint paint, Canvas canvas){
        Iterator<LetterButton> iter = LetterButtonList.iterator();
        while(iter.hasNext()){
            LetterButton button = iter.next();
            button.DrawMe(paint,canvas);

        }
    }
}
