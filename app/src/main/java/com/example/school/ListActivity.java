package com.example.school;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class ListActivity extends AppCompatActivity {
    ListView listView;
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_layout);

        // Menambahkan data ke dalam Spinner
        listView = (ListView) findViewById(R.id.listView);
        adapter = ArrayAdapter.createFromResource(this,R.array.siswa,android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);
    }
}
