package com.example.recipebuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HomePageActivity extends AppCompatActivity {

    ImageButton addRecipe;
    ImageButton goToFeed;
    ImageButton goToProfile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        addRecipe = findViewById(R.id.addRecipe);
        goToFeed = findViewById(R.id.feed);
        goToProfile = findViewById(R.id.profile);

        final Intent homePageIntent = new Intent(this, HomePageActivity.class);
        final Intent feedActivityIntent = new Intent(this, FeedActivity.class);
        final Intent createRecipeIntent = new Intent(this, CreateRecipe.class);

        addRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // check if username is not taken
                //check if password is strong?
                startActivity(createRecipeIntent);
            }
        });

        goToFeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // check if username is not taken
                //check if password is strong?
                startActivity(feedActivityIntent);
            }
        });

        goToProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // check if username is not taken
                //check if password is strong?
                startActivity(homePageIntent);
            }
        });


    }
}