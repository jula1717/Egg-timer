package com.example.eggtimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    SeekBar timerBar;
    ImageView imgEgg;
    TextView txtTimer;
    Button btnStart,btnStop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timerBar = (SeekBar) findViewById(R.id.timeBar);
        imgEgg = (ImageView) findViewById(R.id.imgEgg);
        txtTimer = (TextView) findViewById(R.id.txtTimer);
        btnStart = (Button) findViewById(R.id.btnStart);
        btnStop = (Button) findViewById(R.id.btnStop);
        imgEgg.setImageResource(R.drawable.egg);
        timerBar.setMax(300);
        timerBar.setProgress(0);
        timerBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int minutes = (int) i/60;
                int seconds = i%60;
                String sSeconds=seconds<10?"0" + Integer.toString(seconds):Integer.toString(seconds);
                txtTimer.setText(Integer.toString(minutes)+":"+sSeconds);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


//        btnStart.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                new CountDownTimer(10000,1000)
//                {
//
//                    @Override
//                    public void onTick(long l) {
//                        //countdown is counting down (every second - first argument)
//                        System.out.println("Seconds left: "+String.valueOf(l/1000));
//                    }
//
//                    @Override
//                    public void onFinish() {
//                        //counter is finished! (after 10 seconds - second argment)
//                        System.out.println("Countdown timer finished");
//
//                    }
//                }.start();
//            }
//        });


    }
}