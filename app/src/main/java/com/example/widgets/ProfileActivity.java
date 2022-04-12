package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
    private Button Signout;
    private TextView UsernameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Signout = findViewById(R.id.myButton_Signout);
        UsernameView = findViewById(R.id.myUsernameView);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String username = extras.getString("Username");

        UsernameView.setText(username);


        Signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>", "ProfileActivity button pressed");
                finish();

            }
        });
    }
        @Override
        protected void onPostResume() {
            super.onPostResume();
            Log.d("==>", "ProfileActivity Resumeed");
        }

        @Override
        protected void onStart() {
            super.onStart();
            Log.d("==>", "ProfileActivity Started");
        }

        @Override
        protected void onStop() {
            super.onStop();
            Log.d("==>", "ProfileActivity stopped");
        }

        @Override
        protected void onDestroy() {
            super.onDestroy();
            Log.d("==>", "ProfileActivity destroyed");
        }
    }
