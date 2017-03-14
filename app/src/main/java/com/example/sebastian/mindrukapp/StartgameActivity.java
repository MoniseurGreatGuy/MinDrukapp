package com.example.sebastian.mindrukapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class StartgameActivity extends AppCompatActivity {

    private List<Alkoholiker> alkoholikerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startgame);

        alkoholikerList = new ArrayList<>();

    }

}
