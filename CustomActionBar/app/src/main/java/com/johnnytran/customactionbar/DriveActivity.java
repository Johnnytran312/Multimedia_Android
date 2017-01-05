package com.johnnytran.customactionbar;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import static com.johnnytran.customactionbar.R.drawable.ic_pause_circle_outline_black_36dp;

public class DriveActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnPre, btnPlay, btnNext, btnSuf, btnRepeat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drive);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);

        btnNext = (Button) findViewById(R.id.buttonNext);
        btnPlay = (Button) findViewById(R.id.buttonPlay);
        btnPre = (Button) findViewById(R.id.buttonPre);
        btnRepeat = (Button) findViewById(R.id.buttonRepeat);
        btnSuf = (Button) findViewById(R.id.buttonSuf);

        btnPlay.setOnClickListener(this);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == btnPlay.getId()){
            //btnPlay.setBackground(ic_pause_circle_outline_black_36dp);
        }
    }
}
