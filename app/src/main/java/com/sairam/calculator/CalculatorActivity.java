package com.sairam.calculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {

    private Context context = CalculatorActivity.this;

    private EditText etnumone, etnumtwo, etresult;

    private Button btadd, btsub, btmul, btdiv, btreset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        etnumone = findViewById(R.id.et_numone);

        etnumtwo = findViewById(R.id.et_numtwo);

        etresult = findViewById(R.id.et_result);

        btadd = findViewById(R.id.bt_add);
        btadd.setOnClickListener(this);

        btsub = findViewById(R.id.bt_sub);
        btsub.setOnClickListener(this);

        btmul = findViewById(R.id.bt_mul);
        btmul.setOnClickListener(this);

        btdiv = findViewById(R.id.bt_div);
        btdiv.setOnClickListener(this);

        btreset = findViewById(R.id.bt_reset);
        btreset.setOnClickListener(this);
    }

    private void showToast(String message){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_add:
                if(etnumone.getText().length() == 0){
                    showToast("Please enter value one");
                    return;
                }

                if(etnumtwo.getText().length() == 0){
                    showToast("Please enter value two");
                    return;
                }

                double a = Double.parseDouble(etnumone.getText().toString());
                double b = Double.parseDouble(etnumtwo.getText().toString());
                double c = a+b;
                etresult.setText(String.valueOf(c));

                break;
            case R.id.bt_sub:
                if(etnumone.getText().length() == 0){
                    showToast("Please enter value one");
                    return;
                }

                if(etnumtwo.getText().length() == 0){
                    showToast("Please enter value two");
                    return;
                }

                double d = Double.parseDouble(etnumone.getText().toString());
                double e = Double.parseDouble(etnumtwo.getText().toString());
                double f = d-e;
                etresult.setText(String.valueOf(f));


                break;
            case R.id.bt_mul:
                if(etnumone.getText().length() == 0){
                    showToast("Please enter value one");
                    return;
                }

                if(etnumtwo.getText().length() == 0){
                    showToast("Please enter value two");
                    return;
                }

                double g = Double.parseDouble(etnumone.getText().toString());
                double h = Double.parseDouble(etnumtwo.getText().toString());
                double i = g*h;
                etresult.setText(String.valueOf(i));

                break;
            case R.id.bt_div:
                if(etnumone.getText().length() == 0){
                    showToast("Please enter value one");
                    return;
                }

                if(etnumtwo.getText().length() == 0){
                    showToast("Please enter value two");
                    return;
                }

                double j = Double.parseDouble(etnumone.getText().toString());
                double k = Double.parseDouble(etnumtwo.getText().toString());
                double l = j/k;
                etresult.setText(String.valueOf(l));

                break;
            case R.id.bt_reset:
                etnumone.setText("");
                etnumone.requestFocus();
                etnumtwo.setText("");
                etresult.setText("");
                break;
        }
    }
}
