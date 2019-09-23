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
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private CWordCruZManager manager = new CWordCruZManager();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout ln = (LinearLayout) this.findViewById(R.id.lnLayout);

        CWordCruZInputLtrCrcl view = (CWordCruZInputLtrCrcl) ln.findViewById(R.id.id_WordCruZInputLtrCrcl);

        view.SetManager(manager);

        CWordCruZSquareBuilder SquareView = (CWordCruZSquareBuilder) ln.findViewById(R.id.id_WordCruZSquareBuilder);

        SquareView.SetManager(manager);

        //SquareView = new CWordCruZSquareBuilder(this);
        //setContentView(SquareView);
    }
}

