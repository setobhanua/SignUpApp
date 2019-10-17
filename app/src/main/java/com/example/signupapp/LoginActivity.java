package com.example.signupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnJoin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button Signup = findViewById(R.id.btnJoin);
        Signup.setOnClickListener(this);
    }
    @Override
    public void onClick (View v) {
        switch (v.getId()){
            case R.id.btnJoin:
                Intent Seto = new Intent( LoginActivity.this, MainActivity.class);
                startActivity(Seto);
                break;
        }
    }
}
