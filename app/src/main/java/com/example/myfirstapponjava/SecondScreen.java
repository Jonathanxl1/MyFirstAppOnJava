package com.example.myfirstapponjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondScreen extends AppCompatActivity {
    TextView txtSecondApp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        txtSecondApp = (TextView) findViewById(R.id.viewSecondApp);
        txtSecondApp.setText("Hello from" + MainActivity.class.getSimpleName());

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast resumeApp = Toast.makeText(getApplicationContext(),"Resume Second App",Toast.LENGTH_LONG);
        resumeApp.show();

    }
}