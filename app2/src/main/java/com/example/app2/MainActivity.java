package com.example.app2;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app2.databinding.ActivityMainBinding;
import com.example.subapp2.SubApp2Activity;
import com.example.subapp3.SubApp3Activity;
import com.example.subapp4.SubApp4Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.text2.setText(getResources().getText(R.string.common_string));
        binding.button.setOnClickListener(v -> goSubApp2Activity());
        binding.button2.setOnClickListener(v -> goSubApp3Activity());
        binding.button3.setOnClickListener(v -> goSubApp4Activity());
    }

    private void goSubApp2Activity() {
        Intent intent = new Intent(this, SubApp2Activity.class);
        startActivity(intent);
    }

    private void goSubApp3Activity() {
        Intent intent = new Intent(this, SubApp3Activity.class);
        startActivity(intent);
    }

    private void goSubApp4Activity() {
        Intent intent = new Intent(this, SubApp4Activity.class);
        startActivity(intent);
    }
}
