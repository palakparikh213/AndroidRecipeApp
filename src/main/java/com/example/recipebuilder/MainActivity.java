package com.example.recipebuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginButton;
    Button createNewAccountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);

        final Intent createNewAccountIntent = new Intent(this, CreateNewAccountActivity.class);
        final Intent homePageIntent = new Intent(this, HomePageActivity.class);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // if login successful
                startActivity(homePageIntent);
            }
        });

        createNewAccountButton = findViewById(R.id.createNewAccount);

        createNewAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //change scene to create new login
                startActivity(createNewAccountIntent);
            }
        });

    }
}