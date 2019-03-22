package com.gkr.demoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.gkr.gktoast.GkToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnError = (Button) findViewById(R.id.btn_error);
        btnError.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GkToast.error(getApplicationContext(), "Oohh Noooo!!");
            }
        });

        Button btnSuccess = (Button) findViewById(R.id.btn_success);
        btnSuccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GkToast.success(getApplicationContext(), "Oohh Yesss!!");
            }
        });
    }
}
