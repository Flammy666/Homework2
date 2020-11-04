package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public void ThirdPage(View view){
        Intent thirdPageIntent = new Intent(this, ThirdActiviti.class);
        startActivity(thirdPageIntent);
    }


    public void NextPage(View view){
        Intent secondPageIntent = new Intent(this, Second.class);
        startActivity(secondPageIntent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}