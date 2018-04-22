package com.example.jokerandroidlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class JokerActivity extends AppCompatActivity {

    private static final String LOG_TAG = JokerActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(LOG_TAG, "Entering onCreate");
        setContentView(R.layout.activity_joker);

        TextView mainJokeView = findViewById(R.id.main_joke_view);

        Intent intent = getIntent();
        if (intent != null) {
            if (intent.hasExtra(Constants.JOKE)) {
                //mainJokeView.setText(intent.getStringExtra(Constants.JOKE));
                Toast.makeText(this, intent.getStringExtra(Constants.JOKE), Toast.LENGTH_LONG).show();

                /*MainActivityFragment mainActivityFragment = new MainActivityFragment();
                Bundle bundle = new Bundle();
                bundle.putString(Constants.JOKE, intent.getStringExtra(Constants.JOKE));
                mainActivityFragment.setArguments(bundle);
                getSupportFragmentManager().beginTransaction().add(R.id.fragment, mainActivityFragment).commit();*/

            }
        }
        Log.v(LOG_TAG, "Leaving onCreate");

    }

}
