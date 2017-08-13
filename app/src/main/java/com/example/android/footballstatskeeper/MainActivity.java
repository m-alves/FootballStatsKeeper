package com.example.android.footballstatskeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private int mGoalsTeamA;

    private int mGoalsTeamB;

    private int mFoulsTeamA;

    private int mFoulsTeamB;

    private int mCornersTeamA;

    private int mCornersTeamB;

    @BindView(R.id.goals_team_A) TextView mTextGoalsTeamA;

    @BindView(R.id.goals_team_B) TextView mTextGoalsTeamB;

    @BindView(R.id.fouls_team_A) TextView mTextFoulsTeamA;

    @BindView(R.id.fouls_team_B) TextView mTextFoulsTeamB;

    @BindView(R.id.corners_team_A) TextView mTextCornersTeamA;;

    @BindView(R.id.corners_team_B) TextView mTextCornersTeamB;

    private final String RESET_VALUE = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mTextGoalsTeamA.setText(RESET_VALUE);
        mTextGoalsTeamB.setText(RESET_VALUE);
        mTextFoulsTeamA.setText(RESET_VALUE);
        mTextFoulsTeamB.setText(RESET_VALUE);
        mTextCornersTeamA.setText(RESET_VALUE);
        mTextCornersTeamB.setText(RESET_VALUE);
    }

    public void scoredTeamA(View view){
        mGoalsTeamA = Integer.parseInt(mTextGoalsTeamA.getText().toString());
        mGoalsTeamA += 1;
        mTextGoalsTeamA.setText(Integer.toString(mGoalsTeamA));
    }

    public void scoredTeamB(View view){
        mGoalsTeamB = Integer.parseInt(mTextGoalsTeamB.getText().toString());
        mGoalsTeamB += 1;
        mTextGoalsTeamB.setText(Integer.toString(mGoalsTeamB));
    }

    public void addFoulTeamA(View view){
        mFoulsTeamA = Integer.parseInt(mTextFoulsTeamA.getText().toString());
        mFoulsTeamA += 1;
        mTextFoulsTeamA.setText(Integer.toString(mFoulsTeamA));
    }

    public void addFoulTeamB(View view){
        mFoulsTeamB = Integer.parseInt(mTextFoulsTeamB.getText().toString());
        mFoulsTeamB += 1;
        mTextFoulsTeamB.setText(Integer.toString(mFoulsTeamB));
    }

    public void addCornerTeamA(View view){
        mCornersTeamA = Integer.parseInt(mTextCornersTeamA.getText().toString());
        mCornersTeamA += 1;
        mTextCornersTeamA.setText(Integer.toString(mCornersTeamA));
    }

    public void addCornerTeamB(View view){
        mCornersTeamB = Integer.parseInt(mTextCornersTeamB.getText().toString());
        mCornersTeamB += 1;
        mTextCornersTeamB.setText(Integer.toString(mCornersTeamB));
    }

    public void reset(View view){
        mTextGoalsTeamA.setText(RESET_VALUE);
        mTextGoalsTeamB.setText(RESET_VALUE);
        mTextFoulsTeamA.setText(RESET_VALUE);
        mTextFoulsTeamB.setText(RESET_VALUE);
        mTextCornersTeamA.setText(RESET_VALUE);
        mTextCornersTeamB.setText(RESET_VALUE);
    }
}
