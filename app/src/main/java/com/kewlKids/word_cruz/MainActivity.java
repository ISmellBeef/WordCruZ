package com.kewlKids.word_cruz;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    CWordCruZSquareBuilder SquareView;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //hey julian this is my program
        SquareView = new CWordCruZSquareBuilder(this);
        SquareView.setBackgroundColor(Color.WHITE);
        setContentView(SquareView);

        setContentView(R.layout.activity_main);

        CWordCruZInputLtrCrcl view = new CWordCruZInputLtrCrcl(this);

        this.setContentView(view);

        //SquareView = new CWordCruZSquareBuilder(this);
        //setContentView(SquareView);
    }
}
