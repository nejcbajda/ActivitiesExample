package com.example.activitiesexample;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    private int mCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        mCount = getIntent().getIntExtra(MainActivity.EXTRA_COUNT, 0);
        TextView showCount = findViewById(R.id.show_count);
        showCount.setText(String.valueOf(mCount));

        findViewById(R.id.main).setOnTouchListener(new OnSwipeTouchListener(this) {
            @Override
            public void onSwipeLeft() {
                launchMain();
            }

            @Override
            public void onSwipeRight() {
                launchHello();
            }
        });
    }

    public void goToMain(View view) {
        launchMain();
    }

    public void goToHello(View view) {
        launchHello();
    }

    private void launchMain() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }

    private void launchHello() {
        Intent intent = new Intent(this, HelloActivity.class);
        intent.putExtra(MainActivity.EXTRA_COUNT, mCount);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }


}