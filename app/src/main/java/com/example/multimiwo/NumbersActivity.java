package com.example.multimiwo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;
    private MediaPlayer.OnCompletionListener complete= new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //getSupportActionBar().setTitle("Numbers");
        final ArrayList<Word> words=new ArrayList<Word>();
        words.add(new Word("One","lutti",R.drawable.number_one,R.raw.number_one));
        words.add(new Word("Two", "otiiko",R.drawable.number_two,R.raw.number_two));
        words.add(new Word("Three", "tolookosu",R.drawable.number_three,R.raw.number_three));
        words.add(new Word("Four", "oyyisa",R.drawable.number_four,R.raw.number_four));
        words.add(new Word("Five", "massokka",R.drawable.number_five,R.raw.number_five));
        words.add(new Word("Six", "temmokka",R.drawable.number_six,R.raw.number_six));
        words.add(new Word("Seven", "kenekaku",R.drawable.number_seven,R.raw.number_seven));
        words.add(new Word("Eight", "kawinta",R.drawable.number_eight,R.raw.number_eight));
        words.add(new Word("Nine", "wo’e",R.drawable.number_nine,R.raw.number_nine));
        words.add(new Word("Ten", "na’aacha",R.drawable.number_ten,R.raw.number_ten));
/*      TextView wordView= new TextView(this);
        wordView.setText(words.get(0));
        rootView.addView(wordView);
        TextView wordView1= new TextView(this);
        wordView1.setText(words.get(1));
        rootView.addView(wordView1);*/
        // for better memory use we are using ListView instead of LinearLayout
       /* int Index=0;
        for(int i=0;i<words.size();i++)
        {
            TextView wordView= new TextView(this);
            wordView.setText(words.get(Index));
            rootView.addView(wordView);
            Index++;
        }*/
        WordAdapter adapter= new WordAdapter(this,words,R.color.category_numbers);
        ListView listView=(ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        // add the music file code
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word word = words.get(i);
                releaseMediaPlayer();
                mMediaPlayer = MediaPlayer.create(NumbersActivity.this,word.getAudioResouseId());
                mMediaPlayer.start();
                mMediaPlayer.setOnCompletionListener(complete);
            }
        });





    }

    @Override
    protected void onStop() {
        super.onStop();
        // When the activity is stopped, release the media player resources because we won't
        // be playing any more sounds.
        releaseMediaPlayer();
    }

    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;
        }
    }



}
