package com.example.recipebuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateNewAccountActivity extends AppCompatActivity {

    EditText username;
    EditText firstName;
    EditText lastName;
    EditText password;
    EditText confirmPassword;

    Button createNewAccountConfirm;
    Button goBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_account);

        username = findViewById(R.id.usernameNew);
        password = findViewById(R.id.passwordNew);
        confirmPassword = findViewById(R.id.confirmPassword);
        createNewAccountConfirm = findViewById(R.id.confirmNewAccount);

        final Intent homePageIntent = new Intent(this, HomePageActivity.class);
        final Intent mainActivityIntent = new Intent(this, MainActivity.class);

        createNewAccountConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // check if username is not taken
                //check if password is strong?
                startActivity(homePageIntent);
            }
        });

        goBack = findViewById(R.id.goBack);

        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //goes back to login screen
                startActivity(mainActivityIntent);
            }
        });

    }


}