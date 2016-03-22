package com.example.android.lab03_courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private int scoreTeamA;
    private int scoreTeamB;
    private CourtCounterFragment m_fragment_team_a;
    private CourtCounterFragment m_fragment_team_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        setFragmentTeamName();
    }

    public void resetScoreView(View view) {
//        scoreTeamA = 0;
//        scoreTeamB = 0;

        m_fragment_team_a.resetscore();
        m_fragment_team_b.resetscore();
    }


//    public void addThreePoints(View view) {
////        CourtCounterFragment fragment_team_a = (CourtCounterFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_team_a);
////        fragment_team_a.m_tv_team_score.setText("3");
//        LinearLayout linearLayout = (LinearLayout)view.getParent();
//        TextView tv_team_score = (TextView)linearLayout.findViewById(R.id.tv_team_score);
//        int score = Integer.parseInt(tv_team_score.getText().toString());
//        tv_team_score.setText(String.valueOf(score + 3));
//    }

    public void setFragmentTeamName() {
        m_fragment_team_a = (CourtCounterFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_team_a);
        m_fragment_team_b = (CourtCounterFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_team_b);

        m_fragment_team_a.setTeamName("黃蜂");
        m_fragment_team_b.setTeamName("火箭");
    }
}



