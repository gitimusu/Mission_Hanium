package com.example.user.mission;

//import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
//import android.support.v7.widget.Toolbar;
//import android.widget.Toast;
/*
 * Created by user on 2017-03-30.
 */

public class Main_screenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_screen);
    }
     //   Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
     //   setSupportActionBar(mToolbar);

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater mMenuInflater = getMenuInflater();
        mMenuInflater.inflate(R.menu.my_menu, menu);

        return true;
    }

}