package com.kewlKids.word_cruz;
import java.util.Random;
public class CWordCruZManager {
    public int Randomwords (int list[],int wordnum, int maxletter,int minletter)[]
    {
            Random rand = new Random(list.length);
            int words[] = new int[wordnum];
            for (int a = 0; a < wordnum;a++)
            {
                words[a] = rand.nextInt();
               // for (int i = 0; i <)

            }
            return words;
    }
    public String charUnion (String word1,String word2)
    {
        char wc1 [] = new char[word1.length()];
        char wc2 [] = new char[word2.length()];
        for (int a = 0;a < word1.length();a++)
            wc1[a] = word1.charAt(a);
        for (int a = 0;a < word1.length();a++)
            wc2[a] = word2.charAt(a);
        int n = 0;
        int min = (wc1.length < wc2.length)? wc1.length:wc2.length;
        char intersection [] = new char [min];
        for (int i = 0; i < wc1.length;i++)
        {
            for (int j = 0; j < wc2.length;j++)
            {
                if (wc1[i] == wc2[j])
                {
                    intersection[n] = wc1[i];
                    n++;
                }
            }
        }
        char union [] = new char[(wc1.length+wc2.length)-n];
        char total[] = new char[wc1.length+wc2.length];
        int count = 0;
        while (count < wc1.length)
        {
            total[count] = wc1[count];
        }
        count++;
        for (int i = 0; i < wc2.length;i++,count++)
        {
            total[count] = wc2[i];

        }
        count = 0;
        for (int i = 0;i < intersection.length;i++)
        {
            for (int j = 0; j < total.length;j++)
            {
                if (intersection[i]== total[j] )
                {
                    union[count] = intersection[i];
                }
            }
        }
        String get = union.toString();
        return get;
    }
}
