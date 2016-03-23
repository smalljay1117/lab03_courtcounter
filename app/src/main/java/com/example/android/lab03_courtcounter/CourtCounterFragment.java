package com.example.android.lab03_courtcounter;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CourtCounterFragment extends Fragment implements View.OnClickListener {

    private TextView m_tv_team_name;
    private TextView m_tv_team_score;
    private Button m_btn_three_points;
    private Button m_btn_two_points;
    private Button m_btn_free_throw;

    public CourtCounterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_court_counter, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        m_tv_team_name = (TextView)getView().findViewById(R.id.tv_team_name);
        m_tv_team_score = (TextView)getView().findViewById(R.id.tv_team_score);

        m_btn_three_points = (Button)getView().findViewById(R.id.btn_three_points);
        m_btn_three_points.setOnClickListener(this);

        m_btn_two_points = (Button)getView().findViewById(R.id.btn_two_points);
        m_btn_two_points.setOnClickListener(this);

        m_btn_free_throw = (Button)getView().findViewById(R.id.btn_free_throw);
        m_btn_free_throw.setOnClickListener(this);
    }

//    public void threeScoreView(View view) {
//        int three_score = Integer.parseInt(m_tv_team_score.getText().toString());
//        m_tv_team_score.setText(String.valueOf(three_score + 3));
//    }
//
//    public void twoScoreView(View view) {
//        int two_score = Integer.parseInt(m_tv_team_score.getText().toString());
//        m_tv_team_score.setText(String.valueOf(two_score + 2));
//    }
//
//    public void freeThrowView(View view) {
//        int free_throw = Integer.parseInt(m_tv_team_score.getText().toString());
//        m_tv_team_score.setText(String.valueOf(free_throw + 1));
//    }

    public void addTeamScore(int score) {
        int teamscore = Integer.parseInt(m_tv_team_score.getText().toString());
        m_tv_team_score.setText(String.valueOf(teamscore + score));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_three_points:
//                int three_score = Integer.parseInt(m_tv_team_score.getText().toString());
//                m_tv_team_score.setText(String.valueOf(three_score + 3));
//                threeScoreView(v);
                addTeamScore(3);
                break;
            case R.id.btn_two_points:
//                int two_score = Integer.parseInt(m_tv_team_score.getText().toString());
//                m_tv_team_score.setText(String.valueOf(two_score + 2));
//                twoScoreView(v);
                addTeamScore(2);
                break;
            case R.id.btn_free_throw:
//                int free_throw = Integer.parseInt(m_tv_team_score.getText().toString());
//                m_tv_team_score.setText(String.valueOf(free_throw + 1));
//                freeThrowView(v);
                addTeamScore(1);
                break;
        }
    }

    public void resetscore() {
        m_tv_team_score.setText("0");
    }

    public void setTeamName(CharSequence teamname) {
        m_tv_team_name.setText(teamname);
    }
}
