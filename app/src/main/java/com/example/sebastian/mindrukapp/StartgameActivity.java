package com.example.sebastian.mindrukapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class StartgameActivity extends AppCompatActivity {

    private ArrayAdapter<String> arrayAdapter;
    private List<Alkoholiker> alkoholikerList;
    private ArrayList<String> deltagerList;
    private ListView showAlkoholikere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startgame);

        alkoholikerList = new ArrayList<>();

        final EditText addPersonBox = (EditText) findViewById(R.id.addPersonBox);

        showAlkoholikere = (ListView) findViewById(R.id.drunkList);
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, deltagerList);

        final Button addPersonButton = (Button) findViewById(R.id.addPersonButton);
        addPersonButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = addPersonBox.getText().toString();
                Alkoholiker s = new Alkoholiker(name);
                alkoholikerList.add(s);
                addPersonBox.setText("");
                deltagerList.add(s.getName());
                showDeltagere();
                Log.d("test", "test");
            }
        });
    }
    private void showDeltagere(){
        showAlkoholikere.setAdapter(arrayAdapter);
    }
}
