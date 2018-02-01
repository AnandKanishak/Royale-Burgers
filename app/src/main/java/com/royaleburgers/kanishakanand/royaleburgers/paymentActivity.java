package com.royaleburgers.kanishakanand.royaleburgers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
    }

    public void ThankYou(View view){
        Intent intent = new Intent(this, thankyouActivity.class);
        startActivity(intent);
    }
}

