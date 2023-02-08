package com.improve10x.algorithamactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class TestingActivity extends AppCompatActivity {
    Button sumBtn;
    SeekBar seekBar;
    SeekBar seekBar1;
    TextView resultTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing);
        handleInitview();
        handlesumBtn();
    }




    private void handlesumBtn() {
        sumBtn.setOnClickListener(view -> {
            int progress1 = seekBar.getProgress();
            int progress2 = seekBar1.getProgress();
            String progress = sumIsLessThan100(progress1 , progress2);
            resultTxt.setText(progress);
        });
    }

    private String sumIsLessThan100(int input1, int input2) {
        boolean result = false;
        if (input1+input2<100) {
            result = true;
        }
        return result + "";
        }

    public void handleInitview(){
        sumBtn = findViewById(R.id.sum_btn);
        seekBar = findViewById(R.id.seek_bar);
        seekBar1 = findViewById(R.id.seek1_bar);
        resultTxt = findViewById(R.id.result_txt);
    }

    @Override
    protected void onPause() {
        super.onPause();
        seekBar.setProgress(0);
        seekBar1.setProgress(0);
        resultTxt.setText("");
    }
}