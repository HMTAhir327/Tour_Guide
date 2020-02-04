package com.hm_tahir.tour_guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Lahore extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lahore);
    }
    public void toMain(View v) {
        Intent objectIntent = new Intent(this, MainActivity.class);
        startActivity(objectIntent);
    }

}
