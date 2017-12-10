package com.leezhengqingoutlook.contacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
   private ListView listView;
    private MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= (ListView) findViewById(R.id.lv);
        adapter=new MyAdapter(GetNumber.list,this);
        listView.setAdapter(adapter);
        GetNumber.getNumber(this);
    }
}
