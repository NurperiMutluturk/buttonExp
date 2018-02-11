package com.example.pc.buttonsexperiment;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton tb1, tb2;
    private Button btnDsply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();
    }

    public void addListenerOnButton() {

        tb1 = (ToggleButton) findViewById(R.id.tb1);
        tb2 = (ToggleButton) findViewById(R.id.tb2);
        btnDsply = (Button) findViewById(R.id.btnDsply);

        btnDsply.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer result = new StringBuffer();

                result.append("toggleButton1: ").append(tb1.getText());
                result.append("toggleButton2: ").append(tb2.getText());

                Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
