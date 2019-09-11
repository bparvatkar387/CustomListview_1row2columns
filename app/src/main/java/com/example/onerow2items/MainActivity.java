package com.example.onerow2items;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);

        ArrayList<Details> details = new ArrayList<Details>();
        details.add(new Details("Bhavesh", "123"));
        details.add(new Details("Raj", "123"));
        details.add(new Details("Suraj", "123"));
        details.add(new Details("Div", "123"));

        DetailsListAdapter detailsListAdapter = new DetailsListAdapter(this, R.layout.onerow_twoitems, details);
        listView.setAdapter(detailsListAdapter);
    }
}
