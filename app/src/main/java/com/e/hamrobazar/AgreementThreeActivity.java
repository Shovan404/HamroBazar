package com.e.hamrobazar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AgreementThreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agreement_three);
        getSupportActionBar().setTitle("Rules for Posting Ad");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
