package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private Button Signin;
    private EditText Username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username = findViewById(R.id.myUsername);
        Signin = findViewById(R.id.myButton);
        Signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>", "MainActivity button pressed");
                Log.d("==>", "Username"+Username.getText().toString());



                Intent intent = new Intent(MainActivity.this,ProfileActivity.class);
                startActivity(intent);

                intent.putExtra("Username",Username.getText().toString());
                startActivity(intent);
            }
        });
    }



    public MainActivity() {
        super();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("==>", "MainActivity Resumeed");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("==>", "MainActivity Started");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("==>", "MainActivity stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("==>", "MainActivity destroyed");
    }


    }

