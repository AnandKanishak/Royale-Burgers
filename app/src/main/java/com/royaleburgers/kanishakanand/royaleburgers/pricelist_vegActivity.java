package com.royaleburgers.kanishakanand.royaleburgers;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class pricelist_vegActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pricelist_veg);
    }

    public void backToveg(View view){
        Intent intent = new Intent(this, veg.class);
        startActivity(intent);
    }

}



