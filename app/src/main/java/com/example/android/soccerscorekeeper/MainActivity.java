package com.example.android.soccerscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int foulScoreTeamA = 0;
    int yellowScoreTeamA = 0;
    int redScoreTeamA = 0;

    int scoreTeamB = 0;
    int foulScoreTeamB = 0;
    int yellowScoreTeamB = 0;
    int redScoreTeamB = 0;

    // Initialize view
    TextView scoreView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);

    }

    /**
     * Add One Goal For Team A.
     */
    public void addOneGoalForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Add One Foul For Team A.
     */
    public void addOneFoulForTeamA(View v) {
        foulScoreTeamA = foulScoreTeamA + 1;
        displayFoulForTeamA(foulScoreTeamA);
    }

    /**
     * Add One Yellow Card For Team A
     */
    public void addOneYellowCardForTeamA(View v) {
        yellowScoreTeamA = yellowScoreTeamA + 1;
        displayYellowForTeamA(yellowScoreTeamA);
    }

    /**
     * Add One Red Card For Team A
     */
    public void addOneRedCardForTeamA(View v) {
        redScoreTeamA = redScoreTeamA + 1;
        displayRedForTeamA(redScoreTeamA);
    }


    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneGoalForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Add One Foul For Team A.
     */
    public void addOneFoulForTeamB(View v) {
        foulScoreTeamB = foulScoreTeamB + 1;
        displayFoulForTeamB(foulScoreTeamB);
    }

    /**
     * Add One Yellow Card For Team B
     */
    public void addOneYellowCardForTeamB(View v) {
        yellowScoreTeamB = yellowScoreTeamB + 1;
        displayYellowForTeamB(yellowScoreTeamB);
    }

    /**
     * Add One Red Card For Team B
     */
    public void addOneRedCardForTeamB(View v) {
        redScoreTeamB = redScoreTeamB + 1;
        displayRedForTeamB(redScoreTeamB);
    }


    /**
     * Reset the Score to 0 when "RESET" button press
     */

    public void resetScoreToZero(View v) {
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        foulScoreTeamA = 0;
        displayFoulForTeamA(foulScoreTeamA);
        yellowScoreTeamA = 0;
        displayYellowForTeamA(yellowScoreTeamA);
        redScoreTeamA = 0;
        displayRedForTeamA(redScoreTeamA);

        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
        foulScoreTeamB = 0;
        displayFoulForTeamB(foulScoreTeamB);
        yellowScoreTeamB = 0;
        displayYellowForTeamB(yellowScoreTeamB);
        redScoreTeamB = 0;
        displayRedForTeamB(redScoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given foul score for Team A.
     */
    public void displayFoulForTeamA(int score) {
        scoreView = (TextView) findViewById(R.id.team_a_foul_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given yellow score for Team A.
     */
    public void displayYellowForTeamA(int score) {
        scoreView = (TextView) findViewById(R.id.team_a_yellow_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given red score for Team A.
     */
    public void displayRedForTeamA(int score) {
        scoreView = (TextView) findViewById(R.id.team_a_red_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given foul score for Team B.
     */
    public void displayFoulForTeamB(int score) {
        scoreView = (TextView) findViewById(R.id.team_b_foul_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given yellow score for Team B.
     */
    public void displayYellowForTeamB(int score) {
        scoreView = (TextView) findViewById(R.id.team_b_yellow_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given red score for Team B.
     */
    public void displayRedForTeamB(int score) {
        scoreView = (TextView) findViewById(R.id.team_b_red_score);
        scoreView.setText(String.valueOf(score));
    }
}