package com.example.user.mission;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;
import android.view.Window;


public class IntroActivity extends AppCompatActivity {
        private Handler event_Handler;
        private Runnable    activity_Runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.intro);

        activity_Runnable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), Main_screenActivity.class);
                startActivity(intent);
                finish();
            }
        };
        event_Handler = new Handler();
        event_Handler.postDelayed(activity_Runnable, 2500);
    }

}
