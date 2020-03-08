package com.example.customtablayoutwithviewpager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView = (ListView) findViewById(R.id.list);
        String name[] = getResources().getStringArray(R.array.item);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.simple, R.id.simpleid, name);
        listView.setAdapter(arrayAdapter);
    }
}
