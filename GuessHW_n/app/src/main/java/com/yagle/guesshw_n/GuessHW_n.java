package com.yagle.guesshw_n;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class GuessHW_n extends AppCompatActivity {

    private TextView mSentence;
    private ImageView mAnswer;
    private ImageButton mScissors,mStone,mCloth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guess_hw_n);

        mSentence=(TextView)findViewById(R.id.eSentence);
        mAnswer=(ImageView)findViewById(R.id.eAnswer);
        mScissors=(ImageButton)findViewById(R.id.eScissors);
        mStone=(ImageButton)findViewById(R.id.eStone);
        mCloth=(ImageButton)findViewById(R.id.eCloth);

        mScissors.setOnClickListener(eScissorsOnClick);
        mStone.setOnClickListener(eStoneOnClick);
        mCloth.setOnClickListener(eClothOnClick);
    }

    private View.OnClickListener eScissorsOnClick = new View.OnClickListener() {
        public void onClick(View v) {
            //決定腦出拳
            int iPlay=(int)(Math.random()*3+1);

            // 1-剪刀 2-石頭 3-布.
            if(iPlay==1) {
                mAnswer.setImageResource(R.drawable.scissors);
                mSentence.setText(getString(R.string.Sentence)+
                        getString(R.string.player_draw));
            }
            else if(iPlay==2) {
                mAnswer.setImageResource(R.drawable.stone);
                mSentence.setText(getString(R.string.Sentence)+
                        getString(R.string.u_lose));
            }
            else {
                mAnswer.setImageResource(R.drawable.paper);
                mSentence.setText(getString(R.string.Sentence)+
                        getString(R.string.u_win));
            }
        }
    };

    private View.OnClickListener eStoneOnClick = new View.OnClickListener() {
        public void onClick(View v) {
            //決定腦出拳
            int iPlay=(int)(Math.random()*3+1);

            // 1-剪刀 2-石頭 3-布.
            if(iPlay==1) {
                mAnswer.setImageResource(R.drawable.scissors);
                mSentence.setText(getString(R.string.Sentence)+
                        getString(R.string.u_win));
            }
            else if(iPlay==2) {
                mAnswer.setImageResource(R.drawable.stone);
                mSentence.setText(getString(R.string.Sentence)+
                        getString(R.string.player_draw));
            }
            else {
                mAnswer.setImageResource(R.drawable.paper);
                mSentence.setText(getString(R.string.Sentence)+
                        getString(R.string.u_lose));
            }
        }
    };

    private View.OnClickListener eClothOnClick = new View.OnClickListener() {
        public void onClick(View v) {
            //決定腦出拳
            int iPlay=(int)(Math.random()*3+1);

            // 1-剪刀 2-石頭 3-布.
            if(iPlay==1) {
                mAnswer.setImageResource(R.drawable.scissors);
                mSentence.setText(getString(R.string.Sentence)+
                        getString(R.string.u_lose));
            }
            else if(iPlay==2) {
                mAnswer.setImageResource(R.drawable.stone);
                mSentence.setText(getString(R.string.Sentence)+
                        getString(R.string.u_win));
            }
            else {
                mAnswer.setImageResource(R.drawable.paper);
                mSentence.setText(getString(R.string.Sentence)+
                        getString(R.string.player_draw));
            }
        }
    };
}
