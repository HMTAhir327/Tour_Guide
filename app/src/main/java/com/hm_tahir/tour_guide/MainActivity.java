package com.hm_tahir.tour_guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btnLahore);

    }

    public void toLahore(View v) {
        Intent objectIntent = new Intent(this, Lahore.class);
        startActivity(objectIntent);
    }




}

