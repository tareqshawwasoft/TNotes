package com.example.tnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;

import com.moos.library.CircleProgressView;



    public class ProgressBar extends AppCompatActivity {

        CountDownTimer countDownTimer;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_progress_bar);
            toNotes();
            final CircleProgressView circleProgressView = (CircleProgressView) findViewById(R.id.progressView_circle);

            circleProgressView.setStartProgress(0);

            circleProgressView.setStartColor(Color.parseColor("#660066"));//purple
            circleProgressView.setEndColor(Color.parseColor("#CC00CC"));//light purple
            circleProgressView.setCircleBroken(true);
            circleProgressView.setTrackWidth(20);
            circleProgressView.setProgressDuration(3000);
            circleProgressView.setEndProgress(100);
            circleProgressView.setTrackEnabled(true);
            circleProgressView.setFillEnabled(false);
            circleProgressView.startProgressAnimation();


            countDownTimer= new CountDownTimer(3020,1000) {
                @Override
                public void onTick(long millisUntilFinished) {

                }
                @Override
                public void onFinish() {


                    toNotes();
                }
            };
            countDownTimer.start();

        }
        public void toNotes(){
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
            this.finish();
        }
    }