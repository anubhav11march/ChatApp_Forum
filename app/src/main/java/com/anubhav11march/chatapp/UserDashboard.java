package com.anubhav11march.chatapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class UserDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_dashboard);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "No action added yet", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


    }

    public void gotoChat(View view){
        Intent intent = new Intent(UserDashboard.this,MainActivity.class);
        startActivity(intent);
    }

    public void logout(View view){
        Intent intentt = new Intent(UserDashboard.this, Register.class);
        startActivity(intentt);
    }
    
    public void feedback(View view){
        Snackbar.make(view, "No action added yet", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }
}
