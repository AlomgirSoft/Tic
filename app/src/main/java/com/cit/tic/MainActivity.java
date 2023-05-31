package com.cit.tic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import com.cit.tic.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.getStartBtn.setOnClickListener(v->{

            startActivity(new Intent(getApplicationContext(),MainActivityKotlin.class));


        });



    }
}