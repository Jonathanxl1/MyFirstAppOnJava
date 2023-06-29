package com.example.myfirstapponjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnChangeView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btnChangeView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent secondView = new Intent(getApplicationContext(), SecondScreen.class);
                        startActivity(secondView);
                    }
                }
        );
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

    private void init(){
        btnChangeView = (Button) findViewById(R.id.changeView);
    }
}