package com.example.daggersample.sub;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.daggersample.databinding.ActivityMainSubBinding;

public class MainSubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainSubBinding binding = ActivityMainSubBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.button.setOnClickListener(v -> {
            setResult(RESULT_OK);
            finish();
        });
    }

    @Override
    public void onBackPressed() {
        setResult(RESULT_CANCELED);
        super.onBackPressed();
    }
}
