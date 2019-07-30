package com.example.school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_layout);

        // Menambahkan data ke dalam Spinner
        String list[] = {"+62","+60","+63","+66","+65","+673","+84","+855","+95","+856","+670","+675"};
        Spinner spinner = (Spinner) findViewById(R.id.cmb_telpon);
        ArrayAdapter<String> AdapterList = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        spinner.setAdapter(AdapterList);
    }

    public void register(View view) {
        Intent i = new Intent(MainActivity.this, ListActivity.class);
        startActivity(i);
    }
}
