package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText user;
    EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);
        user = (EditText) findViewById(R.id.editTextTextPersonName);
        pass = (EditText)  findViewById(R.id.editTextTextPassword);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_click(v);
            }
        });
    }

    public void btn_click(View v){
        if(user.getText().toString().equals("root") &&
                pass.getText().toString().equals("root")){
            //Toast.makeText(this, "Ok", Toast.LENGTH_LONG).show();
            /*Conectarnos a otor MainActivity*/
            Intent i = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(i);
        }else{
            user.setText("");
            pass.setText("");
            Toast.makeText(this, "Error usuario no valido", Toast.LENGTH_SHORT).show();
        }
    }
}