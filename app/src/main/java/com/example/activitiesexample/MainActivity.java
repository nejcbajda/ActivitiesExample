package com.example.activitiesexample;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_COUNT = "count";

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);
    }

    public void countUp(View view) {
        mCount++;
        mShowCount.setText(String.valueOf(mCount));
    }

    public void goToHello(View view) {
        Intent intent = new Intent(this, HelloActivity.class);
        intent.putExtra(EXTRA_COUNT, mCount);
        startActivity(intent);
    }

    public void goToThird(View view) {
        Intent intent = new Intent(this, ThirdActivity.class);
        intent.putExtra(EXTRA_COUNT, mCount);
        startActivity(intent);
    }
}