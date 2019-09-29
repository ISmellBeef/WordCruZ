package com.kewlKids.word_cruz;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CWordCruZDictionnary {
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public String dicionnary(String dicfile)[] {
        String line = null;
        int a = 0;
        try {
            FileReader fileReader = new FileReader(dicfile);
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                a++;
            }

            String dic[] = new String[a];
            a = 0;
            FileReader fileReader1 = new FileReader(dicfile);
            BufferedReader bufferedReader1 =
                    new BufferedReader(fileReader1);
            while ((line = bufferedReader1.readLine()) != null) {
                dic[a] = line;
                a++;
            }
            bufferedReader.close();
            bufferedReader1.close();
            return dic;
        }
        catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + dicfile + "'");
            return null;
        } catch (IOException ex) {
            System.out.println("Error reading file '" + dicfile + "'");
            return null;
        }

    }
}

