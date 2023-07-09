package com.example.ratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RatingBar ratingBar;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonClick();
    }
    public void addListenerOnButtonClick(){
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        button = (Button) findViewById(R.id.button);
        //perfforming action
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //getting the rating value and displaying it on toast
                String rating = String.valueOf(ratingBar.getRating());
                Toast.makeText(MainActivity.this, rating, Toast.LENGTH_SHORT).show();
            }
        });
    }
}