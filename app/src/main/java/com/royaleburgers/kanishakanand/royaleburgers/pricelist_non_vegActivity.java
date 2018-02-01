package com.royaleburgers.kanishakanand.royaleburgers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class pricelist_non_vegActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pricelist_non_veg);
    }

    public void backTonon_veg(View view){
        Intent intent = new Intent(this, Non_VegActivity.class);
        startActivity(intent);
    }

}





