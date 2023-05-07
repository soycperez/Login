package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView tv;
    ImageView iv;
    EditText area;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tv = (TextView) findViewById(R.id.textView4);
        iv = (ImageView) findViewById(R.id.imageView3);
        area = (EditText) findViewById(R.id.editTextTextMultiLine);

        Bundle b = getIntent().getExtras();

        tv.setText(b.getString("name"));
        String foto = b.getString("id");
        if(foto.equals("0")){
            iv.setImageResource(R.drawable.a0);
            area.setText("PRUEA DE TEXTO \"LFKDJKDK\"");
        } else if (foto.equals("1")) {
            iv.setImageResource(R.drawable.a1);
            area.setText("PRUEA DE TEXTO \"LFKDJKDK\"");
        }else if (foto.equals("2")) {
            iv.setImageResource(R.drawable.a2);
            area.setText("PRUEA DE TEXTO \"LFKDJKDK\"");
        }else if (foto.equals("3")) {
            iv.setImageResource(R.drawable.a3);
            area.setText("PRUEA DE TEXTO \"LFKDJKDK\"");
        }else if (foto.equals("4")) {
            iv.setImageResource(R.drawable.a4);
            area.setText("PRUEA DE TEXTO \nLFKDJKDK\"");
        }else if (foto.equals("5")) {
            iv.setImageResource(R.drawable.a5);
            area.setText("PRUEA DE TEXTO \"LFKDJKDK\"");
        }else if (foto.equals("6")) {
            iv.setImageResource(R.drawable.a6);
            area.setText("PRUEA DE TEXTO \"LFKDJKDK\"");
        }else if (foto.equals("7")) {
            iv.setImageResource(R.drawable.a7);
            area.setText("PRUEA DE TEXTO \"LFKDJKDK\" \"LFKDJKDK\"");
        }else if (foto.equals("8")) {
            iv.setImageResource(R.drawable.a8);
            area.setText("PRUEA DE TEXTO \"LFKDJKDK\"");
        }

    }
}