package com.mobileappscompany.training.debug1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tV;
    EditText etN1, etN2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tV = (TextView) findViewById(R.id.textView);
        etN1 = (EditText) findViewById(R.id.eTN1);
        etN2 = (EditText) findViewById(R.id.eTN2);

    }

    public void onClick(View v) {
        FTMath ftM = new FTMath();
        int n1, n2, r;
        switch (v.getId()){
            case R.id.btnAdd:
                n1 =  Integer.valueOf( etN1.getText().toString());
                n2 =  Integer.valueOf( etN2.getText().toString());
                r = ftM.addEm(n1, n2);
                tV.setText(String.valueOf(r));

                break;
            case R.id.btnSubstract:
                n1 =  Integer.valueOf( etN1.getText().toString());
                n2 =  Integer.valueOf( etN2.getText().toString());
                r = ftM.substractEm(n1, n2);
                tV.setText(String.valueOf(r));


                break;
            case R.id.btnMuliply:
                n1 =  Integer.valueOf( etN1.getText().toString());
                n2 =  Integer.valueOf( etN2.getText().toString());
                r = ftM.multEm(n1, n2);
                tV.setText(String.valueOf(r));

                break;
            case R.id.btnDivide:
                Intent i = new Intent(this, LoginActivity.class);
                startActivity(i);
                break;

        }
    }
}
