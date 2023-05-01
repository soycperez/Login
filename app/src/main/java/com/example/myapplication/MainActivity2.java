package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

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
        listaNombre.add("Abraham");
        listaNombre.add("Azael");
        listaNombre.add("Christian");
        listaNombre.add("David");
        listaNombre.add("Erika");
        listaNombre.add("Gabriel");
        listaNombre.add("Erika");
        listaNombre.add("Jonathan");
        listaNombre.add("Luis");
        listaNombre.add("Jose");
        listaNombre.add("Martin");
        listaNombre.add("Manuel");
        listaNombre.add("Ramiro");
        listaNombre.add("Yahir");
        listaNombre.add("Eduardo");

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

            }
        });

    }
}