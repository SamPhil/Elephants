package com.example.dietr2sa.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the login button */
    public void Login(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, LogActivity.class);
        EditText pwField = (EditText) findViewById(R.id.passwordField);
        EditText emailField = (EditText) findViewById(R.id.emailField);
        String message = "Welcome: " + emailField.getText().toString() + " Your password is: " + pwField.getText().toString();;
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }



}
