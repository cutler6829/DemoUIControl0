package com.example.demouicontrol;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListViewEx extends AppCompatActivity implements AdapterView.OnItemClickListener {
   String[] array ={"葷食","素食","兩者皆可"};
    ListView listView;
    @Override
    protected  void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        listView =findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_single_choice,array);
        listView.setAdapter(adapter);
        //listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);可以直接在layout設定

        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,((TextView)view).getText().toString(),Toast.LENGTH_LONG).show();
    }
}
