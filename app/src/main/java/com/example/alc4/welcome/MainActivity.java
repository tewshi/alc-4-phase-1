package com.example.alc4.welcome;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button about = findViewById(R.id.btAbout);
        about.setOnClickListener(this);

        Button profile = findViewById(R.id.btProfile);
        profile.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.btAbout:
                intent = new Intent(this, AboutALCActivity.class);
                startActivity(intent);
                break;
            case R.id.btProfile:
                intent = new Intent(this, MyProfileActivity.class);
                startActivity(intent);
                break;
        }
    }
}
