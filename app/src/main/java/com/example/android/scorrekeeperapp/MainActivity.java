package com.example.android.scorrekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int Scorefottball;
    int Scorebasketball;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*when the team win

     */
    public void Win(View v)
    {
        Scorefottball=Scorefottball+3;
        displayForFootball(Scorefottball);
    }

    /*when the team Draw

     */
    public void Draw(View v)
    {
        Scorefottball=Scorefottball+1;
        displayForFootball(Scorefottball);
    }
    /*when the team Lose

     */
    public void Lose(View v)
    {
        Scorefottball=Scorefottball+0;
        displayForFootball(Scorefottball);
    }
    /**
     * Displays the given score for fotball.
     */
    public void displayForFootball(int score) {
        TextView scoreView = (TextView) findViewById(R.id.football);
        scoreView.setText(String.valueOf(score));
    }
    /*win one Run

     */
    public void oneRun(View v)
    {
        Scorebasketball=Scorebasketball+1;
        displayForBasketball(Scorebasketball);
    }
    /*win two Runs

     */
    public void twoRunS(View v)
    {
        Scorebasketball=Scorebasketball+2;
        displayForBasketball(Scorebasketball);
    }
    /*win three Runs

     */
    public void threeRuns(View v)
    {
        Scorebasketball=Scorebasketball+3;
        displayForBasketball(Scorebasketball);
    }
    /**
     * Displays the given score for Basketball.
     */
    public void displayForBasketball(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Basketball);
        scoreView.setText(String.valueOf(score));
    }
/*reset app
 */
public void resetScore(View v)
{
    Scorebasketball=0;
    Scorefottball=0;
    displayForFootball(Scorefottball);
    displayForBasketball(Scorebasketball);
}
}
