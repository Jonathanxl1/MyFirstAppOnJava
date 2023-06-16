package com.example.myfirstapponjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView firstText = findViewById(R.id.myApp);
        firstText.setText("La suma en total es: "+suma(1,90));
    }

    @Override
    protected void onResume() {
        super.onResume();
        int time = Toast.LENGTH_LONG;
        Toast.makeText(getApplicationContext(),"Resume state App",time).show();


    }

    public static String suma(int value1, int value2){
        return String.valueOf(value1 + value2);
    }
}