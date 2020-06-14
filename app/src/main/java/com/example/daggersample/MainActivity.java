package com.example.daggersample;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.daggersample.databinding.ActivityMainBinding;
import com.example.subapp1.SubApp1Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.text2.setText(getResources().getText(R.string.common_string));
        binding.button.setOnClickListener(v -> goSubApp1Activity());
    }

    private void goSubApp1Activity() {
        Intent intent = new Intent(this, SubApp1Activity.class);
        startActivity(intent);
    }
}
