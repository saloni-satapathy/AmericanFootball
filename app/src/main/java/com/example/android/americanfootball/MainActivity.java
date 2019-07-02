package com.example.android.americanfootball;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the score for Team A by 6 points
     */
    public void addSixForTeamA(View v) {
        scoreTeamA = scoreTeamA+6;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the score for TeamA by two points for safety
     */
    public void addTwoSForTeamA(View v) {
        scoreTeamA = scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamB(View v) {
        scoreTeamB = scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the score for Team A by 6 points
     */
    public void addSixForTeamB(View v) {
        scoreTeamB = scoreTeamB+6;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the score for TeamA by two points for safety
     */
    public void addTwoSForTeamB(View v) {
        scoreTeamB = scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }


    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void reset(View v) {
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }


}
