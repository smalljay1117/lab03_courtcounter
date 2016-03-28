package com.example.android.lab03_courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
//    private int scoreTeamA;
//    private int scoreTeamB;
    private CourtCounterFragment teamA;
    private CourtCounterFragment teamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
//        setFragmentTeamName();
        teamA = (CourtCounterFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_team_a);
        teamB = (CourtCounterFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_team_b);

        String team_a_name = getString(R.string.team_a_name);
        String team_b_name = getString(R.string.team_b_name);

        teamA.setTeamName(team_a_name);
        teamB.setTeamName(team_b_name);

        teamA.setTeamLogo(R.drawable.team_a_logo);
        teamB.setTeamLogo(R.drawable.team_b_logo);
    }

    public void resetScoreView(View view) {
//        scoreTeamA = 0;
//        scoreTeamB = 0;

        teamA.resetscore();
        teamB.resetscore();
    }


//    public void addThreePoints(View view) {
////        CourtCounterFragment fragment_team_a = (CourtCounterFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_team_a);
////        fragment_team_a.m_tv_team_score.setText("3");

//        LinearLayout linearLayout = (LinearLayout)view.getParent();
//        TextView tv_team_score = (TextView)linearLayout.findViewById(R.id.tv_team_score);
//        int score = Integer.parseInt(tv_team_score.getText().toString());
//        tv_team_score.setText(String.valueOf(score + 3));
//    }

//    public void setFragmentTeamName() {
//        teamA = (CourtCounterFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_team_a);
//        teamB = (CourtCounterFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_team_b);
//
//        teamA.setTeamName("黃蜂");
//        teamB.setTeamName("火箭");
//    }
}



