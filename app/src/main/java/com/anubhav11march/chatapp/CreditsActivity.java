package com.anubhav11march.chatapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CreditsActivity extends AppCompatActivity {

    TextView tv, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

        tv = findViewById(R.id.textView);
        tv2 = findViewById(R.id.textView2);
        Button b = findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("This is a temporary message");
                tv2.setText("This message would not be shown when the user clicks on anything");
                tv.setText("This is a temporary message");
                tv2.setText("This message would not be shown when the user clicks on anything");
                tv.setText("This is a temporary message");
                tv2.setText("This message would not be shown when the user clicks on anything");
                tv.setText("This is a temporary message");
                tv2.setText("This message would not be shown when the user clicks on anything");
                tv.setText("This is a temporary message");
                tv2.setText("This message would not be shown when the user clicks on anything");
                tv.setText("This is a temporary message");
                tv2.setText("This message would not be shown when the user clicks on anything");
                tv.setText("This is a temporary message");
                tv2.setText("This message would not be shown when the user clicks on anything");
                tv.setText("This is a temporary message");
                tv2.setText("This message would not be shown when the user clicks on anything");
                tv.setText("This is a temporary message");
                tv2.setText("This message would not be shown when the user clicks on anything");
                tv.setText("This is a temporary message");
                tv2.setText("This message would not be shown when the user clicks on anything");


            }
        });
    }
}
