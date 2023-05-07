package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ListView lv;

    TextView lbSalir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lbSalir = (TextView) findViewById(R.id.textView6);
        lv = (ListView) findViewById(R.id.listView);

        ArrayList<String> listaNombre = new ArrayList<>();
        listaNombre.add("Jason Sudeikis");
        listaNombre.add("Sarah Niles");
        listaNombre.add("Nick Mohammed");
        listaNombre.add("Brendan Hunt");
        listaNombre.add("Brett Goldstein");
        listaNombre.add("Phil Dunster");
        listaNombre.add("Jeremy Swift");
        listaNombre.add("Juno Temple");
        listaNombre.add("Hannah Waddingham");

        ArrayAdapter ad = new ArrayAdapter(MainActivity2.this,
                android.R.layout.simple_list_item_1,
                listaNombre);

        lv.setAdapter(ad);

        lbSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Saliendo");
                finish();
            }
        });



        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                System.out.println("" +i);
                System.out.println(adapterView.getItemAtPosition(i).toString());
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("id", "" +i);
                intent.putExtra("name", adapterView.getItemAtPosition(i).toString());
                startActivity(intent);

            }
        });

    }
}