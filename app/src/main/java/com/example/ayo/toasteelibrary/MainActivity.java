package com.example.ayo.toasteelibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {

        Toast.coloredToast(this,"sample message",
                android.widget.Toast.LENGTH_LONG,
                R.drawable.background,20,20,20,20);
    }

    public void showToastord(View view) {
        Toast.ordinaryToast(this, android.widget.Toast.LENGTH_LONG, "ORDINARY MESSAGE");
    }
}
