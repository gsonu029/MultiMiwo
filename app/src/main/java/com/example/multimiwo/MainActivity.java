package com.example.multimiwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set the layout of main activity
        setContentView(R.layout.activity_main);

        //find the view that shows number Activity
        TextView numbers= (TextView) findViewById(R.id.numbers);
        //set the ClickListener on that view
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numberIntent = new Intent(MainActivity.this,NumbersActivity.class);
                //start the new Activity
                startActivity(numberIntent);
            }
        });
        //find the view that shows FamilyActivity
        TextView family= (TextView) findViewById(R.id.family);
        //set the ClickListener on that view
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent FamilyIntent = new Intent(MainActivity.this,FamilyActivity.class);
                //start the new Activity
                startActivity(FamilyIntent);
            }
        });
        //find the view that shows ColorsActivity
        TextView colors= (TextView) findViewById(R.id.colors);
        //set the ClickListener on that view
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ColorsIntent = new Intent(MainActivity.this,ColorsActivity.class);
                //start the new Activity
                startActivity(ColorsIntent);
            }
        });
        //find the view that shows PhrasesActivity
        TextView phrase= (TextView) findViewById(R.id.phrases);
        //set the ClickListener on that view
        phrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent PhrasesIntent = new Intent(MainActivity.this,PhrasesActivity.class);
                //start the new Activity
                startActivity(PhrasesIntent);
            }
        });



        //

    }

    // we are doing the View by java code only so avoid this which we were using in Just Java
//    public void openNumbersList(View view) {
//        Intent i= new Intent(this,NumbersActivity.class);
//        startActivity(i);
//    }
}
