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

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CWordCruZSquareBuilder Squareview = new CWordCruZSquareBuilder(this);

        this.setContentView(Squareview);

        setContentView(R.layout.activity_main);

        CWordCruZInputLtrCrcl view = new CWordCruZInputLtrCrcl(this);

        this.setContentView(view);

        //SquareView = new CWordCruZSquareBuilder(this);
        //setContentView(SquareView);
    }
}
