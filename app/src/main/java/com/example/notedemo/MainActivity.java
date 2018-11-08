package com.example.notedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity{
    EditText ed;
    Button button;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button);
        ed = (EditText)findViewById(R.id.edit);
        adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1);
        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);//关联适配器
        adapter.add("看电影");
        adapter.add("听歌");
        adapter.add("看书");
        adapter.add("吃饭");
        adapter.add("散步");
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String add = ed.getText().toString();
                adapter.add(add);
            }
        });
    }

//    @Override
//    public void onClick(View v) {
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1);
//        String add = ed.getText().toString();
//        adapter.add(add);
//        //ListView listView = (ListView)findViewById(R.id.list_view);
//        //listView.setAdapter(adapter);//关联适配器
//    }
}
