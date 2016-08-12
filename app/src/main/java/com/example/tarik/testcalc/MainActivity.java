package com.example.tarik.testcalc;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvTesult;
    Button btPlus;
    int firstValue = 0;
    int secondValue = 0;
    boolean inPlusMode = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }
    private void initUI(){
        tvTesult = (TextView) findViewById(R.id.tv_result);
        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
        findViewById(R.id.btn3).setOnClickListener(this);
        findViewById(R.id.btn4).setOnClickListener(this);
        findViewById(R.id.btn5).setOnClickListener(this);
        findViewById(R.id.btn6).setOnClickListener(this);
        findViewById(R.id.btn7).setOnClickListener(this);
        findViewById(R.id.btn8).setOnClickListener(this);
        findViewById(R.id.btn9).setOnClickListener(this);
        btPlus = (Button) findViewById(R.id.btn_plus);
        btPlus.setOnClickListener(this);
        findViewById(R.id.delete).setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View view) {
                tvTesult.setText("0");
                return false;
            }
        });

    }
    @Override
    public void onClick(View view) {
        String result = tvTesult.getText().toString();
        if(result.equals("0")){
            result = "";
        }
        switch (view.getId()){

            case R.id.btn1:
                result = result+"1";
                tvTesult.setText(result);
                break;

            case R.id.btn2:
                result = result+"2";
                tvTesult.setText(result);
                break;

            case R.id.btn3:
                result = result+"3";
                tvTesult.setText(result);
                break;

            case R.id.btn4:
                result = result+"4";
                tvTesult.setText(result);
                break;

            case R.id.btn5:
                result = result+"5";
                tvTesult.setText(result);
                break;

            case R.id.btn6:
                result = result+"6";
                tvTesult.setText(result);
                break;

            case R.id.btn7:
                result = result+"7";
                tvTesult.setText(result);
                break;

            case R.id.btn8:
                result = result+"8";
                tvTesult.setText(result);
                break;

            case R.id.btn9:
                result = result+"9";
                tvTesult.setText(result);
                break;

            case R.id.btn_plus:

               if(inPlusMode == false){
                   firstValue = Integer.parseInt(tvTesult.getText().toString());
                   tvTesult.setText("0");
                   btPlus.setText("=");
                   inPlusMode = true;
               }
                else{
                   secondValue = Integer.parseInt(tvTesult.getText().toString());
                   tvTesult.setText(String.valueOf(firstValue+secondValue));
                   btPlus.setText("+");
                   inPlusMode = false;
               }

        }

    }
}
