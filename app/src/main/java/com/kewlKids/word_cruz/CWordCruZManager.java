package com.kewlKids.word_cruz;
import java.util.Random;
public class CWordCruZManager {
    public int words (int list[])[]
    {
            Random rand = new Random(list.length);
            int wordnum = 6;
            int words[] = new int[wordnum];
            for (int a = 0; a < wordnum;a++)
            {
                words[a] = rand.nextInt();
            }
            return words;
    }
}
